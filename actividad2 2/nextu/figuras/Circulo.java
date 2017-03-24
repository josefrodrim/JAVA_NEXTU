package nextu.figuras;

public class Circulo extends Figura {
    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio;
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*radio;
    }
    
}
