//Se crea la clase del objeto 
class Modulo{
    //Se crea el primer atributo
    int num1;
    //Se crea el segundo atributo
    int num2;
    //Se crea el constructor
    Modulo() { }
    //Se crea el constructor con parametros
    public int getNum1() {
        //Se crea el metodo getNum1
        return num1;
    }
    //Se crea el constructor con parametros
    public void setNum1(int num1) {
        //Se crea el metodo setNum1
        this.num1 = num1;
        //Se crea el metodo setNum2

    }
    public int getNum2() {
        //Se crea el metodo getNum2
        return num2;
    }
    //Se crea el metodo setNum2
    public void setNum2(int num2) {
        //Se crea el metodo setNum2
        this.num2 = num2;
    }
    //Se crea el metodo getNum1
    @Override
    //Se crea el metodo toString
    public String toString() {
        //Se crea el metodo toString
        return "Modulo [num1=" + num1 + ", num2=" + num2 + "]";
    }
}
