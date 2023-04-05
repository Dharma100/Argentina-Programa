import java.util.Scanner;

public class ejercicio4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Vector = new int[110];

        RellenarVector(Vector);

        sc.close();
        
    } // cierra el Main


    public static void RellenarVector(int[] vector){


        for (int i = 0; i <= 99; i++) {
            vector[i] = i+1;
        }

        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }


    }

} // cierra clase principal
