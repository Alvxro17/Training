package sesion01;

import java.util.Locale;

public class DivisionPorCero {
    public static void main(String[] args) {
        double x, y, r;
        x = 17;
        y = 0;

        System.out.println("EJEMPLOS DE DIVISIONES POR CERO CON ENTEROS Y REALES\n");

        r = x / y;
        System.out.printf(Locale.ENGLISH, "%.1f / %.1f = %.1f\n", x, y, r);

        r = x % y;
        System.out.printf(Locale.ENGLISH, "%.1f %% %.1f = %.1f\n", x, y, r);

        System.out.printf(Locale.ENGLISH, "%d / %d = \n", (int) x, (int) y);
        r = (int)x / (int)y;
    }
    
}
