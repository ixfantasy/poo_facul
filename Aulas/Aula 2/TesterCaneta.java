public class TesterCaneta {
    
    public static void main(String[] args){

        Caneta caneta = new Caneta("Nath");

        /* caneta.cor = "azul";

        caneta.modelo = "escrita fina"; */

        caneta.imprimir();

        caneta.setModelo("Escrita fina");
        caneta.setCor("verde");

        caneta.imprimir();

        System.out.println("Usuario Modelo = " + caneta.getModelo());

        

    }
}
