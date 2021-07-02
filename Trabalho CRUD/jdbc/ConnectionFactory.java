/* Nome: Nathália Fortunato & Jorbe Junior
 Matrícula: 0050016724 // 0050016533
 */

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String DRIVE = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/aulapoo"; 
    private static final String USER = "root"; 
    private static final String SENHA = "7654321";
	
	
	public static Connection getConnection(){
        try {
        	//Class.forName(DRIVE);  // opcional, dependendo da versão
        	
            return DriverManager.getConnection(URL, USER, SENHA);      
        } catch (SQLException e){
            throw new RuntimeException(e.getMessage(), e);
        }
	}

	
	public static void closeConnection(Connection con){
		if(con != null){
			try {
				con.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public static void closeConnection(Connection con, PreparedStatement stmt){
		closeConnection(con);
		
		if(stmt != null){
			try {
				stmt.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
}