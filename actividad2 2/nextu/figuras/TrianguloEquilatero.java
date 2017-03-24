package nextu.figuras;

public class TrianguloEquilatero extends Triangulo{
    public double lado;

    public TrianguloEquilatero(double lado) {
        super(lado, Math.sqrt(3)*(lado/2.0), lado, lado, lado);
        this.lado = lado;
    }
    
}
