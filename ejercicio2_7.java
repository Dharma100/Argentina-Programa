import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ejercicio2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("Bienvenido al Sistema RS-232");
        System.out.println("(el codigo debe comenzar con X , terminar con O , y tener 5 caracteres)");
        System.out.println(">>> Escriba '&&&&&' para terminar");

        String rta = " ";
        int correctos = 0;
        int incorrectos = 0;

        do{
            System.out.println("Ingrese un texto que cumpla las reglas:");
     
            rta = sc.nextLine();

            if (rta.length() == 5 && rta.substring(0,1).toLowerCase().equals("x") && rta.substring(4,5).toLowerCase().equals("o")){
                System.out.println("¡CORRECTO! código ingresado");
                correctos ++;

            }else if(rta.equals("&&&&&")) {
            System.out.println("");

            }else{
                System.out.println("RESPUESTA INCORRECTA. vuelva a intentarlo");
                incorrectos ++;
            }

        }while(!rta.equals("&&&&&"));
    
        System.out.println("=======================");
        System.out.println("Datos cargados correctamente...");
        System.out.println("Se han cargado " + correctos + " códigos válidos");
        System.out.println("Se han hecho " + incorrectos + " intentos NO validos");
        System.out.println("=======================");
    
    
    }




}
