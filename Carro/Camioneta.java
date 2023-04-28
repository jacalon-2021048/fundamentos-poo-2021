public class Camioneta extends Carro{
    double pesoCamioneta;
    
    public Camioneta(String ma, String mo, int an, String pl,double pesoCamioneta){
        super(ma, mo, an, pl);
        this.pesoCamioneta=pesoCamioneta;
    }

    public void setPesoCamioneta(double pesoCamioneta){
        this.pesoCamioneta = pesoCamioneta;
    }

    public double getPesoCamioneta(){
        return pesoCamioneta;
    }
}