import java.util.Scanner;
public class sistemaAutenticacion {

    public static void main(String[] args) {
    var consola = new Scanner(System.in);
    
    //Constantes de valores validos
    final var usuario = "admin";
    final var contrasenia = "123";
    
    
   
    //Valores solicitados
    System.out.print("Ingrese su usuario: ");
    var usuario1 = consola.nextLine().toLowerCase().strip();
    System.out.print("Ingrese su contrasenia: ");
            
    var contrasenia1 = consola.nextLine().toLowerCase().strip();
    
    /* parte 1
    
    //sistema de autenticación 
    
    var autenticacion = usuario.equals(usuario1) && contrasenia1.equals(contrasenia);
    if (autenticacion == true){
        System.out.println("El useuario es correcto?: Si");
    } else System.out.println("El usuario es correcto?: No");*/
    
   // Parte 2 este será una nueva mejora donde se tendrá una mejor autenticacion
   
   if (usuario1.equals(usuario) && contrasenia1.equals(contrasenia)){
       System.out.println("BIENVENIDO AL SISTEMA");
         }
   else if (usuario1.equals(usuario)){
       System.out.println("Contrasenia incorrecta por favor digitela nuevamente");    
        }
   else if (contrasenia1.equals(contrasenia)){
        System.out.println("Usuario incorrecto por favor digitelo nuevamente");
        }
   else {
     System.out.println("Credenciales incorrectas digitelas nuevamente");
        }
   
    }
    
}
