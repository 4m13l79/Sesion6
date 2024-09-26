import java.util.Scanner;

public class Programa1 {

public static void main(String[] args) {
// Declaraci�n de variable
try (Scanner lectura = new Scanner(System.in)) {
int numero;
int suma = 0;
int contador = 0;
// Solicitar n�meros al usuario y continuar hasta que ingrese 0
System.out.println("Introduce n�meros para calcular el promedio (0 para terminar):");
numero = lectura.nextInt();
while (numero != 0) {
suma += numero;  // Sumar el n�mero ingresado
contador++;      // Incrementar el contador de n�meros
numero = lectura.nextInt();  // Leer el siguiente n�mero
}
// Calcular el promedio
if (contador != 0) {
double promedio = (double) suma / contador;
System.out.println("El promedio de los n�meros ingresados es: " + promedio);
} else {
System.out.println("No se ingresaron n�meros.");
}
// Cerrar el Scanner
}
}
}
