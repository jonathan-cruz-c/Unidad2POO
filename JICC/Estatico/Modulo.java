// Definimos una clase llamada Modulo
class Modulo {
    int num, num2;

    // Constructor vacio
    Modulo() {
    }

    // Metodo getter para obtener el valor de num
    public int getNum() {
        return num;
    }

    // Metodo setter para establecer el valor de num
    public void setNum(int num) {
        this.num = num;
    }

    // Metodo getter para obtener el valor de num2
    public int getNum2() {
        return num2;
    }

    // Metodo setter para establecer el valor de num2
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Método toString
    @Override
    public String toString() {
        return "Modulo [num=" + num + ", num2=" + num2 + "]";
    }
}