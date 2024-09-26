import java.util.Scanner;
public class Programa2 {
public static void main(String[] args) {
        // Declaración de variables
        Scanner lectura = new Scanner(System.in);
        int numero;
        boolean esPrimo = true;
        // Solicitar al usuario que ingrese un número
        System.out.print("Introduce un número: ");
        numero = lectura.nextInt();
        // Verificar si el número es primo
        if (numero <= 1) {
            esPrimo = false;
        } else {
            int divisor = 2;
            while (divisor <= numero / 2) {
                if (numero % divisor == 0) {
                    esPrimo = false;
                    break;  // Terminar el bucle si se encuentra un divisor
                }
                divisor++;
            }
        }
        // Mostrar el resultado
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
        // Cerrar el Scanner
        lectura.close();
    }
}
