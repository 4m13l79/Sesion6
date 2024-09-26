import java.util.Scanner;
public class Programa3 {
public static void main(String[] args) {
        // Declaración de variables
        Scanner lectura = new Scanner(System.in);
        String cadena;
        int i = 0;
        int contadorVocales = 0;
        // Solicitar al usuario que ingrese una cadena de texto
        System.out.print("Introduce una cadena de texto: ");
        cadena = lectura.nextLine();
        // Convertir la cadena a minúsculas para evitar problemas de mayúsculas
        cadena = cadena.toLowerCase();
        // Bucle while para recorrer la cadena y contar las vocales
        while (i < cadena.length()) {
            char caracter = cadena.charAt(i);  // Obtener el carácter en la posición i
            // Verificar si el carácter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
            i++;  // Incrementar el índice para avanzar al siguiente carácter
        }
        // Mostrar el resultado
        System.out.println("La cantidad de vocales en la cadena es: " + contadorVocales);
        // Cerrar el Scanner
        lectura.close();
    }
}

