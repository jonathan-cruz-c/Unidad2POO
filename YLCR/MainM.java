public class MainM { // Clase principal del programa de multiplicación
    public static void main(String[] args) { // Método principal
        Multiplicacion multiplicacion = new Multiplicacion(); // Se crea el objeto de tipo Multiplicacion
        multiplicacion.setA(10); // Asigna 10 a 'a'
        multiplicacion.setB(5);  // Asigna 5 a 'b'

        int resultado = multiplicacion.getA() * multiplicacion.getB(); // Se toman los valores de los atributos y se multiplican

        System.out.println("La multiplicación es: " + resultado); // Imprime el resultado de la multiplicación
    } // Fin del main
} // Fin de la clase MainM
