import java.util.Scanner;

/* Matrícula: 0050016724
   Nome: Nathália Pinto Fortunato */

public class NathaliaTabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Olá, Nathália! Entre com número: ");
        n = scan.nextInt();
        System.out.printf("Tabuada de Somar do %d:\n", n);

        for(int x = 0; x <= 10; x++){
            System.out.printf("%d + %d = %d\n", n, x, n + x);
        }

        scan.close();
    }
}