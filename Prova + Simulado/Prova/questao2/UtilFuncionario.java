/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

package questao2;

import java.util.*;

public class UtilFuncionario {

    public void ordem(ArrayList<Funcionario> lista){

        // antes de ordenar a lista
        System.out.println("LISTA ANTES DE ORDENAR: ");
        for(Funcionario func : lista){
            System.out.println(func);
        }


        /* ORDENANDO LISTA DO MENOR PARA O MAIOR SALÁRIO - MÉTODO SORT */
        Collections.sort(lista, new Comparator<Funcionario>() {

            public int compare(Funcionario f1, Funcionario f2){
                return Double.compare(f1.calculaSalario(), f2.calculaSalario());
            }
        });


        // lista ordenada - crescente
        System.out.println("\nLISTA DEPOIS DE ORDENAR - CRESCENTE: ");
        for(Funcionario func : lista){
            System.out.println(func);
        }

        /* INVERTENDO A ORDEM DA LISTA PARA DECRESCENTE */
        Collections.reverse(lista);

        
        // lista ordenada - decrescente
        System.out.println("\nLISTA DEPOIS DE ORDENAR - DECRESCENTE: ");
        for(Funcionario func : lista){
            System.out.println(func);
        }
    } 
}