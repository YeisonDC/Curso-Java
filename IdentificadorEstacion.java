
import java.util.Scanner;
public class IdentificadorEstacion {
    public static void main(String[] args) {
    var consola = new Scanner(System.in);
    //Nombre del programa
    System.out.println(" ***Sistema identificador de estaciones*** ");
    
    //Solicitud de informacion
    System.out.print("Proporcione el valor numero de un mes: ");
    var numero = consola.nextInt();
    
    //calculo+
    var resultado = "resultado";

    if (numero >= 3 && numero < 6){resultado = "Primavera";
        }
    else if (numero >= 6 && numero < 9){resultado = "Verano";
        }
    else if (numero >= 9 && numero < 12){resultado = "Otonio";
        }
    else if (numero >= 1 && numero <= 12){resultado = "Invierno";
        }
    else {resultado = "Estacion desconocida";
        }
        System.out.printf("""
                          \n------------- resultado -------------
                          \tUsted se encuentra en la estacion: %s
                          \n\tMuchas gracias por utilizar la aplicacion :D      
                          """, resultado);
    consola.close();
    }
 }
