package sesion01;

import java.util.Locale;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2;
        double d;

        System.out.println("Elija el primer punto:");
        System.out.print("Primera coordenada: ");
        x1 = sc.nextInt();
        System.out.print("Segunda coordenada: ");
        y1 = sc.nextInt();

        System.out.println("\nElija el segundo punto:");
        System.out.print("Primera coordenada: ");
        x2 = sc.nextInt();
        System.out.print("Segunda coordenada: ");
        y2 = sc.nextInt();

        d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.printf(Locale.ENGLISH, "\nLa distancia del punto (%d, %d) al punto (%d, %d) es %f", x1, y1, x2, y2, d);

        sc.close();
    }
}
