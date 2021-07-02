public class Bmw extends Carro{
    
    private int velocidade;

    // getter + setter
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void imprimir(){
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Cor: " + getCor());
        System.out.println("Número de assentos: " + getNum_assentos());
    }
}
