package entidades;

public class Triangulo extends Forma {
    
    private Double base;
    private Double altura;

    public Triangulo(){
        base = 0.0;
        altura = 0.0;
    }

    @Override
    public Double getArea() {
        return (base * altura) / 2;
    }

    public Triangulo(Double base, Double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    // exercício
    public void setBase(Double base){
        this.base = base;
    }

    public void setAltura(Double altura){
        this.altura = altura;
    }
}