package entidades;

public class Circulo extends Forma {

    private Double raio;

    public Circulo(){
        raio = 0.0;
    }

    @Override
    public Double getArea(){
        return Math.PI * raio * raio;
    }

    public Circulo(Double raio) {
        super();
        this.raio = raio;
    }

    // exercício
    public void setRaio(Double raio){
        this.raio = raio;
    }
}