package sesion01;

import java.util.Locale;
import java.util.Scanner;

public class CalculoIntereses {
    private final static double iAnual = 0.0175;
    private final static int tMeses = 12;
    private final static double iva = 0.21;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nMeses;
        double ingreso, iMeses, r, iCobrados;

        do {
            System.out.print("Escriba el dinero ingresado: ");
            ingreso = sc.nextDouble();
            System.out.print("Hasta que numero de meses quiere el interes: ");
            nMeses = sc.nextInt();
        } while (ingreso < 0 && nMeses <= 0);
        

        System.out.println("*** Calculo de intereses ***");
        System.out.printf(Locale.ENGLISH, "Dinero ingresado: %.2f eur", ingreso);
        System.out.printf(Locale.ENGLISH, "\nInteres anual: %.2f%%", iAnual*100);
        iMeses = (iAnual/(tMeses/nMeses))*ingreso;
        System.out.printf(Locale.ENGLISH, "\nInteres a los %d meses: %.2f eur", nMeses, iMeses);
        r = iMeses * iva;
        System.out.printf(Locale.ENGLISH, "\nRetencion realizada: %.2f eur", r);
        iCobrados = iMeses - r;
        System.out.printf(Locale.ENGLISH, "\nIntereses cobrados: %.2f eur", iCobrados);
    }
}
