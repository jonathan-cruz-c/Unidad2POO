//Se crea la clase del objeto 
class Div{
    //Se crea el primer atributo
    double num1;
    //Se crea el segundo atributo
    double num2;
    //Se crea el constructor
    Div() { }
    //Se crea el constructor con parametros
    public double getNum1() {
        //Se crea el metodo getNum1
        return num1;
    }
    //Se crea el constructor con parametros
    public void setNum1(double num1) {
        //Se crea el metodo setNum1
        this.num1 = num1;
    }
    //Se crea el metodo getNum2
    public double getNum2() {
        //Se crea el metodo getNum2
        return num2;
    }
    //Se crea el metodo setNum2
    public void setNum2(double num2) {
        //Se crea el metodo setNum2
        this.num2 = num2;
    }
    
    @Override
    //Se crea el metodo toString
    public String toString() {
        //Se crea el metodo toString
        return "Div [num1=" + num1 + ", num2=" + num2 + "]";
    }
    
    
}