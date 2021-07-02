/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package controller;

import java.util.*;
import bo.*;
import model.*;

public class JogoController {
	
	// CREATE
	public void createJ(Jogo jogo) {
		JogoDAO model = new JogoDAO();
		model.createJ(jogo);
	}
	
	// UPDATE
	public void updateJ(Jogo jogo) {
		JogoDAO model = new JogoDAO();
		model.updateJ(jogo);
	}
	
	// DELETE
	public void deleteJ(String id) {
		JogoDAO model = new JogoDAO();
		model.deleteJ(id);
	}

	// READ
	public List<Jogo> readJ(){
		
		List<Jogo> lista = new ArrayList<Jogo>();
		
		try {
			JogoDAO model = new JogoDAO();
			lista = model.readJ();
		} catch(Exception e) {
			System.out.println("ERRO - CONTROLLER READ!");
		}
		
		return lista;
	}
}