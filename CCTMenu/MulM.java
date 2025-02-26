//Se crea la clase MulM
class MulM{

    //Se declara el primer atributo de la clase
    int n1;
    //Se declara el segundo atributo de la clase
    int n2;
    //Se declara el constructor de la clase
   public MulM(){    }
   //Se declara el método getN1 para obtener el valor del atributo n1
   public int getN1() {
       return n1;
   }
   //Se declara el método setN1 para asignar el valor del atributo n1
   public void setN1(int n1) {
       //Se asigna el valor del atributo n1 al atributo de la clase
       this.n1 = n1;
   }
   //Se declara el método getN2 para obtener el valor del atributo n2
   public int getN2() {
       return n2;
   }
   //Se declara el método setN2 para asignar el valor del atributo n2
   public void setN2(int n2) {
       //Se asigna el valor del atributo n2 al atributo de la clase
       this.n2 = n2;
   }
   //Se declara el método toString para obtener una representación del objeto como una cadena de caracteres
   @Override
   public String toString() {
       return "SumaM [n1=" + n1 + ", n2=" + n2 + "]";
   } 
   

}