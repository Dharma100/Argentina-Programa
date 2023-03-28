// Crear un programa que pida una frase y si esa frase es igual a “eureka”
//  el programa pondrá un mensaje de Correcto, 
//  sino mostrará un mensaje de Incorrecto. 
//  Nota: investigar la función equals() en Java.



import java.util.Scanner;

public class ejercicio2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase: ");
        String frase = sc.nextLine();

        if (frase.toLowerCase().equals("eureka")){
            System.out.println("La frase es correcta");
        }else{
            System.out.println("La frase es incorrecta");    
        }

        sc.close();
    }
}
