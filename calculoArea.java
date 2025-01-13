
import java.util.Scanner;

public class calculoArea {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(" ***Calculadora de area*** ");
        //Solicitud de informacion
        System.out.print("Indique la base del rectangulo: ");
        var base = Integer.parseInt(consola.nextLine());
        System.out.print("Indique la altura del rectangulo: ");
        var altura = Integer.parseInt(consola.nextLine());
        //Calculo del area del rectangulo
        var area = base * altura;
        System.out.println("area = " + area);
        //Calculo del perimetro del rectangulo
        var perimetro =2*(base + altura);
        System.out.println("perimetro = " + perimetro);
    }
    
}
