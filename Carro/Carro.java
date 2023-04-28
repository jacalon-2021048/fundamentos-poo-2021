public class Carro{
    String marca;
    String modelo;
    int anio;
    String placa;

    /*public Carro(){
        marca="Honda";
        modelo="Civic";
        anio=2021;
        placa="502cpz";
    }*/

    public Carro(String m, String mo, int an, String pl){
        marca=m;
        modelo=mo;
        anio=an;
        placa=pl;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public int getAnio(){
        return anio;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }
}