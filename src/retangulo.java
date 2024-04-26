public class retangulo {
    private double baseret;
    private double retanguloH;


    public void setRetanguloH(double h){
        this.retanguloH = h;
    }
    public void setBaseret(double bh){
        this.baseret = bh;

    }
    public double calcularAreaRetangulo(){
        return this.baseret * retanguloH;
    }

    public double calcularPerimetroRetangulo(){
        return this.baseret + retanguloH + baseret + retanguloH;
    }





}
