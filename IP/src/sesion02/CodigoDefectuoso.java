package sesion02;

import java.util.Scanner;

public class CodigoDefectuoso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;

        do {
            System.out.print("Escribe el codigo que quieras comprobar y escribe 0 para acabar: ");
            codigo = sc.nextInt();
            if (codigo == 0)
                break;
            else if (codigo < 0)
                codigo = -1;
            else if (esCodigoDefectuoso(codigo) == false)
                System.out.println("El codigo NO es defectuoso");
            else
                System.out.println("El codigo ES defectuoso"); 
        } while (codigo < 0);

        while (codigo > 0) {
            do {
                System.out.print("Codigo -> ");
                codigo = sc.nextInt();
                if (codigo == 0) {
                    break;
                } else if (codigo < 0) {
                        codigo = -1;
                } else if (esCodigoDefectuoso(codigo) == false) {
                            System.out.println("El codigo NO es defectuoso");
                } else {
                        System.out.println("El codigo ES defectuoso"); 
                }
            } while (codigo < 0);
        }

        System.out.println("Programa finalizado...");
        sc.close();
    }

    public static boolean esCodigoDefectuoso (int codigo) {
        if ((codigo >= 14681 && codigo <= 15681) || (codigo >= 70001 && codigo <= 79999)
            || (codigo >= 99999 && codigo <= 110110)) {
            return true;
        }
        return false;
    } 
}
