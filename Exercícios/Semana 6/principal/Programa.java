package principal;

import java.util.*;
import entidades.*;
import util.*;

public class Programa {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // exercício
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        MinhasFormas.ler(circulo, scan);
        MinhasFormas.ler(quadrado, scan);
        MinhasFormas.ler(triangulo, scan);


        List<Forma> formas = new ArrayList<>();

        formas.add(circulo);
        formas.add(quadrado);
        formas.add(triangulo);

        MinhasFormas.imprimir(formas);
        MinhasFormas.imprimir(circulo);

        scan.close();
    } 
}