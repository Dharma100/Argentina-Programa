import java.util.Scanner;

public class ejercicio1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.println("La frase en minusculas es: ");
        System.out.println(Minusculas(frase));

        System.out.println("La frase en mayusculas es: ");
        System.out.println(Mayusculas(frase));

        sc.close();
    }



    public static String Minusculas(String frase){
        String frase_ok = frase.toLowerCase();
        return frase_ok;
    }

    public static String Mayusculas(String frase){
        String frase_ok = frase.toUpperCase();
        return frase_ok;
    }

}
