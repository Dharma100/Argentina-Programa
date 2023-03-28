import java.util.Scanner;

public class ejercicio1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los grados centigrados :");
        Double centigrado = sc.nextDouble();
        System.out.println("Ingresado correctamente...");
        System.out.println("La cantidad de Grados Farenheit es: " + Farenheit(centigrado));


        sc.close();
    }

    public static Double Farenheit(double grados){
        double farenheit = (grados * 1.8) + 32;
        return farenheit;
    }
  
}
