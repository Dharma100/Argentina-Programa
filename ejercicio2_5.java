// Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
// números al usuario hasta que la suma de los números introducidos supere el límite inicial.


import java.util.Scanner;

public class ejercicio2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un limite: ");

        int limite = sc.nextInt();
        int suma = 0;

       do{
        System.out.println("");
        System.out.println("Ingrese un numero para sumar");
        int num = sc.nextInt();
        suma += num;

        System.out.print("La suma hasta el momento es: " + suma);

        if(suma>limite){
            System.out.println("");
            System.out.println("¡Has superado el limite! (" + limite + ")");
            break;
        }else{
            System.out.print(", aún no ha superado el limite ");
        }
       }while(suma<=limite);

       System.out.println("...Finalizando....");

       sc.close();
    }
}
