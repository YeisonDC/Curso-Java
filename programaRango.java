
import java.util.Scanner;

public class programaRango {

    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        
        System.out.println("***Progama deteccion de rango***");
        
        //Valor a proporcionar
        System.out.print("proporcione un valor numerico: ");
        var numero = Integer.parseInt(consola.nextLine());
        
        //Verificar rango de 0 a 5
        
        boolean numero1 = numero >= 0 && numero <= 5;     
        System.out.println("El numero se encuentra dentro del rango? = " + numero1);
        
    }
    
}
