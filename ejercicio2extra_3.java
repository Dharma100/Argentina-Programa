// Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
// Caso contrario mostrar un
//  mensaje. Nota: investigar la función equals() de la clase String.


import java.util.Scanner;

public class ejercicio2extra_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una letra y evaluaré si es vocal");

        String letra = sc.nextLine();

        System.out.println("===========================");

        if(letra.toLowerCase().equals("a") || letra.toLowerCase().equals("e") || letra.toLowerCase().equals("i") || letra.toLowerCase().equals("o") || letra.toLowerCase().equals("u")){
            System.out.println("LA LETRA ES VOCAL");
        }else{
            System.out.println("LA LETRA NO ES VOCAL");
        }

        System.out.println("===========================");
        sc.close();
    }
}
