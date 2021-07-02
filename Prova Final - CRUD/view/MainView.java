/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package view;

import java.util.*;
import bo.*;
import controller.*;

public class MainView {
	
/* CREATE */
	// CREATE - JOGO
	public void createJ() {
		Scanner in = new Scanner(System.in);
		Jogo jogo = new Jogo();
		
		System.out.println("Digite o ID_JG:");
		jogo.setId_jg(in.next());
		
		System.out.println("Digite o NOME do jogo:");
		jogo.setNome(in.next());
		
		System.out.println("Digite o GÊNERO do jogo:");
		jogo.setGenero(in.next());
		
		JogoController control = new JogoController();
		control.createJ(jogo);
	}
	
	// CREATE - LOJA
	public void createL() {
		Scanner in = new Scanner(System.in);
		Loja loja = new Loja();
		
		System.out.println("Digite o ID_LJ:");
		loja.setId_lj(in.next());
		
		System.out.println("Digite o NOME da loja:");
		loja.setNome(in.next());
		
		System.out.println("Digite o TIPO da loja:");
		loja.setTipo(in.next());
		
		LojaController control = new LojaController();
		control.createL(loja);
	}
	
	// CREATE - CONTROLE
		public void createC() {
			Scanner in = new Scanner(System.in);
			Controle controle = new Controle();
			
			System.out.println("Digite o ID_C:");
			controle.setId_c(in.next());
			
			System.out.println("Digite o PRECO do produto:");
			controle.setPreco(in.next());
			
			System.out.println("Digite o ID_JG do jogo:");
			controle.setId_jg(in.next());
			
			System.out.println("Digite o ID_LJ da loja:");
			controle.setId_lj(in.next());
			
			ControleController control = new ControleController();
			control.createC(controle);
		}
		
/* UPDATE */	
	// UPDATE - JOGO
	public void updateJ() {
		Scanner in = new Scanner(System.in);
		Jogo jogo = new Jogo();
		
		System.out.println("Digite o ID_JG a ser atualizado:");
		jogo.setId_jg(in.next());
		
		System.out.println("Novo NOME do jogo:");
		jogo.setNome(in.next());
		
		System.out.println("Novo GENERO do jogo:");
		jogo.setGenero(in.next());
		
		JogoController control = new JogoController();
		control.updateJ(jogo);
	}
	
	// UPDATE - LOJA
			public void updateL() {
				Scanner in = new Scanner(System.in);
				Loja loja = new Loja();
				
				System.out.println("Digite o ID_LJ a ser atualizado:");
				loja.setId_lj(in.next());
				
				System.out.println("Novo NOME da loja:");
				loja.setNome(in.next());
				
				System.out.println("Novo TIPO da loja:");
				loja.setTipo(in.next());
				
				LojaController control = new LojaController();
				control.updateL(loja);
			}
			
	// UPDATE - CONTROLE
	public void updateC() {
		Scanner in = new Scanner(System.in);
		Controle controle = new Controle();
		
		System.out.println("Digite o ID_C do controle:");
		controle.setId_c(in.next());
		
		System.out.println("Digite o ID_JG do jogo:");
		controle.setId_jg(in.next());
		
		System.out.println("Digite o ID_LJ da loja:");
		controle.setId_lj(in.next());
		
		System.out.println("Novo PRECO do produto:");
		controle.setPreco(in.next());
		
		ControleController control = new ControleController();
		control.updateC(controle);
	}
	
/* DELETE */
	// DELETE - JOGO
	public void deleteJ() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o ID_JG do jogo a ser deletado:");
		String id = in.next();
		
		JogoController control = new JogoController();
		control.deleteJ(id);
	}
	
	// DELETE - LOJA
	public void deleteL() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o ID_LJ da loja a ser deletada:");
		String id = in.next();
		
		LojaController control = new LojaController();
		control.deleteL(id);
	}
	
	// DELETE - CONTROLE
	public void deleteC() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o ID_C do controle a ser deletado:");
		String id = in.next();
		
		ControleController control = new ControleController();
		control.deleteC(id);
	}

	// MAIN
	public static void main(String[] args) {
		MainView crud = new MainView();
		
		System.out.println("ACAO DO CRUD:");
		Scanner in = new Scanner(System.in);
		String r = in.next();
		
		switch(r.toLowerCase()) {
		// CREATE
		case "c1": crud.createJ(); break;
		
		case "c2": crud.createL(); break;
		
		case "c3": crud.createC(); break;
		
		// UPDATE
		case "u1": crud.updateJ(); break;
		
		case "u2": crud.updateL(); break;
		
		case "u3": crud.updateC(); break;
		
		// DELETE
		case "d1": crud.deleteJ(); break;
		
		case "d2": crud.deleteL(); break;
		
		case "d3": crud.deleteC(); break;
		
		default: System.out.println("INVÁLIDO"); break;
		}
	}
	
}