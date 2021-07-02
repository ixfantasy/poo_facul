package original;

import java.util.*;
import entidades.*;
import util.*;

public class ProgramaOr {

    public static void main(String[] args){

        // Círculo
        Double raio;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio: ");
        raio = scan.nextDouble();

        Circulo circulo = new Circulo(raio);
        System.out.println("Area Circulo = " + circulo.getArea());
        

        // Quadrado
        Double lado;
        System.out.println("Digite o valor do lado: ");
        lado = scan.nextDouble();
        
        Quadrado quadrado = new Quadrado(lado);
        System.out.println("Area Quadrado = " + quadrado.getArea());
        

        List<Forma> formas = new ArrayList<>();

        formas.add(circulo);
        formas.add(quadrado);

        // Percorrer a lista
        MinhasFormas.imprimir(formas);

        MinhasFormas.imprimir(circulo);

        scan.close();

        /* Para casa
        implementar os métodos a seguir:
        MinhasFormas.ler(circulo);
        MinhasFormas.ler(quadrado);
        */

    }
    
}
