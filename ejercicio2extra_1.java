// Dado un tiempo en minutos, calcular su equivalente en días y horas. 
// Por ejemplo, si el usuario ingresa 1600 minutos, el sistema 
// debe calcular su equivalente: 1 día, 2 horas.


import java.util.Scanner;

public class ejercicio2extra_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos");

        int minutos = sc.nextInt();

        

        double horas = minutos/60;

        double dias = minutos/1440;
        
        double sobranteHoras = horas%24;

        double sobranteDias = dias%60;



        System.out.println("Corresponde a " + sobranteDias + " dias, y " + sobranteHoras + " horas." );
      
        
        sc.close();
        
    }
    
}
