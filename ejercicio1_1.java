import java.util.Scanner;

public class ejercicio1_1{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1, num2, num3;

    System.out.println("Ingrese el primer numero");
    num1 = sc.nextInt();
    System.out.println("Ingrese el segundo numero");
    num2 = sc.nextInt();


    num3 = Sumar(num1,num2);
    System.out.println("El resultado es: " + num3);

    sc.close();
    
}

public static int Sumar(int a,int b){
    int resultado = a+b;
    return resultado;
}


}