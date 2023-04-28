public class MetodosCalcuParametros{
    int total;
    public int retornarNumeroSum(int a, int b){
        total=a+b;
        return total;
    }
    public int retornarNumeroRes(int a, int b){
        total=a-b;
        return total;
    }
    public int retornarNumeroMul(int a, int b){
        total=a*b;
        return total;
    }
    public void retornarNumeroDiv(int a, int b){
        if(b==0){
            System.out.println("La division entre el numero " + b +" no es posible");
        }else{
            total=a/b;
            System.out.println(a+"/"+b+"="+total);
        }
    }
}