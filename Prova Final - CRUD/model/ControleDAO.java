/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bo.*;
import jdbc.ConnectionFactory;

public class ControleDAO {
	
	// CREATE
	public void createC(Controle controle) {
		Connection db = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		
		// SQL - INSERT
		try {
			String sql = "INSERT INTO controle(id_c, preco, id_jg, id_lj) values (?, ?, ?, ?)";
			stm = db.prepareStatement(sql);
			
			// Populando a query
			stm.setString(1,  controle.getId_c());
			stm.setString(2, controle.getPreco());
			stm.setString(3, controle.getId_jg());
			stm.setString(4,  controle.getId_lj());
			
			stm.executeUpdate();
			System.out.println("CONTROLE INCLUIDO COM SUCESSO!");
		} catch(SQLException e) {
			System.out.println("ERRO AO TENTAR INCLUIR CONTROLE!");
		} finally {
			ConnectionFactory.closeConnection(db, stm);
		}
	}
	
	// UPDATE
	public void updateC(Controle controle) {
		Connection db = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		
		// SQL - UPDATE
		try {
			String sql = "UPDATE controle SET preco=? WHERE id_c=? AND id_jg=? AND id_lj=?";
			stm = db.prepareStatement(sql);
			
			stm.setString(1, controle.getPreco());
			stm.setString(2, controle.getId_c());
			stm.setString(3,  controle.getId_jg());
			stm.setString(4,  controle.getId_lj());
			
			stm.executeUpdate();
			System.out.println("CONTROLE ATUALIZADO COM SUCESSO!");
		} catch(SQLException e) {
			System.out.println("ERRO AO TENTAR ATUALIZAR CONTROLE!");
		} finally {
			ConnectionFactory.closeConnection(db, stm);
		}
	}
	
	// DELETE
	public void deleteC(String id) {
		Connection db = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		
		try {
			String sql = "DELETE FROM controle WHERE id_c=?";
			stm = db.prepareStatement(sql);
			
			stm.setString(1, id);
			stm.executeUpdate();
			System.out.println("CONTROLE DELETADO COM SUCESSO!");
		} catch(SQLException e) {
			System.out.println("ERRO AO TENTAR DELETAR CONTROLE!");
		} finally {
			ConnectionFactory.closeConnection(db, stm);
		}
	}
	
	
	// READ
	public List<Controle> readC(){
		List<Controle> lista = new ArrayList<Controle>();
		
		Connection db = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM controle";
		
		try {
			stm = db.prepareStatement(sql);
			rs = stm.executeQuery();
			
			while(rs.next()) {
				Controle controle = new Controle();
				
				controle.setId_c(rs.getString(1));
				controle.setPreco(rs.getString(2));
				controle.setId_jg(rs.getString(3));
				controle.setId_lj(rs.getString(4));
				
				lista.add(controle);
			}
		} catch(SQLException e) {
			System.out.println("ERRO AO LER LISTA!");
		} finally {
			ConnectionFactory.closeConnection(db, stm);
		}
		
		return lista;
		
	}

}