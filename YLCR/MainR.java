public class MainR { // Clase principal del programa de resta
    public static void main(String[] args) { // Método principal
        Resta resta = new Resta(); // Se crea el objeto de tipo Resta
        resta.setA(10); // Asigna 10 a 'a'
        resta.setB(5);  // Asigna 5 a 'b'

        int resultado = resta.getA() - resta.getB(); // Se toman los valores de los atributos y se restan

        System.out.println("La resta es: " + resultado); // Imprime el resultado de la resta
    } // Fin del main
} // Fin de la clase MainR
