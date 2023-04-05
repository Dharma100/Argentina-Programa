import java.util.Scanner;


public class ejercicio3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int cant_personas = 0;

        String[] nombres = new String[cant_personas];
        int[] edades = new int[cant_personas];
        
      
        int i = 1;
        nombres[0] = "";
        edades[0] = 0;
        String respuesta = "";



        
        do{

          System.out.println("Ingrese nombre");
            nombres[i] = sc.nextLine();
          System.out.println("Ingrese edad");
            edades[i] = sc.nextInt();

            i += 1;
          cant_personas += 1;

          System.out.println("¿Quiere Seguir Introduciendo Datos?");
          respuesta = sc.nextLine(); 


        }while(respuesta.toLowerCase().equals("no"));





        for (i=0; i<cant_personas; i++){
            System.out.println("NOMBRE: " + nombres[i+1] + " / EDAD: " + edades[i+1]);

            if(edades[i+1] >= 18){
                System.out.println("Es Mayor de Edad.");

            }else{
                System.out.println("No es Mayor de Edad.");
            }


            sc.close();
        }
    
    }

}
