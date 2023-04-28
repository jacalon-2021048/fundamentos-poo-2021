import java.util.Scanner;
public class ArregloPrincipal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArregloStrings as=new ArregloStrings();
        MetodosCalcuParametros mcp=new MetodosCalcuParametros();
        MetodosCalcuParametrosIte mcpi=new MetodosCalcuParametrosIte();
        int opciones;
        String valor;
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("1............CREAR EL ARREGLO............");
        System.out.println("2............AGREGAR INFO AL ARREGLO............");
        System.out.println("3............SUMA............");
        System.out.println("4............RESTA............");
        System.out.println("5............MULTIPLICACION............");
        System.out.println("6............DIVISION............");
        System.out.println("7............CONTEO DONDE USTED INGRESA EL LIMITE............");
        System.out.println("8............CONTEO DONDE USTED INGRESA EL LIMITE Y EL INICIO DE LA CUENTA............");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Ingrese la opcion deseada");
        opciones=sc.nextInt();
        switch(opciones){
            case 1:
                as.CreacionArreglo();
            break;
            case 2:
                for(int a=0;a<5;a++){
                    System.out.println("Ingrese los datos para agregarlos al arreglo");
                    valor=sc.next();
                    as.AgregarDatosArr(valor,a);
                }
                System.out.println("Se muestran los datos en el arreglo");
                as.MostrarDatosArr();
            break;

            case 3:
                
            break;

            default:
                System.out.println("Escribir un numero dentro de las opciones del menu");
            break;
        }
    }
}