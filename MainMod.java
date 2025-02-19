//Se crea la clase principal
class MainMod {
    //Se crea el metodo main
public static void main(String[] args) {
    //Se crea el primerobjeto de la clase Modulo
    Modulo o = new Modulo();
    //Se crea el segundo objeto de la clase Modulo
    Modulo o2 = new Modulo();
    //Se crea el primer valor
    o.setNum1(28);
    //El segundo valor
    o.setNum2(8);
    //Se crea una variable del resultado del modulo de el objeto 1
    int j = o.getNum1() % o.getNum2();
    //Se imprime el resultado del modulo
    System.out.println(j);
    //Se crea el valor del segundo objeto
    o2.setNum1(15);
    //Se crea el segundo valor del segundo objeto
    o2.setNum2(4);
    //Se crea una variable del resultado del modulo de el objeto 2
    int k = o2.getNum1() % o2.getNum2();
        //Se imprime el resultado del segundo objeto
    System.out.println(k);
    
}   
}