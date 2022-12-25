package sesion01;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, d, l, a;
        do {
            System.out.print("Escriba el radio de la circunferencia: ");
            r = sc.nextDouble();
        } while (r < 0);

        d = 2*r;
        System.out.printf(Locale.ENGLISH, "· El diametro es: %.2f u", d);
        l = 2*Math.PI*r;
        System.out.printf("\n· El perimetro es: %.3f u", l);
        a = Math.PI*Math.pow(r, 2);
        System.out.printf("\n· El area es: %.3f u", a);
    }
}
