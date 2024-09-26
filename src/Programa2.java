import java.util.Scanner;
public class Programa2 {
public static void main(String[] args) {
        // Declaraci�n de variables
        Scanner lectura = new Scanner(System.in);
        int numero;
        boolean esPrimo = true;
        // Solicitar al usuario que ingrese un n�mero
        System.out.print("Introduce un n�mero: ");
        numero = lectura.nextInt();
        // Verificar si el n�mero es primo
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
            System.out.println(numero + " es un n�mero primo.");
        } else {
            System.out.println(numero + " no es un n�mero primo.");
        }
        // Cerrar el Scanner
        lectura.close();
    }
}
