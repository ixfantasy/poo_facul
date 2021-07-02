public class Caneta {

    private String modelo;
    private String cor;


    public Caneta(String nome) {
        System.out.println("Olá, " + nome + ", Objeto Caneta criado.....");
        this.cor = "azul";
        this.modelo = "Escrita grossa";
    }

    public void imprimir(){
        System.out.println("Cor = " + this.cor); // this deixa claro que está chamando um atributo interno
        System.out.println("Modelo = " + this.modelo);
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }  
}