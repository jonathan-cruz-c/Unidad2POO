public class MainMod { // Clase principal del programa de módulo
    public static void main(String[] args) { // Método principal
        Modulo modulo = new Modulo(); // Se crea el objeto de tipo Modulo
        modulo.setA(10); // Asigna 10 a 'a'
        modulo.setB(3);  // Asigna 3 a 'b'

        if (modulo.getB() == 0) { // Verifica si 'b' es cero
            System.out.println("No se puede calcular el módulo con divisor cero"); // Mensaje de error
        } else {
            int resultado = modulo.getA() % modulo.getB(); // Se toman los valores de los atributos y se calcula el módulo
            System.out.println("El módulo es: " + resultado); // Imprime el resultado del módulo
        }
    } // Fin del main
} // Fin de la clase MainMod
