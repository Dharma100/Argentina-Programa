// Crear un programa que dado un número determine si es par o impar.

import java.util.Scanner;

public class ejercicio2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        do{
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
        }while(num==0);

        if(num % 2 == 0){
              System.out.println("El numero es par");
         }else{
              System.out.println("El numero no es par");
         }
        
       
    
        System.out.println("Finalizado");

        sc.close();
        
    }
    }