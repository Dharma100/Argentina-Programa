package ejemplos_moldes;
import java.util.Scanner;

public class ejemplo_molde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);











        sc.close();

    } /// cierre del MAIN






    public static String leerEntrada() {
        Scanner sca = new Scanner(System.in);
        sca.close();
        return sca.nextLine();
    }
    
    public static int leerNum() {
        Scanner sca = new Scanner(System.in);
        sca.close();
        return sca.nextInt();
    }

    public static void Escribir(String x) {
        System.out.println(x);
    }  

    public static void EscribirSinSaltar(String x) {
        System.out.print(x);
    }  
    
}/// cierre de la Clase
