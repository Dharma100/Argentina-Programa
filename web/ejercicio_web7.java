package web;
import java.util.Scanner;

public class ejercicio_web7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la contraseña correcta: ");

        String clave = sc.nextLine();
        String ingreso = "";
        int aux = 1 ;


        while (!ingreso.equals(clave)){
            System.out.println("Ingrese la clave. intento n°" + aux);
            ingreso = sc.nextLine();
            aux += 1;
        }

        System.out.println("CORRECTO.");

        sc.close();
    }
}
