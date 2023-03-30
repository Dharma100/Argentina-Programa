import java.util.Scanner;

public class ejercicio2_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        int rta = 0;


        do{
            System.out.println("=======================");
            System.out.println(">>> MENÚ PRINCIPAL");
            System.out.println("1- SUMAR");
            System.out.println("2- RESTAR");
            System.out.println("3- MULTIPLICAR");
            System.out.println("4- DIVIDIR");
            System.out.println("5- SALIR");
            rta = sc.nextInt();


            switch(rta){
                case 1:
                System.out.println("El resultado es: " + Sumar(num1,num2));
                break;

                case 2:
                System.out.println("El resultado es: " + Restar(num1,num2));
                break;

                case 3:
                System.out.println("El resultado es: " + Multiplicar(num1,num2));
                break;

                case 4:
                System.out.println("El resultado es: " + Dividir(num1,num2));
                break;

                case 5:
                System.out.println("Saliendo del sistema...");
                break;
            }

        }while(rta != 5);
        sc.close();
    }

///////////////////////////// métodos ///////////////////////////////////////


public static int Sumar(int a, int b) {
    int suma = a+b;
    return suma;
}  

public static int Restar(int a, int b) {
    int resta = a-b;
    return resta;
}  

public static int Multiplicar(int a, int b) {
    int multi = (a*b);
    return multi;
}  

public static int Dividir(int a, int b) {
    int divi = (a/b);
    return divi;
}  

}






