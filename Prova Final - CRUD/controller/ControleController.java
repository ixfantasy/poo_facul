/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package controller;

import java.util.ArrayList;
import java.util.List;

import bo.*;
import model.*;

public class ControleController {
	
	// CREATE
	public void createC(Controle controle) {
		ControleDAO model = new ControleDAO();
		model.createC(controle);
	}
	
	// UPDATE
	public void updateC(Controle controle) {
		ControleDAO model = new ControleDAO();
		model.updateC(controle);
	}

	// DELETE
	public void deleteC(String id) {
		ControleDAO model = new ControleDAO();
		model.deleteC(id);
	}
	
	// READ
	public List<Controle> readC(){
		
		List<Controle> lista = new ArrayList<Controle>();
		
		try {
			ControleDAO model = new ControleDAO();
			lista = model.readC();
		} catch(Exception e) {
			System.out.println("ERRO - CONTROLLER READ!");
		}
		
		return lista;
	}
}
