package sesion01;

import java.util.Scanner;

public class EnteroAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, a;

        System.out.println("Elija el intervalo para generar el numero aleatorio: [m, n]");
        System.out.print("m = ");
        m = sc.nextInt();
        System.out.print("n = ");
        n = sc.nextInt();

        a = (int) (Math.random() * (n - m + 1) + m);
        System.out.printf("El entero aleatoriamente en el intervalo [%d, %d] es: %d", n, m, a);

        sc.close();
    }
}
