// Definimos una clase llamada MainM
class MainM {
    // Método main
    public static void main(String[] args) {
        // Creamos un objeto de la clase Multiplicacion llamado mn
        Multiplicacion mn = new Multiplicacion();
        // Asignamos valores a los atributos num y num2 del objeto mn
        mn.setNum(18);
        mn.setNum2(9);
        // Obtenemos los valores de num y num2, los multiplicamos y guardamos el
        // resultado
        // en a
        int a = mn.getNum() * mn.getNum2();
        // Imprimimos el resultado de la multiplicación del primer objeto
        System.out.println("Resultado 1: " + a);
        // Creamos un segundo objeto de la clase Multiplicacion llamado mn2
        Multiplicacion mn2 = new Multiplicacion();
        // Asignamos valores a los atributos num y num2 del objeto mn2
        mn2.setNum(5);
        mn2.setNum2(9);
        // Obtenemos los valores de num y num2, los multiplicamos y guardamos el
        // resultado
        // en b
        int b = mn2.getNum() * mn2.getNum2();
        // Imprimimos el resultado de la multiplicación del segundo objeto
        System.out.println("Resultado 2: " + b);
    }
}