/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

package questao2;

public class IAndroidTester {

    public static void main(String[] args){

        IAndroid celular = new IAndroid();

        celular.mostrar_marca();
        
        celular.ligar();

        celular.desligar();
    }
}