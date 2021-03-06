/* Nome: Nath?lia Fortunato & Jorbe Junior
 Matr?cula: 0050016724 // 0050016533
 */

package jdbc;

import java.sql.*;

public class TesteBanco {

	public static void main(String[] args){
		try {
			Connection banco = ConnectionFactory.getConnection();
			System.out.println("Conexao OK!!!!");
			
			createNewTable(banco);
			// readTableTest(banco);
		} catch(Exception e){
			System.out.println("Erro na Conex?o.");
			System.out.println(e);
		}
	}
	
	
	public static void createNewTable(Connection banco){
        // SQL - CRIAR TABELA
        String sql = "CREATE TABLE IF NOT EXISTS aluno (\n"
                + "	matricula varchar(10) NOT NULL ,\n"
                + "	nome varchar(50) NOT NULL,\n"
                + "	cidade varchar(50) NOT NULL\n"
                + ");";
        
        try {
        	Statement stmt = banco.createStatement();
            
        	// Criar nova tabela
            stmt.execute(sql);
			System.out.println("Tabela criada!!!");
		} catch(Exception e){
			System.out.println("Erro criando tabela...");
			System.out.println(e);
		}
    }


	public static void readTableTest(Connection banco) {
        // SQL - SELECT
        String sql = "select * from aluno;";
        
        PreparedStatement stmt = null;
		ResultSet rs = null;
		
		//String sql = "SELECT * FROM db_aula_prog_java.aluno";
		
		try {
			stmt = banco.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				System.out.println("Com registro");
			} else {
				System.out.println("Sem registro");
			}
		} catch(SQLException e){
			System.out.println("<DAO> Erro lendo banco");
		} finally {
			ConnectionFactory.closeConnection(banco, stmt);
		} 
    }
}