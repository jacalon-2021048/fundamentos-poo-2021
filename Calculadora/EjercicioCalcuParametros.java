import java.util.Scanner;
public class EjercicioCalcuParametros{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        MetodosCalcuParametros mc=new MetodosCalcuParametros();
        MetodosCalcuParametrosIte mcpIte=new MetodosCalcuParametrosIte();
        int a;
        int b;
        int apoyo;
        int opciones;
        System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("1.......Suma");
		System.out.println("2.......Resta");
		System.out.println("3.......Multiplicacion");
        System.out.println("4.......Division");
        System.out.println("5.......Iteraciones");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("Ingrese el numero de la operacion deseada");
		opciones=scanner.nextInt();
        switch(opciones){
            case 1:
                System.out.println("Ingrese el primer valor a sumar");
                a=scanner.nextInt();
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("Ingrese el segundo valor a sumar");
                b=scanner.nextInt();
                apoyo=mc.retornarNumeroSum(a,b);
                System.out.println(a+"+"+b+"="+apoyo);
            break;

            case 2:
                System.out.println("Ingrese el primer valor a restar");
                a=scanner.nextInt();
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("Ingrese el segundo valor a restar");
                b=scanner.nextInt();
                apoyo=mc.retornarNumeroRes(a,b);
                System.out.println(a+"-"+b+"="+apoyo);
            break;

            case 3:
                System.out.println("Ingrese el primer valor a multiplicar");
                a=scanner.nextInt();
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("Ingrese el segundo valor a multiplicar");
                b=scanner.nextInt();
                apoyo=mc.retornarNumeroMul(a,b);
                System.out.println(a+"*"+b+"="+apoyo);
            break;

            case 4:
                System.out.println("Ingrese el primer valor a dividir");
                a=scanner.nextInt();
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("Ingrese el segundo valor a dividir");
                b=scanner.nextInt();
                mc.retornarNumeroDiv(a,b);
            break;
            case 5:
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("1.......Cuenta donde usted ingresa el limite");
                System.out.println("2.......Cuenta donde usted ingresa el limite y el inicio");
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("Ingrese el numero de la operacion deseada");
                opciones=scanner.nextInt();
                switch(opciones){
                    case 1:
                        System.out.println("------------------------------------------------------------------------------------------------------------");
                        System.out.println("Ingrese el limite de la cuenta");
                        System.out.println("------------------------------------------------------------------------------------------------------------");
                        a=scanner.nextInt();
                        System.out.println("------------------------------------------------------------------------------------------------------------");
                        mcpIte.conteo1(a);
                    break;

                    case 2:
                        System.out.println("------------------------------------------------------------------------------------------------------------");
                        System.out.println("Ingrese el inicio de la cuenta");
                        System.out.println("------------------------------------------------------------------------------------------------------------");
                        a=scanner.nextInt();
                        System.out.println("------------------------------------------------------------------------------------------------------------");
                        System.out.println("Ingrese el limite de la cuenta");
                        b=scanner.nextInt();
                        System.out.println("------------------------------------------------------------------------------------------------------------");
                        mcpIte.conteo2(a,b);
                    break;
                
                    default:
                        System.out.println("Ingrese un numero dentro de los valores del menu");
                    break;
                }


            break;
            default:
                System.out.println("Ingrese un numero dentro de los valores del menu");
            break;
        }
    }
}