package util;

import java.util.*;
import entidades.*;

public final class MinhasFormas {

    public static void ler(Forma forma){

        Scanner scan = new Scanner(System.in);

        if(forma instanceof Circulo){
            System.out.println("Digite o valor do raio: ");
            ((Circulo) forma).setRaio(scan.nextDouble());
        }

        else if(forma instanceof Quadrado){
            System.out.println("Digite o valor do lado: ");
            ((Quadrado) forma).setLado(scan.nextDouble());
        }

        else {
            System.out.println("Digite o valor da base: ");
            ((Triangulo) forma).setBase(scan.nextDouble());

            System.out.println("Digite o valor da altura: ");
            ((Triangulo) forma).setAltura(scan.nextDouble());
        }
    }


    public static void imprimir(List<Forma> formas){

        System.out.println("Áreas de Formas Geométricas: ");

        for (Forma forma : formas){
            if(forma instanceof Circulo){
                System.out.println("Área do Círculo = " + forma.getArea());
            } 
            
            else if (forma instanceof Quadrado){
                System.out.println("Área do Quadrado = " + forma.getArea());
            } 
            
            else {
                System.out.println("Área do Triângulo = " + forma.getArea());
            }
        }
    }


    public static void imprimir(Circulo circulo) {
        System.out.println("Círculo");
        System.out.println("Área = " + circulo.getArea());
    }
}