import java.util.Scanner;

public class Programa1 {

public static void main(String[] args) {
// Declaración de variable
try (Scanner lectura = new Scanner(System.in)) {
int numero;
int suma = 0;
int contador = 0;
// Solicitar números al usuario y continuar hasta que ingrese 0
System.out.println("Introduce números para calcular el promedio (0 para terminar):");
numero = lectura.nextInt();
while (numero != 0) {
suma += numero;  // Sumar el número ingresado
contador++;      // Incrementar el contador de números
numero = lectura.nextInt();  // Leer el siguiente número
}
// Calcular el promedio
if (contador != 0) {
double promedio = (double) suma / contador;
System.out.println("El promedio de los números ingresados es: " + promedio);
} else {
System.out.println("No se ingresaron números.");
}
// Cerrar el Scanner
}
}
}
