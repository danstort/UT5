import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Coche coche1 = new Coche ();
        char a;
        int b;

        a = tec.nextLine().charAt(0);
        b = tec.nextInt();
        

        switch (a) {
            case 'A':
                coche1.acelera(b);
                break;

            case 'F':
                coche1.frena(b);
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println("La velocidad actual es: "+coche1.getVelocidad()+" KM/H");

    }

}
