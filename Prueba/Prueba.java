public class Prueba{
    //ATRIBUTOS
    int atributoA=200;
    String atributoB="Soy atributo de la clase prueba";
    //METODOS
    //Sintaxis:
    //modificador de acceso, valor de retorno,nombre metodo
    public void mostrarMensaje(){
        System.out.println("Esto es un metodo de la clase Prueba");
    }
    public int retornarNumero(){
        return 9789;
    }
    public double retornarDecimal(){
        double a=56.1;
        double b=4.8;
        double total=a+b;
        return total;
    }
}