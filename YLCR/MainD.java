public class MainD { // Clase principal del programa de división
    public static void main(String[] args) { // Método principal
        Division division = new Division(); // Se crea el objeto de tipo Division
        division.setA(10); // Asigna 10 a 'a'
        division.setB(2);  // Asigna 2 a 'b'

        if (division.getB() == 0) { // Verifica si 'b' es cero
            System.out.println("No se puede dividir por cero"); // Mensaje de error
        } else {
            double resultado = (double) division.getA() / division.getB(); // Se toman los valores de los atributos y se dividen
            System.out.println("La división es: " + resultado); // Imprime el resultado de la división
        }
    } // Fin del main
} // Fin de la clase MainD
