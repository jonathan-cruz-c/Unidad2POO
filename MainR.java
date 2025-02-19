//Se crea la clase principal
class MainR {
    //Se crea el metodo main
public static void main(String[] args) {
    //Se crea el primerobjeto de la clase Resta
    Resta r = new Resta();
    //Se crea el segundo objeto de la clase Resta
    Resta r2 = new Resta();
    //Se crea el primer valor
    r.setNum1(9);
    //El segundo valor
    r.setNum2(20);
    //Se crea una variable del resultado de la resta de el objeto 1
    int z = r.getNum1()-r.getNum2();
    //Se imprime el resultado de la resta
    System.out.println(z);
    //Se crea el valor del segundo objeto
    r2.setNum1(1);
    //Se crea el segundo valor del segundo objeto
    r2.setNum2(4);
    //Se crea una variable del resultado de la resta de el objeto 2
    int y = r2.getNum1()-r2.getNum2();
    //Se imprime el resultado del segundo objeto
    System.out.println(y);
    
}   
}