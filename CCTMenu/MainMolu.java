import java.util.Scanner;
//Se crea la clase MainMu
public class MainMolu {
    //Se declara el método main para ejecutar el programa
    public static void main(String[] args) {
        //Se crea un objeto Scanner
        Scanner sc = new Scanner(System.in);
        //Se declara la variable opciones
        int opciones;
        //Se declara un bucle do-while

        do {
            //Se muestra la opción del menú
            System.out.println("Elija una opcion:");
            //Se muestra las opciones del menú 
            System.out.println("1.- Division");
            //Se muestra las opciones del menú
            System.out.println("2.- Salir");
            //Se pide la opción del usuario
            System.out.print("Ingrese su opcion: ");
            //Se guarda la opción del usuario
            opciones = sc.nextInt();

           //Se crean los objetos SumaM dentro del caso
            switch (opciones) {
                //Se crea el caso 1
                case 1:
                    // Creación de los objetos SumaM dentro del caso
                    ModuloM modulo1 = new ModuloM();                                   
                    //Creación de los objetos SumaM dentro del caso
                    ModuloM modulo2 = new ModuloM();                
                              

                    // Se pide al usuario los valores para el primer objeto
                    System.out.print("Ingrese el primer numero del objeto 1: ");
                    //Asignar el valor al atributo numero1
                    modulo1.setN1(sc.nextInt());                                     
                    // Se pide al usuario los valores para el primer objeto
                    System.out.print("Ingrese el segundo numero del objeto 1: ");
                    //Asignar el valor al atributo numero2
                    modulo1.setN2(sc.nextInt());                   
                    // Calcular la multiplicacion de los atributos de ambos objetos
                    int r1 = modulo1.getN1() % modulo1.getN2();                                  
                    //Imprimir el resultado
                    System.out.println("El resultado del objeto 1 es: " + r1);
                    // Se pide al usuario los valores para el segundo objeto

                    // Segundo objeto
                    //Se pide el primer valor del segundo objeto
                    System.out.print("Ingrese el primer numero del objeto 2: ");
                    //Asignar el valor al atributo numero1
                    modulo2.setN1(sc.nextInt());                   
                    
                   
                   // Se pide el segundo valor del segundo objeto
                    System.out.print("Ingrese el segundo numero del objeto 2: ");
                    //Asignar el valor al atributo numero2
                    modulo2.setN2(sc.nextInt());                                     
                    // Calcular la multiplicacion de los atributos de ambos objetos
                    int r2 = modulo2.getN1() % modulo2.getN2();                    
                    //Imprimir el resultado
                    System.out.println("El resultado del objeto 2 es: " + r2);
                    break;

                //Se crea el caso 2
                    case 2:
                    //Imprimir el mensaje de salida
                    System.out.println("Saliendo...");
                    break;

                //Se crea el caso por defecto
                    default:
                    //Imprimir el mensaje de error
                    System.out.println("Opcion invalida, intenta de nuevo.");
            }
            //Se rompe el bucle do-while después de ejecutar el caso 2 y regresa al menu

        } while (opciones != 2);
        //Se cerra el scanner para evitar fugas de recursos

        sc.close();
    }
}