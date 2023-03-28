import java.util.Scanner;

public class ejercicio1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para trabajar:");
        double num = sc.nextInt();
        System.out.println("El doble de ese numero es: " + (num*2));
        System.out.println("El triple de ese numero es: " + (num*3));
        System.out.println("La raiz cuadrada es: " + Math.sqrt(num));

        sc.close();
        
    }
}
