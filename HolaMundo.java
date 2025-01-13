
import java.util.Random;
import java.util.Scanner;

//Se crea una programa el cual pueda generar ID unicos
public class HolaMundo {
    public static void main(String[] args) {
      
      //Establecer variable Scanner
       var consola = new Scanner(System.in);
       
       //Establecer variable Random la cual generá un numero aleatorio
       var random = new Random();
       
       //Se establece la variable Nombre esta se almacenará por consola
       System.out.print("Indica tu nombre: ");
       var nombre = consola.nextLine();
       
       //Se establece la variable apellido esta se almacenará por consola
       System.out.print("Indica tu apellido: ");
       var apellido = consola.nextLine();
       
       //Se establece la variable Año de namiciento esta se almacenará por consola
       System.out.print("Indica el ano de tu nacimiento (YYYY): ");
       var nacimiento = consola.nextLine();
       
       var numeroA = random.nextInt(9999);
       
       //Subcadena de Nombre en dode se tomará los dos primeros digitos:
       var subNombre = nombre.substring(0,2).toUpperCase();
       
       //Subcadena de Apellido en dode se tomará los dos primeros digitos:
       var subApellido = apellido.substring(0,2).toUpperCase();
       
       //Subcadena de Fecha en dode se tomará los dos ultimos digitos:
       var subNacimiento = nacimiento.substring(2);
       
       //Cadena
      
     //Creación del generador de ID unico
        System.out.printf("""
                          -----------------------------------------------------------------------------------------------------------------
                          HOLA %s SU ID UNICO FUE CREADO CON EXITO
                          A CONTINUACION PODRAS VER TU ID.
                          
                          ID:%s%s%s%04d
                          """,nombre.toUpperCase(),subNombre,subApellido,subNacimiento,numeroA);
    
  
       
    }
}