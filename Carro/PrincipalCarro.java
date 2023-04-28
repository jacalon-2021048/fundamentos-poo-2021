public class PrincipalCarro{
    public static void main(String[] args) {
        Carro carro0=new Carro("Toyota","Hilux",2021,"abc503");
       /*Carro carro1=new Carro("Volkswagen","Jetta",2021,"fdg943");
        Carro carro2=new Carro("Chevrolet","Camaro",2021,"fds654");
        Carro carro3=new Carro("Alfa Romeo","Savage",2021,"fds849");
        Carro carro4=new Carro("Mini Cooper","Mini Cooper",2021,"jku564");


        System.out.println(carro0.retornarMarca()+" "+carro0.retornarModelo()+" "+carro0.retornarAnio()+" "+carro0.retornarPlaca());
        System.out.println(carro1.retornarMarca()+" "+carro1.retornarModelo()+" "+carro1.retornarAnio()+" "+carro1.retornarPlaca());
        System.out.println(carro2.retornarMarca()+" "+carro2.retornarModelo()+" "+carro2.retornarAnio()+" "+carro2.retornarPlaca());
        System.out.println(carro3.retornarMarca()+" "+carro3.retornarModelo()+" "+carro3.retornarAnio()+" "+carro3.retornarPlaca());
        System.out.println(carro4.retornarMarca()+" "+carro4.retornarModelo()+" "+carro4.retornarAnio()+" "+carro4.retornarPlaca());

        Camioneta camioneta0=new Camioneta("Volkswagen","Tiguan",2011,"asd562",8.50);
        Camioneta camioneta1=new Camioneta("Alfa Romeo","Cotello",2021,"gas561",12.61);
        Camioneta camioneta2=new Camioneta("Chevrolet","Camaro",2021,"hyf326",54.86);
        Camioneta camioneta3=new Camioneta("Toyota","Corolla",2021,"gds590",465.20);
        Camioneta camioneta4=new Camioneta("Nissan","Centra",2021,"dgh562",4.5);




        System.out.println(camioneta0.retornarMarca()+" "+camioneta0.retornarModelo()+" "
        +camioneta0.retornarAnio()+" "+camioneta0.retornarPlaca()+" "+camioneta0.retornarPeso());
        System.out.println(camioneta1.retornarMarca()+" "+camioneta1.retornarModelo()+" "
        +camioneta1.retornarAnio()+" "+camioneta1.retornarPlaca()+" "+camioneta1.retornarPeso());
        System.out.println(camioneta2.retornarMarca()+" "+camioneta2.retornarModelo()+" "
        +camioneta2.retornarAnio()+" "+camioneta2.retornarPlaca()+" "+camioneta2.retornarPeso());
        System.out.println(camioneta3.retornarMarca()+" "+camioneta3.retornarModelo()+" "
        +camioneta3.retornarAnio()+" "+camioneta3.retornarPlaca()+" "+camioneta3.retornarPeso());
        System.out.println(camioneta4.retornarMarca()+" "+camioneta4.retornarModelo()+" "
        +camioneta4.retornarAnio()+" "+camioneta4.retornarPlaca()+" "+camioneta4.retornarPeso());*/

        System.out.println(carro0.getModelo());
        carro0.setModelo("Camaro");
        System.out.println(carro0.getModelo());
    }
}