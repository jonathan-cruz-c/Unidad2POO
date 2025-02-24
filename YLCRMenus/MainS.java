import java.util.Scanner; // Importar la clase Scanner del paquete java.util

public class MainS { // Clase MainS para probar la clase Suma
    public static void main(String[] args) { // Método principal main
        Scanner scanner = new java.util.Scanner(System.in); // Scanner para leer la entrada del usuario
        int opcion; // Variable para controlar la opción del menú
        do { // Bucle mientras la opción no sea 2 (Salir)
            // Menú de opciones
            System.out.println("1. Sumar dos números"); // Mensaje de la opción 1
            System.out.println("2. Salir"); // Mensaje de la opción 2
            System.out.print("Seleccione una opción: "); // Solicitar al usuario la opción
            opcion = scanner.nextInt(); // Leer la opción del usuario

            if (opcion == 1) { // Si la opción es 1, sumar dos números
                Suma suma1 = new Suma(); // Crear el primer objeto de la clase Suma
                Suma suma2 = new Suma(); // Crear el segundo objeto de la clase Suma

                // Pedir al usuario los valores para el primer objeto
                System.out.print("Ingrese el primer número para el objeto 1: "); // Solicitar al usuario el primer número
                suma1.setNumero1(scanner.nextInt()); // Asignar el valor al atributo numero1
                System.out.print("Ingrese el segundo número para el objeto 1: "); // Solicitar al usuario el segundo número
                suma1.setNumero2(scanner.nextInt()); // Asignar el valor al atributo numero2
                // Calcular la suma de los atributos de ambos objetos
                int resultado1 = suma1.getNumero1() + suma1.getNumero2(); // Obtener el resultado de la suma
                System.out.println("El resultado de la primer suma es: " + resultado1); // Imprimir el resultado

                // Pedir al usuario los valores para el segundo objeto
                System.out.print("Ingrese el primer número para el objeto 2: "); // Solicitar al usuario el primer número
                suma2.setNumero1(scanner.nextInt()); // Asignar el valor al atributo numero1
                System.out.print("Ingrese el segundo número para el objeto 2: "); // Solicitar al usuario el segundo número
                suma2.setNumero2(scanner.nextInt()); // Asignar el valor al atributo numero2
                // Calcular la suma de los atributos de ambos objetos
                int resultado2 = suma2.getNumero1() + suma2.getNumero2(); // Obtener el resultado de la suma
                System.out.println("El resultado de la segunda suma es: " + resultado2); // Imprimir el resultado

            } else if (opcion != 2) { // Si la opción no es 2, mostrar un mensaje de error
                System.out.println("Opción no válida. Intente de nuevo."); // Mensaje para opciones no válidas
            } // Cierre del if-else
        } while (opcion != 2); // Continuar el bucle mientras la opción no sea 2 (Salir)
        System.out.println("Programa terminado."); // Mensaje de finalización del programa
        scanner.close(); // Cerrar el scanner para evitar fugas de recursos
    } // Cierre del método main
} // Cierre de la clase MainS