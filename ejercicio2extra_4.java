// Elaborar un algoritmo en el cuál se ingrese un número entre 
// 1 y 10 y se muestre su equivalente en romano.


import java.util.Scanner;
public class ejercicio2extra_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;

        do{        System.out.println("Ingrese un numero del 1 al 10. (0 para salir)");
        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("El numero 1 en numeros romanos es: I" );
                break;
            case 2:
            System.out.println("El numero 2 en numeros romanos es: II" );
                break;
            case 3:
            System.out.println("El numero 3 en numeros romanos es: III" );
                break;
            case 4:
            System.out.println("El numero 4 en numeros romanos es: IV" );
                break;
            case 5:
            System.out.println("El numero 5 en numeros romanos es: V" );
                break;
            case 6:
            System.out.println("El numero 6 en numeros romanos es: VI" );
                break;
            case 7:
            System.out.println("El numero 7 en numeros romanos es: VII" );
                break;
            case 8:
            System.out.println("El numero 8 en numeros romanos es: VIII" );
                break;
            case 9:
            System.out.println("El numero 9 en numeros romanos es: IX" );
            break;
            case 10:
            System.out.println("El numero 10 en numeros romanos es: X" );
            break;
            case 0:
            System.out.println("Finalizando...");

            default:
                System.out.println("Respuesta Incorrecta: Solo del 1 al 10");
                break;
        }
            }while(num!=0);

    sc.close();

    }
}
