import java.util.Scanner; // Importar la clase Scanner del paquete java.util

public class MainD { // Clase MainD para probar la operación de división
    public static void main(String[] args) { // Método principal main
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario
        int opcion; // Variable para controlar la opción del menú
        do { // Bucle mientras la opción no sea 2 (Salir)
            // Menú de opciones
            System.out.println("1. Dividir dos pares de números");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: "); // Solicitar al usuario la opción
            opcion = scanner.nextInt(); // Leer la opción del usuario

            if (opcion == 1) { // Si la opción es 1, dividir dos pares de números
                Division division1 = new Division(); // Crear el primer objeto Division
                Division division2 = new Division(); // Crear el segundo objeto Division

                // Pedir al usuario los valores para el primer objeto
                System.out.print("Ingrese el primer número para el objeto 1: "); // Solicitar al usuario el primer número
                division1.setNumero1(scanner.nextInt()); // Asignar el valor al atributo numero1
                System.out.print("Ingrese el segundo número para el objeto 1: "); // Solicitar al usuario el segundo número
                division1.setNumero2(scanner.nextInt()); // Asignar el valor al atributo numero2

                // Pedir al usuario los valores para el segundo objeto
                System.out.print("Ingrese el primer número para el objeto 2: "); // Solicitar al usuario el primer número
                division2.setNumero1(scanner.nextInt()); // Asignar el valor al atributo numero1
                System.out.print("Ingrese el segundo número para el objeto 2: "); // Solicitar al usuario el segundo número
                division2.setNumero2(scanner.nextInt()); // Asignar el valor al atributo numero2

                // Verificar división por cero y calcular la división de ambos objetos
                if (division1.getNumero2() != 0) { // Si el divisor no es cero
                    double resultado1 = (double) division1.getNumero1() / division1.getNumero2(); // División del primer objeto
                    System.out.println("El resultado de la división del objeto 1 es: " + resultado1); // Imprimir resultado 1
                } else { // Si el divisor es cero
                    System.out.println("Error: No se puede dividir por cero en el objeto 1."); // Mensaje de error
                }

                if (division2.getNumero2() != 0) { // Si el divisor no es cero
                    double resultado2 = (double) division2.getNumero1() / division2.getNumero2(); // División del segundo objeto
                    System.out.println("El resultado de la división del objeto 2 es: " + resultado2); // Imprimir resultado 2
                } else { // Si el divisor es cero
                    System.out.println("Error: No se puede dividir por cero en el objeto 2."); // Mensaje de error
                }
            } else if (opcion != 2) { // Si la opción no es 2, mostrar un mensaje de error
                System.out.println("Opción no válida. Intente de nuevo."); // Mensaje para opciones no válidas
            } // Cierre del if-else
        } while (opcion != 2); // Continuar el bucle mientras la opción no sea 2 (Salir)
        System.out.println("Programa terminado."); // Mensaje de finalización del programa
        scanner.close(); // Cerrar el scanner para evitar fugas de recursos
    } // Cierre del método main
} // Cierre de la clase MainD