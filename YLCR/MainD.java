public class MainD { // Clase principal del programa de división
    public static void main(String[] args) { // Método principal
        Division division = new Division(); // Se crea el objeto de tipo Division
        division.setA(10); // Asigna 10 a 'a'
        division.setB(2);  // Asigna 2 a 'b'
        Division division2 = new Division();
        division2.setA(20); // Asigan 20 a 'a'
        division2.setB(10); // Asigna 10 a 'b'

        if (division.getB() == 0) { // Verifica si 'b' es cero
            System.out.println("No se puede dividir por cero"); // Mensaje de error
        } else { //Si no se cumple la condicion anterior se ejecuta los siguiente
            double resultado = (double) division.getA() / division.getB(); // Se toman los valores de los atributos y se dividen
            System.out.println("La división 1 es: " + resultado); // Imprime el resultado de la división
        }// Fin del if - else
        if (division.getB() == 0) { // Verifica si 'b' es cero
            System.out.println("No se puede dividir por cero"); // Mensaje de error
        } else { //Si no se cumple la condicion anterior se ejecuta los siguiente
            double resultado2 = (double) division2.getA() / division2.getB(); // Se toman los valores de los atributos y se dividen
            System.out.println("La división 2 es: " + resultado2); // Imprime el resultado de la división
        }// Fin del if - else
    } // Fin del main
} // Fin de la clase MainD
