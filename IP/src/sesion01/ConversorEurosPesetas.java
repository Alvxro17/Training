package sesion01;

import java.util.Scanner;

public class ConversorEurosPesetas {
    final static double C = 166.386;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0, s;
        double e = 0;

        do {
            System.out.print("Escribe 1 para transformar euros o escribe 2 para trasnformar pesetas: ");
                    s = sc.nextInt();
            if (s == 1) {
                do {
                    System.out.print("Escribe la cantidad de euros para transformar en pesetas: ");
                    e = sc.nextDouble();
                } while (p < 0);
            }
            if (s == 2) {    
                do {
                    System.out.print("Escribe la cantidad de pesetas para transformar en euros: ");
                    p = sc.nextInt();
                } while (e < 0);
            }
        } while (s != 1 && s != 2);
        
        if (s == 1) { 
            p = (int) (e * C);
            System.out.printf("· %.2f euros => %d pesetas", e, p);
        } else {
            e = p / C;
            System.out.printf("· %d pesetas => %.2f euros", p, e);
        }

        sc.close();
    }
}
