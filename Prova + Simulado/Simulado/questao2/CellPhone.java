/* Nome: Nathália Pinto Fortunato
Matrícula: 0050016724 */

package questao2;

public abstract class CellPhone {

    private boolean ligado;

    public void ligar(){
        if(ligado == true){
            System.out.println("O celular já está ligado.");
        }
        else {
            ligado = true;
            System.out.println("Ligou o celular.");
        }
    }

    public void desligar(){
        if(ligado == false){
            System.out.println("O celular já está desligado.");
        }
        else {
            ligado = false;
            System.out.println("Desligou o celular.");
        }

    }

    public abstract void mostrar_marca();
}