import java.util.Scanner;
public class sistemaAutenticacion {

    public static void main(String[] args) {
    var consola = new Scanner(System.in);
    
    //Constantes de valores validos
    final var usuario = "admin";
    final var contrasenia = "123";
    
    //Valores solicitados
    System.out.print("Digite su usuario: ");
    var usuario1 = consola.nextLine();
    System.out.print("Digite su contrasenia: ");
    var contrasenia1 = consola.nextLine();
    
    //sistema de autenticación 
    
    var autenticacion = usuario.equals(usuario1) && contrasenia1.equals(contrasenia);
    if (autenticacion == true){
        System.out.println("El useuario es correcto?: Si");
    } else System.out.println("El usuario es correcto?: No");
        
    }
    
}
