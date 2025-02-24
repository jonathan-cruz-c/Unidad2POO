import java.util.Scanner; // Importar la clase Scanner del paquete java.util

public class MainM { // Clase MainM para probar la operación de multiplicación
    public static void main(String[] args) { // Método principal main
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario
        int opcion; // Variable para controlar la opción del menú
        do { // Bucle mientras la opción no sea 2 (Salir)
            // Menú de opciones
            System.out.println("1. Multiplicar dos pares de números"); // Mensaje de la opción 1
            System.out.println("2. Salir"); // Mensaje de la opción 2
            System.out.print("Seleccione una opción: "); // Solicitar al usuario la opción
            opcion = scanner.nextInt(); // Leer la opción del usuario

            if (opcion == 1) { // Si la opción es 1, multiplicar dos pares de números
                Multiplicacion multiplicacion1 = new Multiplicacion(); // Crear el primer objeto Multiplicacion
                Multiplicacion multiplicacion2 = new Multiplicacion(); // Crear el segundo objeto Multiplicacion

                // Pedir al usuario los valores para el primer objeto
                System.out.print("Ingrese el primer número para el objeto 1: "); // Solicitar al usuario el primer número
                multiplicacion1.setNumero1(scanner.nextInt()); // Asignar el valor al atributo numero1
                System.out.print("Ingrese el segundo número para el objeto 1: "); // Solicitar al usuario el segundo número
                multiplicacion1.setNumero2(scanner.nextInt()); // Asignar el valor al atributo numero2

                // Pedir al usuario los valores para el segundo objeto
                System.out.print("Ingrese el primer número para el objeto 2: "); // Solicitar al usuario el primer número
                multiplicacion2.setNumero1(scanner.nextInt()); // Asignar el valor al atributo numero1
                System.out.print("Ingrese el segundo número para el objeto 2: "); // Solicitar al usuario el segundo número
                multiplicacion2.setNumero2(scanner.nextInt()); // Asignar el valor al atributo numero2

                // Calcular la multiplicación de los atributos de ambos objetos
                int resultado1 = multiplicacion1.getNumero1() * multiplicacion1.getNumero2(); // Multiplicación del primer objeto
                int resultado2 = multiplicacion2.getNumero1() * multiplicacion2.getNumero2(); // Multiplicación del segundo objeto
                System.out.println("El resultado de la multiplicación del objeto 1 es: " + resultado1); // Imprimir resultado 1
                System.out.println("El resultado de la multiplicación del objeto 2 es: " + resultado2); // Imprimir resultado 2
            } else if (opcion != 2) { // Si la opción no es 2, mostrar un mensaje de error
                System.out.println("Opción no válida. Intente de nuevo."); // Mensaje para opciones no válidas
            } // Cierre del if-else
        } while (opcion != 2); // Continuar el bucle mientras la opción no sea 2 (Salir)
        System.out.println("Programa terminado."); // Mensaje de finalización del programa
        scanner.close(); // Cerrar el scanner para evitar fugas de recursos
    } // Cierre del método main
} // Cierre de la clase MainM