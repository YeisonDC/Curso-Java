
import java.util.Scanner;
public class MayorDe2Numeros {

    public static void main(String[] args) {
       var consola = new Scanner(System.in);
        //Nombre del sistema
        System.out.println(" ***Detector de numero mayor*** ");
        
        //Solicitud de valores
        System.out.print("Indica un valor: ");
        var valor1 = Integer.parseInt(consola.nextLine());
        System.out.print("Indica el segundo valor: ");
        var valor2 = Integer.parseInt(consola.nextLine());
        
        //Calculo de valor
        System.out.println("------ Resultado -------");
        if (valor1 > valor2){System.out.println("El sistema concluyo que el valor mayor es: " + valor1);
            }
        else if (valor1 < valor2){System.out.println("El sistema concluyo que el valor mayor es: " + valor2);
            }
        else System.out.println("El sistema concluyo que los valores son iguales");
        
        //cerrar scanner
        consola.close();
    }
}
