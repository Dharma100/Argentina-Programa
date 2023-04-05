import java.util.Scanner;

public class ejercicio3_13b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase a convertir: ");
        String frase = sc.nextLine();

        System.out.println(Conversor(frase));  /// funcion (tiene retorno, lo llamo con print)
        Conversor2(frase);  //// sub-programa, sin retorno, lo llamo sin nada mas


        sc.close();
        
    }//// cierra el main


    /////////////////////////////////////////////////////////
    public static String Conversor(String frase){
    
    String auxiliar = "";

    for (int i=0; i<frase.length() ; i++){
        switch(frase.substring(i,i+1).toLowerCase()){
            case "a":
            auxiliar += "@";
            break;

            case "e":
            auxiliar += "#";
            break;

            case "i":
            auxiliar += "$";
            break;

            case "o":
            auxiliar += "%";
            break;

            case "u":
            auxiliar += "*";
            break;

            default:
            auxiliar += frase.substring(i,i+1);

        }

    }/// cierra el For
       
    return auxiliar;
    // System.out.println("FRASE TRANSFORMADA: " + auxiliar);

    } /// cierra el Sub-programa

/////////////////////////////////////////////////////////


public static void Conversor2(String frase){
    
    String auxiliar = "";

    for (int i=0; i<frase.length() ; i++){
        switch(frase.substring(i,i+1).toLowerCase()){
            case "a":
            auxiliar += "@";
            break;

            case "e":
            auxiliar += "#";
            break;

            case "i":
            auxiliar += "$";
            break;

            case "o":
            auxiliar += "%";
            break;

            case "u":
            auxiliar += "*";
            break;

            default:
            auxiliar += frase.substring(i,i+1);

        }

    }/// cierra el For
       
    // return auxiliar;
    System.out.println("FRASE TRANSFORMADA: " + auxiliar);

    } /// cierra el Sub-programa





} /// cierra la clase principal
