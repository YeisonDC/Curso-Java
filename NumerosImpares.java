

public class NumerosImpares {

    public static void main(String[] args) {
        //while
        //Definimos la variable 
        var numero = 0;
        while(numero <= 20){
            if(numero % 2 >= 1)
                System.out.print(numero + ", ");
            numero++;
        }
        System.out.println("");
        //Do while
        var contador = 0;
        do{
            if (contador % 2 != 0)
            System.out.print(contador + ", ");
            contador++;
        } while(contador <= 20);
    }
    
}
