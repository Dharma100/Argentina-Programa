// Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
// diferente a cada una. A continuación, realizar las instrucciones necesarias 
// para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D
//  tome el valor de B. Mostrar los valores iniciales y los valores finales de cada
//   variable. Utilizar sólo una variable auxiliar.


import java.util.Scanner;

public class ejercicio2extra_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = 1;
        int B = 10;
        int C = 100;
        int D = 1000;

        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
        System.out.println("Valor de C: " + C);
        System.out.println("Valor de D: " + D);

        System.out.println("================");

        B = C;
        C = A;
        A = D;
        D = B;

        System.out.println("Nuevo Valor de A: " + A);
        System.out.println("Nuevo Valor de B: " + B);
        System.out.println("Nuevo Valor de C: " + C);
        System.out.println("Nuevo Valor de D: " + D);


        System.out.println("================");

        sc.close();
    }
}
