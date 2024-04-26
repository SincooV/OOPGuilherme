public class Trapezio {
    private double basem;
    private double baseM;
    private double alturaTra;


    public void setAltura1(double h) {
        this.alturaTra = h;

    }

    public void setBaseM(double b) {
        this.basem = b;

    }
    public void setBasem(double b) {
        this.baseM = b;

    }

    public double calcTrap() {
        return ((this.basem + this.baseM )* (this.alturaTra))/2;
    }
   /// public double calcPTrap() {
    //    return (this.basem + this.baseM  + this.alturaTra + this.alturaTra);
   // }






}


