import java.util.Scanner;
public class Programa3 {
public static void main(String[] args) {
        // Declaraci�n de variables
        Scanner lectura = new Scanner(System.in);
        String cadena;
        int i = 0;
        int contadorVocales = 0;
        // Solicitar al usuario que ingrese una cadena de texto
        System.out.print("Introduce una cadena de texto: ");
        cadena = lectura.nextLine();
        // Convertir la cadena a min�sculas para evitar problemas de may�sculas
        cadena = cadena.toLowerCase();
        // Bucle while para recorrer la cadena y contar las vocales
        while (i < cadena.length()) {
            char caracter = cadena.charAt(i);  // Obtener el car�cter en la posici�n i
            // Verificar si el car�cter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
            i++;  // Incrementar el �ndice para avanzar al siguiente car�cter
        }
        // Mostrar el resultado
        System.out.println("La cantidad de vocales en la cadena es: " + contadorVocales);
        // Cerrar el Scanner
        lectura.close();
    }
}

