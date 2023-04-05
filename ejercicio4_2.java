import java.util.Scanner;
import java.util.Random;

public class ejercicio4_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int tamano_vector = sc.nextInt();

        int[] Vector = new int[tamano_vector];
    



        SubPrograma(Vector, tamano_vector);

        System.out.println("Cerrando Programa Principal");
        
        sc.close();

    } // cierra el Main


    public static void SubPrograma(int[] vector, int tamano){

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[] posicion = new int[tamano];

    
        for (int i = 0; i < tamano; i++) {
            vector[i] = rand.nextInt(100) + 1;
        }

        int rta = 0;
        int c = 0;

        System.out.println("=================================");

        System.out.println("MOSTRANDO VECTOR");
        System.out.println("");

        for (int i = 0; i < tamano; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        System.out.println("=================================");


        do{
            System.out.println("¿Que numero desea buscar? [0 para salir]");
            rta = sc.nextInt();


            if(rta!=0){
                for (int i = 0; i < tamano; i++) {
                    if (vector[i]==rta) {
                        posicion[c] = i;
                        c += 1;
                    }//cierra if
                }//cierra for
    
    
                switch(c){
                    case 1:
                    System.out.println("El numero ingresado se ha encontrado " + c + " vez");
                    break;
                    
                    case 0:
                    System.out.println("El numero no se ha encontrado");
                    break;

                    default:
                    System.out.println("El numero ingresado se ha encontrado " + c + " veces");
                    break;
                }
    
                // System.out.println("El numero ingresado se ha encontrado: " + c + " veces");
    
                

              if(c==1){
                System.out.print("Posicion donde fue encontrado: ");
    
                System.out.print("(" + posicion[0] + ")");
                c = 0;  // redefino el contador en 0 nuevamente

              }else if(c>1){
                System.out.print("Posiciones donde fue encontrado: ");
                
                for (int i = 0; i < c-1; i++) {
                    System.out.print(posicion[i] + "  -  ");
                }
                System.out.print(posicion[c-1]);
                c = 0;  // redefino el contador en 0 nuevamente
              }
                
                
            }
           

            System.out.println("");

        }while (rta != 0);
        
        System.out.println("Cerrando Sub-Programa");

        sc.close();

    }/// cierra sub programa

} // cierra clase principal
