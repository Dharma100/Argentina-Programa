// Escriba un programa que pida una frase o palabra y valide si la primera 
// letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, 
// se deberá de imprimir un mensaje por 
// pantalla que diga “CORRECTO”, en caso contrario, 
// se deberá imprimir “INCORRECTO”. 
// Nota: investigar la función Substring y equals() de Java.


import java.util.Scanner;

public class ejercicio2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase que comience con A");

        String frase = sc.nextLine();
        String primera_letra = frase.substring(0, 1).toLowerCase();
        System.out.println("la primera letra es: " + primera_letra);


        if(primera_letra.equals("a")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }

        

    }
}
