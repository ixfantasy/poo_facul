/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package jdbc;

import java.sql.*; 

public class TesteBanco {

	public static void main(String[] args) {
		try {
			Connection db = ConnectionFactory.getConnection();
			System.out.println("CONEXAO ESTABELECIDA!");
		} catch(Exception e) {
			System.out.println("ERRO NA CONEXAO!");
			System.out.println(e);
		}
	}
}