/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

package questao3;

public class KpopTester {

    public static void main(String[] args){

        /* INSTANCIANDO CLASSE */
        KpopCantor cantor = new KpopCantor("SHINee", "Taecyeon");


        /* IMPRIMINDO AS INFORMAÇÕES */
        cantor.imprimirInfo();


        /* MUDANDO O GRUPO */
        cantor.alterarGrupo("2PM");


        /* IMPRIMINDO AS NOVAS INFORMAÇÕES */
        cantor.imprimirInfo();
    }
}