//Se crea la clase principal
class MainM {
    //Se crea el metodo main
public static void main(String[] args) {
    //Se crea el primerobjeto de la clase Multiplicacion
    Mul m = new Mul();
    //Se crea el segundo objeto de la clase Multiplicacion
    Mul m2 = new Mul();
    //Se crea el primer valor
    m.setNum1(9);
    //El segundo valor
    m.setNum2(8);
    //Se crea una variable del resultado de la multiplicacion de el objeto 1
    int j = m.getNum1()*m.getNum2();
    //Se imprime el resultado de la multiplicacion
    System.out.println(j);
    //Se crea el valor del segundo objeto
    m2.setNum1(5);
    //Se crea el segundo valor del segundo objeto
    m2.setNum2(4);
    //Se crea una variable del resultado de la multiplicacion de el objeto 2
    int k = m2.getNum1()*m2.getNum2();
        //Se imprime el resultado del segundo objeto
    System.out.println(k);
    
}   
}