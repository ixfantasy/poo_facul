public class TestarCarro {
    
    public static void main(String[] args){
        Bmw carr = new Bmw();

        carr.setCor("Preto");
        carr.setNum_assentos(4);
        carr.setVelocidade(350);

        carr.imprimir();
    }
}
