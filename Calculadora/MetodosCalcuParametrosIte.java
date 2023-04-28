public class MetodosCalcuParametrosIte{
    public void conteo1(int limite) {
        for(int x=0;x<=limite;x++){
            System.out.println(x);
        }
    }

    public void conteo2(int inicio, int limite){
        if(inicio>limite){
            System.out.println("El valor de inicio de la cuenta no puede ser mayor que el limite");
        }else{
            for(int x=inicio;x<=limite;x++){
                System.out.println(x);
            }
        }
    }
}