
import java.util.Scanner;


public class RevisionNumero {
    public static void main(String[] args) {
    var consola = new Scanner(System.in);
        //Titulo
        System.out.println("***Revision de numero***");
        //Solicitud de valor
        System.out.print("Indique un numero: ");
        var numero = Integer.parseInt(consola.nextLine());
        //Validación de los daots
        if (numero > 0){
            System.out.println("El numero es positivo");
            }
        else if (numero <0){
            System.out.println("El numero es negativo");
            }
        else System.out.println("El numero es 0");
    }   
}
