// Definimos una clase llamada MainModu
class MainModu {
    // Método main
    public static void main(String[] args) {
        // Creamos un objeto de la clase Modulo llamado ml
        Modulo ml = new Modulo();
        // Asignamos valores a los atributos num y num2 del objeto ml
        ml.setNum(18);
        ml.setNum2(7);
        // Obtenemos los valores de num y num2, los multiplicamos y guardamos el
        // resultado en a
        int a = ml.getNum() % ml.getNum2();
        // Imprimimos el resultado de la multiplicación del primer objeto
        System.out.println("Resultado 1: " + a);
        // Creamos un segundo objeto de la clase Modulo llamado ml2
        Modulo ml2 = new Modulo();
        // Asignamos valores a los atributos num y num2 del objeto ml2
        ml2.setNum(5);
        ml2.setNum2(9);
        // Obtenemos los valores de num y num2, los multiplicamos y guardamos el
        // resultado en b
        int b = ml2.getNum() % ml2.getNum2();
        // Imprimimos el resultado de la multiplicación del segundo objeto
        System.out.println("Resultado 2: " + b);
    }
}