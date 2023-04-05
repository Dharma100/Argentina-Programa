
import java.util.Scanner;

public class ejercicio3_12b {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero 1");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el numero 2");
        int num2 = sc.nextInt();

        EsMultiplo(num1,num2);

        sc.close();



    } //// termina la clase main


    public static void EsMultiplo(int num1, int num2){

        if (num1%num2 == 0){
            System.out.println("SON MULTIPLOS");
        }else{
            System.out.println("NO SON MULTIPLOS");
        }

    }


} /// termina la clase principal
