// Clase Modulo con dos atributos enteros, un constructor vacío y métodos getters y setters
class Modulo {
    private int numero1; // Atributo privado para el primer número
    private int numero2; // Atributo privado para el segundo número

    public Modulo() {} // Constructor vacío

    public int getNumero1() { // Getter para el primer número
        return numero1; // Retorna el valor del atributo numero1
    } // Fin del método getNumero1

    public void setNumero1(int numero1) { // Setter para el primer número
        this.numero1 = numero1; // Asigna el valor del atributo numero1 al atributo de la clase
    } // Fin del método setNumero1

    public int getNumero2() { // Getter para el segundo número
        return numero2; // Retorna el valor del atributo numero2
    } // Fin del método getNumero2

    public void setNumero2(int numero2) { // Setter para el segundo número
        this.numero2 = numero2; // Asigna el valor del atributo numero2 al atributo de la clase
    } // Fin del método setNumero2
} // Fin de la clase Modulo