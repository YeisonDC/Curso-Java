
import java.util.Scanner;
public class SistemaCalificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
     
        //Nombre del programa
        System.out.println(" ***Sistema de calificacion informacion*** ");
        
        //Solicitud de informacion al docente
        //nombre
        System.out.print("Indica tu nombre: ");
        var nombre = consola.nextLine();
        
        //Grado
        System.out.print("Indica el curso: ");
        var curso = consola.nextLine();
        
        //Mensaje de ingreso al sistema
        System.out.printf("""
                          -------------------- SISTEMA ---------------------
                          HOLA %s BIENVENIDO ES UN GUSTO PARA NOSOTROS
                          TENER DE VUELTA POR AQUI A CONTINUACION PODRAS
                          DIGITAR LAS NOTAS A SUBIR PARA TUS ALUMNOS DEL CURSO
                          %s.
                          """, nombre.toUpperCase().strip(), curso.toUpperCase());
        
        //Cambio de pestaña
        System.out.println(" \n***Sistemade calificacion notas*** ");
        //Solicitud de notas
        System.out.print("\nIngrese el primer nombre de su alumno: ");
        var alumnoNombre = consola.nextLine(); //Se solicita el nombre del alumno
        
        System.out.print("Ingrese el primer apellido de su alumno: ");
        var alumnoApellido = consola.nextLine(); //Se solicita el apellido del alumno
      
        System.out.print("Ingrese la nota final de su materia: ");
        double alumnoNotaFinal = consola.nextDouble(); //Se solicita la nota final del alumno
        
        //Conversion de numero a letras (Se asignarán unas letras especificas dependiendo de la nota)
        var notaFinal = "0";
        
        if (alumnoNotaFinal >= 9 && alumnoNotaFinal <= 10){
            notaFinal = "A";
           }
        else if (alumnoNotaFinal >= 8 && alumnoNotaFinal < 9){
            notaFinal = "B";
        }
        else if (alumnoNotaFinal >= 7 && alumnoNotaFinal < 8){
            notaFinal = "C";
        }
        else if (alumnoNotaFinal >= 6 && alumnoNotaFinal < 7){
            notaFinal = "D";
        }
        else if (alumnoNotaFinal >= 0 && alumnoNotaFinal < 6){
            notaFinal = "F";
        }
        else { notaFinal = "Valor Desconocido";
        }

        //Impresión
        System.out.printf("""
                          --------------SISTEMA--------------
                          NOTA SUBIDA CON EXITO SR %s
                          Nombre del alumno: %s
                          Apellido del alumno: %s
                          Nota Final: %.2f %s
                          """, nombre.toUpperCase().strip(),alumnoNombre.toUpperCase().strip(),alumnoApellido.toUpperCase().strip(),
                            alumnoNotaFinal,notaFinal.toUpperCase().strip());
        consola.close();
               }
}