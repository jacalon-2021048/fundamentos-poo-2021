public class Principal{
    public static void main(String args[]){
        int item;
        String item2;
        Prueba objetoPrueba=new Prueba();
        int retorno;
        double decimal;

        item=objetoPrueba.atributoA;
        item2=objetoPrueba.atributoB;
        System.out.println(item);
        System.out.println(item2);
        objetoPrueba.mostrarMensaje(); //se llama al metodo de la clase Prueba
        retorno=objetoPrueba.retornarNumero();
        decimal=objetoPrueba.retornarDecimal();

        System.out.println(retorno);
        System.out.println("El resultado de la suma de decimales es:  " +decimal);

    }
}