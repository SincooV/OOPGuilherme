public class Triangulo {


    private double altura;
    private double base;


    public void setAltura(double h) {
        this.altura = h;

    }

    public void setBase(double b) {
        this.base = b;

    }

    public double calcATriangulo() {
        return (this.altura * this.base)/2;
    }
    public double calcPTriangulo() {
        return (this.altura + this.base + this.altura);
    }






}

