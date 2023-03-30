package web;
// Escribir un programa que pida al usuario un número entero y 
// muestre por pantalla un triángulo rectángulo como el de más abajo, 
// de altura el número introducido.

import java.util.Scanner;

public class ejercicio_web6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Ingrese un numero entero:");
        int num = sc.nextInt();

        String variable = "*";

        for (i = 0; i < num; i++){
            for (j = 0; j < 1; j++) {
                System.out.print(variable);
                variable += "*";
            }
            System.out.println("");
        }
        sc.close();
    }
}
