public class Camion extends Carro{
    int cantidadEjes;

    public Camion(String ma, String mod, int ani, String pla,int cantidadEjes){
        super(ma, mod, ani, pla);
        this.cantidadEjes=cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes){
        this.cantidadEjes = cantidadEjes;
    }

    public int getCantidadEjes(){
        return cantidadEjes;
    }
}