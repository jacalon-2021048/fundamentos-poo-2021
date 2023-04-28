public class ArregloStrings{
    String[] arreglo = new String[5];
    
    public void CreacionArreglo(){
        System.out.println("El arreglo se creo con exito");
    }
    public void AgregarDatosArr(String valor, int x){
        arreglo[x]=valor;
    }

    public void MostrarDatosArr(){
        for(int f=0;f<arreglo.length;f++){
            System.out.println(arreglo[f]);
        }
        /*for(String g:arreglo){
            System.out.println(g);
        }*/
    }
}