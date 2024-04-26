public class Circulo {


    private int raio;
    private double pi = 3.14;

    public double calcularCircunferencia(){
        return this.pi * 2 * this.raio;
    }


    public void setRaio(int r){
         this.raio = r;

    }

    public double calcularDiametro(){
        return this.calcularCircunferencia() * 2;

    }
}
