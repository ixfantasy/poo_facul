/* Nome: Nathalia Fortunato & Jorbe Junior
 *  Matrícula: 0050016724 // 0050016533
 */

package controller;

import java.util.ArrayList;
import java.util.List;

import bo.*;
import model.*;

public class LojaController {
	
	// CREATE
	public void createL(Loja loja) {
		LojaDAO model = new LojaDAO();
		model.createL(loja);
	}
		
	// UPDATE
	public void updateL(Loja loja) {
		LojaDAO model = new LojaDAO();
		model.updateL(loja);
	}

	// DELETE
	public void deleteL(String id) {
		LojaDAO model = new LojaDAO();
		model.deleteL(id);
	}
	
	// READ
	public List<Loja> readL(){
		
		List<Loja> lista = new ArrayList<Loja>();
		
		try {
			LojaDAO model = new LojaDAO();
			lista = model.readL();
		} catch(Exception e) {
			System.out.println("ERRO - CONTROLLER READ!");
		}
		
		return lista;
	}
}
