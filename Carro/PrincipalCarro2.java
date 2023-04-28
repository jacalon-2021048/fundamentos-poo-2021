import java.util.Scanner;
public class PrincipalCarro2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Carro[] arregloCarro=new Carro[3];
        Camioneta[] arregloCamioneta=new Camioneta[3];
        Camion[] arregloCamion=new Camion[3];
        int apoyo=0;
        String marcaModif;
        String marcaNueva;
        arregloCarro[0]=new Carro("Toyota","Hilux",2021,"abc503");
        arregloCarro[1]=new Carro("Volkswagen","Jetta",2021,"fdg943");
        arregloCarro[2]=new Carro("Chevrolet","Camaro",2021,"fds654");

        arregloCamioneta[0]=new Camioneta("Volkswagen","Tiguan",2011,"asd562",8.50);
        arregloCamioneta[1]=new Camioneta("Chevi","Cotello",2021,"gas561",12.61);
        arregloCamioneta[2]=new Camioneta("Chevrolet","Camaro",2021,"hyf326",54.86);

        arregloCamion[0]=new Camion("Hino","A650",2000,"asd557",9);
        arregloCamion[1]=new Camion("Hino","C200",1999,"asd456",2);
        arregloCamion[2]=new Camion("Volkswagen","C900",2021,"asf465",5);

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("SE MUESTRAN LOS DATOS EN EL ARREGLO DE LOS CARROS");
        System.out.println("------------------------------------------------------------------------------------");
        for(int d=0;d<arregloCarro.length;d++){
            System.out.println(arregloCarro[d].getMarca()+" "+arregloCarro[d].getModelo()+
            " "+arregloCarro[d].getAnio()+" "+arregloCarro[d].getPlaca());
        }


        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("SE MUESTRAN LOS DATOS EN EL ARREGLO DE LAS CAMIONETAS");
        System.out.println("------------------------------------------------------------------------------------");
        for(int j=0;j<arregloCamioneta.length;j++){
            System.out.println(arregloCamioneta[j].getMarca()+" "+arregloCamioneta[j].getModelo()+
            " "+arregloCamioneta[j].getAnio()+" "+arregloCamioneta[j].getPlaca()+" "+arregloCamioneta[j].getPesoCamioneta());
        }


        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("SE MUESTRAN LOS DATOS EN EL ARREGLO DE LOS CAMIONES");
        System.out.println("------------------------------------------------------------------------------------");
        for(int g=0;g<arregloCamion.length;g++){
            System.out.println(arregloCamion[g].getMarca()+" "+arregloCamion[g].getModelo()+
            " "+arregloCamion[g].getAnio()+" "+arregloCamion[g].getPlaca()+" "+arregloCamion[g].getCantidadEjes());
        }


        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("INGRESE LA MARCA A MODIFICAR EN EL ARREGLO DE LOS CARROS");
        System.out.println("------------------------------------------------------------------------------------");
        marcaModif=sc.next();
        System.out.println("------------------------------------------------------------------------------------");
        for(int d=0;d<arregloCarro.length;d++){
            if(marcaModif.equals(arregloCarro[d].getMarca())){
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("INGRESE LA MARCA NUEVA");
                System.out.println("------------------------------------------------------------------------------------");
                marcaNueva=sc.next();
                arregloCarro[d].setMarca(marcaNueva);
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("SE MUESTRAN LOS DATOS MODIFICADOS");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println(arregloCarro[d].getMarca()+" "+arregloCarro[d].getModelo()+
                " "+arregloCarro[d].getAnio()+" "+arregloCarro[d].getPlaca());
            }else{
                apoyo++;
            }
            if(apoyo==arregloCarro.length){
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("LA MARCA NO SE ENCUENTRA EN EL ARREGLO DE LOS CARROS");
                System.out.println("------------------------------------------------------------------------------------");
            }
        }


        apoyo=0;
        marcaModif=null;
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("INGRESE LA MARCA A MODIFICAR EN EL ARREGLO DE LAS CAMIONETAS");
        System.out.println("------------------------------------------------------------------------------------");
        marcaModif=sc.next();
        for(int d=0;d<arregloCamioneta.length;d++){
            if(marcaModif.equals(arregloCamioneta[d].getMarca())){
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("INGRESE LA MARCA NUEVA");
                System.out.println("------------------------------------------------------------------------------------");
                marcaNueva=sc.next();
                arregloCamioneta[d].setMarca(marcaNueva);
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("SE MUESTRAN LOS DATOS MODIFICADOS");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println(arregloCamioneta[d].getMarca()+" "+arregloCamioneta[d].getModelo()+
                " "+arregloCamioneta[d].getAnio()+" "+arregloCamioneta[d].getPlaca());
            }else{
                apoyo++;
            }
            if(apoyo==arregloCamioneta.length){
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("LA MARCA NO SE ENCUENTRA EN EL ARREGLO DE LAS CAMIONETAS");
                System.out.println("------------------------------------------------------------------------------------");
            }
        }
        
        apoyo=0;
        marcaModif=null;
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("INGRESE LA MARCA A MODIFICAR EN EL ARREGLO DE LOS CAMIONES");
        System.out.println("------------------------------------------------------------------------------------");
        marcaModif=sc.next();
        for(int d=0;d<arregloCamion.length;d++){
            if(marcaModif.equals(arregloCamion[d].getMarca())){
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("INGRESE LA MARCA NUEVA");
                System.out.println("------------------------------------------------------------------------------------");
                marcaNueva=sc.next();
                arregloCamion[d].setMarca(marcaNueva);
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("SE MUESTRAN LOS DATOS MODIFICADOS");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println(arregloCamion[d].getMarca()+" "+arregloCamion[d].getModelo()+
                " "+arregloCamion[d].getAnio()+" "+arregloCamion[d].getPlaca());
            }else{
                apoyo++;
            }
            if(apoyo==arregloCamion.length){
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("LA MARCA NO SE ENCUENTRA EN EL ARREGLO DE LOS CAMIONES");
                System.out.println("------------------------------------------------------------------------------------");
            }
        }

    }
}