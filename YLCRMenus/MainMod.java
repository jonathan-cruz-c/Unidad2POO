import java.util.Scanner; // Importar la clase Scanner del paquete java.util

public class MainMod { // Clase MainMod para probar la operación de módulo
    public static void main(String[] args) { // Método principal main
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario
        int opcion; // Variable para controlar la opción del menú
        do { // Bucle mientras la opción no sea 2 (Salir)
            // Menú de opciones
            System.out.println("1. Calcular el módulo de dos pares de números"); // Opción 1
            System.out.println("2. Salir"); // Opción 2
            System.out.print("Seleccione una opción: "); // Solicitar al usuario la opción
            opcion = scanner.nextInt(); // Leer la opción del usuario

            if (opcion == 1) { // Si la opción es 1, calcular el módulo de dos pares de números
                Modulo modulo1 = new Modulo(); // Crear el primer objeto Modulo
                Modulo modulo2 = new Modulo(); // Crear el segundo objeto Modulo

                // Pedir al usuario los valores para el primer objeto
                System.out.print("Ingrese el primer número para el objeto 1: "); // Solicitar al usuario el primer número
                modulo1.setNumero1(scanner.nextInt()); // Asignar el valor al atributo numero1
                System.out.print("Ingrese el segundo número para el objeto 1: "); // Solicitar al usuario el segundo número
                modulo1.setNumero2(scanner.nextInt()); // Asignar el valor al atributo numero2

                // Pedir al usuario los valores para el segundo objeto
                System.out.print("Ingrese el primer número para el objeto 2: "); // Solicitar al usuario el primer número
                modulo2.setNumero1(scanner.nextInt()); // Asignar el valor al atributo numero1
                System.out.print("Ingrese el segundo número para el objeto 2: "); // Solicitar al usuario el segundo número
                modulo2.setNumero2(scanner.nextInt()); // Asignar el valor al atributo numero2

                // Verificar división por cero y calcular el módulo de ambos objetos
                if (modulo1.getNumero2() != 0) { // Si el divisor no es cero
                    int resultado1 = modulo1.getNumero1() % modulo1.getNumero2(); // Módulo del primer objeto
                    System.out.println("El resultado del módulo del objeto 1 es: " + resultado1); // Imprimir resultado 1
                } else { // Si el divisor es cero
                    System.out.println("Error: No se puede calcular el módulo con divisor cero en el objeto 1."); // Mensaje de error
                }

                if (modulo2.getNumero2() != 0) { // Si el divisor no es cero
                    int resultado2 = modulo2.getNumero1() % modulo2.getNumero2(); // Módulo del segundo objeto
                    System.out.println("El resultado del módulo del objeto 2 es: " + resultado2); // Imprimir resultado 2
                } else { // Si el divisor es cero
                    System.out.println("Error: No se puede calcular el módulo con divisor cero en el objeto 2."); // Mensaje de error
                }
            } else if (opcion != 2) { // Si la opción no es 2, mostrar un mensaje de error
                System.out.println("Opción no válida. Intente de nuevo."); // Mensaje para opciones no válidas
            } // Cierre del if-else
        } while (opcion != 2); // Continuar el bucle mientras la opción no sea 2 (Salir)
        System.out.println("Programa terminado."); // Mensaje de finalización del programa
        scanner.close(); // Cerrar el scanner para evitar fugas de recursos
    } // Cierre del método main
} // Cierre de la clase MainMod