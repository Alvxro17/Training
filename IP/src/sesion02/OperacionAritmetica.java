package sesion02;

import java.util.Locale;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class OperacionAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        String c;

        System.out.println("Elije los operandos para realizar un tipo de operacion: ");
        System.out.print("x = ");
        x = sc.nextDouble();
        System.out.print("y = ");
        y = sc.nextDouble();
        System.out.print("Elije el tipo de operacion entre +, -, *, / : ");
        c = sc.next();
        System.out.printf(Locale.ENGLISH, "El resultado de la operacion %d %s %d es: %.2f", (int)x, c,(int)y, realizarOperacion(x, y, c));

    }
    public static double realizarOperacion(double x, double y, String c) {
        String ope = c;
        double r = 0;
        switch (ope) {
            case ("+"):
                r = x + y;
            break;
            case ("-"):
                r = x - y;
            break;
            case ("*"):
                r = x * y;
            break;
            case ("/"):
                if (y != 0)
                    r = x / y;
                else
                    System.out.println("Error de division por 0");
            break;
        }
        return r;
    }
}
