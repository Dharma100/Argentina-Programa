// Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
// *  *  *  *
// *        *
// *        *
// *  *  *  *




import java.util.Scanner;

public class ejercicio2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rta = 0;

        do{
            System.out.println("Ingrese un numero a partir de 4");
            rta = sc.nextInt();
        }while(rta<4);

        for (int i=0; i<rta; i++){
            System.out.print("*");
            for (int j=0; j<rta; j++){
                if (i==0 || i==rta-1){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" *");
            System.out.println("");
            
        }
        sc.close();
    }
}
