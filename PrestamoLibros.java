
import java.util.Scanner;
public class PrestamoLibros {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        //Sistema Prestamos de Libros
        System.out.println(" ***Prestamo de Libros*** ");
        //Verificación
        System.out.print(" El usuario tiene credencial del estudiante?(True/False): ");
        boolean tieneCredencial = Boolean.parseBoolean(consola.nextLine());
        System.out.print(" A cuantos kilometros a la redonde vives?: ");
        var kilometros = Integer.parseInt(consola.nextLine());
        var prestamos = tieneCredencial || kilometros <= 3;
        System.out.print("Se le puede prestar el libro?: " + prestamos);
    }
    
}
