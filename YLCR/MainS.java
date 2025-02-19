public class MainS { // Clase principal del programa de suma
    public static void main(String[] args) { // Crear un objeto de la clase Suma
        Suma suma = new Suma(); // 
        suma.setA(10); // Asigna 10 a 'a'
        suma.setB(5);  // Asigna 5 a 'b'
	
	int resultado = suma.getA() + suma.getB();

        System.out.println("La suma es: " + resultado); // Imprime el resultado de la suma
    } // Fin del main
} // Fin de la clase MainS
