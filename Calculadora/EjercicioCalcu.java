import java.util.Scanner;
public class EjercicioCalcu{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        MetodosCalcu mc=new MetodosCalcu();
        int apoyo;
        int opciones;
        System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("1.......Suma");
		System.out.println("2.......Resta");
		System.out.println("3.......Multiplicacion");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("Ingrese el numero de la operacion deseada");
		opciones=sc.nextInt();
        switch(opciones){
            case 1:
                apoyo=mc.retornarNumeroSum();
                System.out.println("El resultado de la suma es:  " + apoyo);
            break;

            case 2:
                apoyo=mc.retornarNumeroRes();
                System.out.println("El resultado de la resta es:  " + apoyo);
            break;

            case 3:
                apoyo=mc.retornarNumeroMul();
                System.out.println("El resultado de la multiplicacion es:  " + apoyo);
            break;
        }
    }
}