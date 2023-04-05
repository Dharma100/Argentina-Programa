import java.util.Scanner;
import java.util.Random;


public class ejercicio4_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[][] matriz = new int[4][4];
        int[][] trans = new int[4][4];


        System.out.println("===================");
        System.out.println("Mostrando Matriz");


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(9)+1; /// le asigna un numero aleatorio del 1-9
                System.out.print(matriz[i][j] + " ");  /// Muestra el valor
            }
            System.out.println("");
        }

        System.out.println("===================");
        System.out.println("");
        System.out.println("===================");
        System.out.println("Mostrando Matriz Transpuesta");

        //////rellenar transpuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                trans[j][i] = matriz[i][j];   /// asigna valor a la transpuesta, invertiendo de la matriz original
            }
        }
        ///// imprimir transpuesta
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(trans[j][i] + " "); 
            }
            System.out.println("");
        }

        System.out.println("===================");


        
        sc.close();


    } // cierra el Main


} // cierra clase principal
