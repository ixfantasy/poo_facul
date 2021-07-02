/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

package questao2;

import java.util.*;

public class UtilTester {
    
    public static void main(String[] args){

        /* LISTA DE FUNCIONÁRIOS */
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();


        /* CRIANDO OS FUNCIONÁRIOS */
        FuncionarioVendedor vendedor1 = new FuncionarioVendedor("Nathalia", "123");
        FuncionarioVendedor vendedor2 = new FuncionarioVendedor("Fulano", "456");

        FuncionarioHorista horista1 = new FuncionarioHorista("Cicrano", "789");
        FuncionarioHorista horista2 = new FuncionarioHorista("Maria", "890");


        /* COMPLEMENTANDO AS INFORMAÇÕES DOS FUNCIONÁRIOS */
        // vendedor1
        vendedor1.setQuantidadeVendida(50.0);
        vendedor1.setTaxaComissao(20.0);

        // vendedor2
        vendedor2.setQuantidadeVendida(5.0);
        vendedor2.setTaxaComissao(10.0);


        // horista1
        horista1.setHorasTrabalhadas(7.0);
        horista1.setValorHora(10.0);

        // horista2
        horista2.setHorasTrabalhadas(2.0);
        horista2.setValorHora(5.0);


        /* ADICIONANDO OS FUNCIONÁRIOS DENTRO DA LISTA */
        lista.add(vendedor1);
        lista.add(vendedor2);
        lista.add(horista1);
        lista.add(horista2);


        /* UTILIZANDO A CLASSE UTIL */
        UtilFuncionario func = new UtilFuncionario();
        
        // ordenar e imprimir lista
        func.ordem(lista);
    }
}