public class MainS { // Clase principal del programa de suma
    public static void main(String[] args) { // Método main
        Suma suma = new Suma(); // Crear un objeto de la clase Suma
        suma.setA(10); // Asigna 10 a 'a'
        suma.setB(5);  // Asigna 5 a 'b'
	
    	int resultado = suma.getA() + suma.getB(); // Tomamos los valores de num1 y num2 y los sumamos

        System.out.println("La suma es: " + resultado); // Imprime el resultado de la suma

        Suma suma2 = new Suma(); // Crear un objeto de la clase Suma
        suma2.setA(5); // Asigna 10 a 'a'
        suma2.setB(5);  // Asigna 5 a 'b'
	
    	int resultado2 = suma2.getA() + suma2.getB(); // Tomamos los valores de num1 y num2 y los sumamos

        System.out.println("La suma es: " + resultado2); // Imprime el resultado de la suma
    } // Fin del main
} // Fin de la clase Main
