
import java.util.Scanner;


public class descuentosVip {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        //Programa generador de descuentos VIP
        System.out.println(" ***Descuentos Vip*** ");
        //Verificación
        System.out.print("Cuantos productos compro?: ");
        var productos = Integer.parseInt(consola.nextLine());
        System.out.print("El cliente cuenta con membresia?: ");
        boolean membresia = consola.nextBoolean();
        var descuentos = productos >= 10 && membresia == true;
        System.out.print("el cliente tiene descuento especial? = " + descuentos);
        
    }
    
}
