import java.util.Scanner;

public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero1;
        int numero2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el primer numero entero: ");
        numero1 = scanner.nextInt();
        System.out.print("Introduzca el segundo numero entero: ");
        numero2 = scanner.nextInt();

        System.out.println("La suma es: "+(numero1 + numero2));
        System.out.println("La resta es: "+(numero1 - numero2));
        System.out.println("La multiplicación es: "+(numero1 * numero2));
        System.out.println("La división es: "+(numero1 / numero2));
    }

}