// Clase principal MainS que contiene el método main
class MainS {
    // Metodo principal main
    public static void main(String[] args) {
        // Creamos un objeto de la clase Suma llamado sm
        Suma sm = new Suma();
        // Asignamos valores a los atributos num y num2 del objeto sm
        sm.setNum(8);
        sm.setNum2(19);
        // Obtenemos los valores de num y num2, los sumamos y guardamos el resultado en
        // a
        int a = sm.getNum() + sm.getNum2();
        // Imprimimos el resultado de la suma del primer objeto
        System.out.println("Resultado 1: " + a);
        // Creamos un segundo objeto de la clase Suma llamado sm2
        Suma sm2 = new Suma();
        // Asignamos valores a los atributos num y num2 del objeto sm2
        sm2.setNum(11);
        sm2.setNum2(22);
        // Obtenemos los valores de num y num2, los sumamos y guardamos el resultado en
        // b
        int b = sm2.getNum() + sm2.getNum2();
        // Imprimimos el resultado de la suma del segundo objeto
        System.out.println("Resultado 2: " + b);
    }
}