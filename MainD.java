//Se crea la clase principal
class MainD {
    //Se crea el metodo main
public static void main(String[] args) {
    //Se crea el primerobjeto de la clase Div
    Div d = new Div();
    //Se crea el segundo objeto de la clase Div
    Div d2 = new Div();
    //Se crea el primer valor
    d.setNum1(28);
    //El segundo valor
    d.setNum2(8);
    //Se crea una variable del resultado de la divicion de el objeto 1
    double j = d.getNum1()/d.getNum2();
    //Se imprime el resultado de la divicion
    System.out.println(j);
    //Se crea el valor del segundo objeto
    d2.setNum1(15);
    //Se crea el segundo valor del segundo objeto
    d2.setNum2(4);
    //Se crea una variable del resultado de la divicion de el objeto 2
    double k = d2.getNum1()/d2.getNum2();
        //Se imprime el resultado del segundo objeto
    System.out.println(k);
    
}   
}