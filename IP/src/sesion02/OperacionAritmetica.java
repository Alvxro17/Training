package sesion02;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class OperacionAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        String c;

        System.out.println("Elije los operandos para realizar un tipo de operacion: ");
        System.out.println("x = ");
        x = sc.nextDouble();
        System.out.println("y = ");
        y = sc.nextDouble();
        System.out.println("Elije el tipo de operacion entre +, -, *, / : ");
        c = sc.next();
        System.out.println("El resultado de la operacion es: "+ realizarOperacion(x, y, c));

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
