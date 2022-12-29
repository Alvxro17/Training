package sesion01;

import java.util.Locale;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dame un numero real");
    double numero = sc.nextDouble();    
    System.out.println("EJEMPLOS DE DIVISIONES POR CERO CON ENTEROS Y REALES");
    System.out.println();
    double resultado = numero / 0.0;
    System.out.printf("%.1f / %.1f = %f \n", numero, 0.0, resultado);
    System.out.println(numero +" % 0.0 = " + numero / 0);
    System.out.println( numero +" / 0 =");
    System.out.println("17 / 0 =" + 17 / 0);
    }
    
}
