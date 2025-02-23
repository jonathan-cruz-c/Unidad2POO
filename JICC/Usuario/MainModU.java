
// Libreria Scanner
import java.util.Scanner;

// Clase MainModU
class MainModU {
    // Método main
    public static void main(String[] args) {
        // Creación de un objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Creación de un objeto ModuloU
        ModuloU us1 = new ModuloU();
        // Declaración de la variable opc
        int opc;
        // Bucle do-while
        do {
            // Muestra las opciones en pantalla
            System.out.println("-----------Elija una opcion----------");
            System.out.println("1.- Hacer la modulo");
            System.out.println("2.- Salir");
            // Pide la opción al usuario
            System.out.println("Ingrese su opcion: ");
            // Guarda la opción del usuario
            opc = sc.nextInt();
            // Estructura Switch, verifica la opción del usuario
            switch (opc) {
                // Hacer la modulo
                case 1:
                    // Pide el primer numero al usuario
                    System.out.println("Ingrese el primer numero: ");
                    // Asigna el primer numero del usuario a la variable num1
                    us1.setNum1(sc.nextInt());
                    // Pide el segundo numero al usuario
                    System.out.println("Ingrese el segundo numero: ");
                    // Asigna el segundo numero del usuario a la variable num2
                    us1.setNum2(sc.nextInt());
                    // Calcula el resultado de la modulo y se guarda en la variable r
                    int r = us1.getNum1() % us1.getNum2();
                    // Imprime el resultado
                    System.out.println("El resultado es: " + r);
                    // Se rompe el flujo del switch después de ejecutar el caso 1 y regresa al menu
                    break;
                // Sale del programa
                case 2:
                    // Imprime el mensaje de salida
                    System.out.println("Saliendo del programa");
                    // Se rompe el flujo del switch después de ejecutar el caso 2
                    break;
                // Caso por defecto
                default:
                    // Imprime el mensaje de error
                    System.out.println("Invalida intente de nuevo");
                    // Se rompe el flujo del switch después de ejecutar el caso por defecto y
                    // regresa al menu
                    break;
            }
            // Se rompe el bucle do-while después de ejecutar el caso 2
        } while (opc != 2);
        sc.close();
    }
}