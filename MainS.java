//Se crea la clase principal
class MainS {
    //Se crea el metodo main
public static void main(String[] args) {
    //Se crea el primerobjeto de la clase Suma
    Suma s = new Suma();
    //Se crea el segundo objeto de la clase Suma
    Suma s2 = new Suma();
    //Se crea el primer valor
    s.setNum2(20);
    //El segundo valor
    s.setNum1(10);
    //Se imprime el resultado del objeto Suma
    System.out.println(s.getNum1()+s.getNum2());
    //Se crea el valor del segundo objeto
    s2.setNum1(10);
    //Se crea el segundo valor del segundo objeto
    s2.setNum2(20);
    //Se imprime el resultado del segundo objeto
    System.out.println(s2.getNum1()+s2.getNum2());
}   
}