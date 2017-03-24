package nextu.pintor;

public class AplicacionDeDibujo {
    
    
    public static void main(String args[]){
        Pintador pintador1 = new Pincel();
        Pintador pintador2 = new Brocha();
        pintador1.pintar();
        pintador2.pintar();
    }
    
    
}
