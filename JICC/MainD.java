// Definimos una clase llamada MainD
class MainD {
    // Método main
    public static void main(String[] args) {
        // Creamos un objeto de la clase Division llamado ds
        Division ds = new Division();
        // Asignamos valores a los atributos num y num2 del objeto ds
        ds.setNum(19);
        ds.setNum2(8);
        // Obtenemos los valores de num y num2, los dividimos y guardamos el
        // resultado en a
        int a = ds.getNum() / ds.getNum2();
        // Imprimimos el resultado de la división del primer objeto
        System.out.println("Resultado 1: " + a);
        // Creamos un segundo objeto de la clase Division llamado ds2
        Division ds2 = new Division();
        // Asignamos valores a los atributos num y num2 del objeto ds2
        ds2.setNum(38);
        ds2.setNum2(7);
        // Obtenemos los valores de num y num2, los dividimos y guardamos el
        // resultado en b
        int b = ds2.getNum() / ds2.getNum2();
        // Imprimimos el resultado de la división del segundo objeto
        System.out.println("Resultado 2: " + b);
    }
}