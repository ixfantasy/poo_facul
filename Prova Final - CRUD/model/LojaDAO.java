/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bo.*;
import jdbc.ConnectionFactory;

public class LojaDAO {
	
	// CREATE
	public void createL(Loja loja) {
		Connection db = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		
		// SQL - INSERT
		try {
			String sql = "INSERT INTO loja(id_lj, nome, tipo) values (?, ?, ?)";
			stm = db.prepareStatement(sql);
			
			// Populando a query
			stm.setString(1,  loja.getId_lj());
			stm.setString(2, loja.getNome());
			stm.setString(3, loja.getTipo());
			
			stm.executeUpdate();
			System.out.println("LOJA INCLUIDA COM SUCESSO!");
		} catch(SQLException e) {
			System.out.println("ERRO AO TENTAR INCLUIR LOJA!");
		} finally {
			ConnectionFactory.closeConnection(db, stm);
		}
	}
		
		
	// UPDATE
	public void updateL(Loja loja) {
		Connection db = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		
		// SQL - UPDATE
		try {
			String sql = "UPDATE loja SET nome=?, tipo=? WHERE id_lj=?";
			stm = db.prepareStatement(sql);
			
			stm.setString(1, loja.getNome());
			stm.setString(2, loja.getTipo());
			stm.setString(3,  loja.getId_lj());
			
			stm.executeUpdate();
			System.out.println("LOJA ATUALIZADA COM SUCESSO!");
		} catch(SQLException e) {
			System.out.println("ERRO AO TENTAR ATUALIZAR LOJA!");
		} finally {
			ConnectionFactory.closeConnection(db, stm);
		}
	}
	
	// DELETE
	public void deleteL(String id) {
		Connection db = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		
		try {
			String sql1 = "DELETE FROM controle WHERE id_lj=?";
			stm = db.prepareStatement(sql1);
			
			stm.setString(1,  id);
			stm.executeUpdate();
			stm.close();
			
			String sql = "DELETE FROM loja WHERE id_lj=?";
			stm = db.prepareStatement(sql);
			
			stm.setString(1, id);
			stm.executeUpdate();
			System.out.println("LOJA DELETADA COM SUCESSO!");
		} catch(SQLException e) {
			System.out.println("ERRO AO TENTAR DELETAR LOJA!");
		} finally {
			ConnectionFactory.closeConnection(db, stm);
		}
	}
	
	
	// READ
	public List<Loja> readL(){
		List<Loja> lista = new ArrayList<Loja>();
		
		Connection db = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM loja";
		
		try {
			stm = db.prepareStatement(sql);
			rs = stm.executeQuery();
			
			while(rs.next()) {
				Loja loja = new Loja();
				
				loja.setId_lj(rs.getString(1));
				loja.setNome(rs.getString(2));
				loja.setTipo(rs.getString(3));
				
				lista.add(loja);
			}
		} catch(SQLException e) {
			System.out.println("ERRO AO LER LISTA!");
		} finally {
			ConnectionFactory.closeConnection(db, stm);
		}
		
		return lista;
		
	}

}
