package web;
// Ejercicio 12
// Escribir un programa en el que se pregunte al usuario por una frase y una letra, 
// y muestre por pantalla el número de veces que aparece la letra en la frase.

import java.util.Scanner;

public class ejercicio_web8 {
    public static void main(String[] args) {

        int i,contador;
        contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        // char letra = sc.next().charAt(0) ;

        // while (letra.length() != 1){
        System.out.println("Ingrese la letra a buscar: ");
        char letra = sc.next().charAt(0);
        // }

        for (i=0; i<frase.length(); i++){
            if (frase.charAt(i) == letra){

                contador ++;
            }

            sc.close();
            
        }
        
        System.out.println("La letra aparece " + contador + " veces.");

       
    }
    
}
