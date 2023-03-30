import java.util.Scanner;

public class ejercicio3_11{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
      
        Transformar(frase);
        sc.close();
    }



public static void Transformar(String frase){

    String frase_transformada = "";
       
    for (int i = 0; i < frase.length(); i++) {
       
        switch(frase.substring(i,i+1)){
            case "a":
            frase_transformada += "@";
            break;

            case "e":
            frase_transformada += "#";
            break;

            case "i":
            frase_transformada += "$";
            break;

            case "o":
            frase_transformada += "%";
            break;

            case "u":
            frase_transformada += "*";
            break;
            
            default:
            frase_transformada += frase.substring(i,i+1);

        }

    }
    
    System.out.println("FRASE TRANSFORMADA: " + frase_transformada);

}
}