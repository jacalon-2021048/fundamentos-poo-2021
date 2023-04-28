import java.util.Scanner;
public class MetodosCalcu{
    Scanner sc=new Scanner(System.in);
    int a;
    int b;
    int total;
    public int retornarNumeroSum(){
        System.out.println("Ingrese el primer valor a sumar");
        a=sc.nextInt();
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese el segundo valor a sumar");
        b=sc.nextInt();
        total=a+b;
        return total;
    }
    public int retornarNumeroRes(){
        System.out.println("Ingrese el primer valor a restar");
        a=sc.nextInt();
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese el segundo valor a restar");
        b=sc.nextInt();
        total=a-b;
        return total;
    }
    public int retornarNumeroMul(){
        System.out.println("Ingrese el primer valor a multiplicar");
        a=sc.nextInt();
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese el segundo valor a multiplicar");
        b=sc.nextInt();
        total=a*b;
        return total;
    }
}