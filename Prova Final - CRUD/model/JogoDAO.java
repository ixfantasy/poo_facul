/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package model;

import java.util.*;

import java.sql.*;
import bo.*;
import jdbc.ConnectionFactory;

public class JogoDAO {
	
	// CREATE
	public void createJ(Jogo jogo) {
		Connection db = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		
		// SQL - INSERT
		try {
			String sql = "INSERT INTO jogo(id_jg, nome, genero) values (?, ?, ?)";
			stm = db.prepareStatement(sql);
			
			// Populando a query
			stm.setString(1,  jogo.getId_jg());
			stm.setString(2, jogo.getNome());
			stm.setString(3, jogo.getGenero());
			
			stm.executeUpdate();
			System.out.println("JOGO INCLUIDO COM SUCESSO!");
		} catch(SQLException e) {
			System.out.println("ERRO AO TENTAR INCLUIR JOGO!");
		} finally {
			ConnectionFactory.closeConnection(db, stm);
		}
	}
	
	// UPDATE
	public void updateJ(Jogo jogo) {
		Connection db = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		
		// SQL - UPDATE
		try {
			String sql = "UPDATE jogo SET nome=?, genero=? WHERE id_jg=?";
			stm = db.prepareStatement(sql);
			
			stm.setString(1, jogo.getNome());
			stm.setString(2, jogo.getGenero());
			stm.setString(3,  jogo.getId_jg());
			
			stm.executeUpdate();
			System.out.println("JOGO ATUALIZADO COM SUCESSO!");
		} catch(SQLException e) {
			System.out.println("ERRO AO TENTAR ATUALIZAR JOGO!");
		} finally {
			ConnectionFactory.closeConnection(db, stm);
		}
	}
	
	// DELETE
	public void deleteJ(String id) {
		Connection db = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		
		try {
			String sql1 = "DELETE FROM controle WHERE id_jg=?";
			stm = db.prepareStatement(sql1);
			
			stm.setString(1,  id);
			stm.executeUpdate();
			stm.close();
			
			String sql = "DELETE FROM jogo WHERE id_jg=?";
			stm = db.prepareStatement(sql);
			
			stm.setString(1, id);
			stm.executeUpdate();
			System.out.println("JOGO DELETADO COM SUCESSO!");
		} catch(SQLException e) {
			System.out.println("ERRO AO TENTAR DELETAR JOGO!");
		} finally {
			ConnectionFactory.closeConnection(db, stm);
		}
	}
	
	// READ
	public List<Jogo> readJ(){
		List<Jogo> lista = new ArrayList<Jogo>();
		
		Connection db = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM jogo";
		
		try {
			stm = db.prepareStatement(sql);
			rs = stm.executeQuery();
			
			while(rs.next()) {
				Jogo jogo = new Jogo();
				
				jogo.setId_jg(rs.getString(1));
				jogo.setNome(rs.getString(2));
				jogo.setGenero(rs.getString(3));
				
				lista.add(jogo);
			}
		} catch(SQLException e) {
			System.out.println("ERRO AO LER LISTA!");
		} finally {
			ConnectionFactory.closeConnection(db, stm);
		}
		
		return lista;
		
	}

}