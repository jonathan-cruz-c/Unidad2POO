// Definimos una clase llamada MainR
class MainR {
    // Método main
    public static void main(String[] args) {
        // Declaramos un objeto de la clase Resta llamada rs
        Resta rs = new Resta();
        // Asignamos valores a la variable rs a los atributos num y num2
        rs.setNum(19);
        rs.setNum2(8);
        // Guardamos la operación de resta en la variable a
        int a = rs.getNum() - rs.getNum2();
        // Imprimimos el resultado de la primera operación de resta
        System.out.println("Resultado 1: " + a);
        // Creamos un objeto de la clase Resta llamada rs2
        Resta rs2 = new Resta();
        // Asignamos valores a la variable rs2 a los atributos num y num2
        rs2.setNum(22);
        rs2.setNum2(13);
        // Guardamos la operación de resta en la variable b
        int b = rs2.getNum() - rs2.getNum2();
        // Imprimimos el resultado de la segunda operación de resta
        System.out.println("Resultado 2: " + b);
    }
}