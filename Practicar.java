
import java.util.Random;
import java.util.Scanner;

public class Practicar {
/*Este archivo tiene como fin practicar los temas que crea que necesiten un refuerzo
  -primer tema: switch 
*/
    public static void main(String[] args) {
 //se importará lo basico para tener las herramientas disponibles
    var consola = new Scanner(System.in);
    var random = new Random();
    
    for (var contador = 0;contador <= 20;contador++){
        if(contador % 2 == 0){
            System.out.print(contador + " ");
        }
        
    }
  } 
}
