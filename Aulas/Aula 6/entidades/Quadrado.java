package entidades;

public class Quadrado extends Forma {
	
	private Double lado;

    public Quadrado(){
        lado = 0.0;
    }

	@Override
	public Double getArea() {
		return lado * lado;
	}

	public Quadrado(Double lado) {
		super();
		this.lado = lado;
	}

    // exercício
    public void setLado(Double lado){
        this.lado = lado;
    }
}