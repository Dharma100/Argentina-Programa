package ejemplos_moldes;
import java.util.Scanner;
/// leerEntrada();     para leer texto
/// leerNum();         para leer números enteros
/// Escribir("texto");   para Escribir un String

public class ejemplo {
    
public static void main(String[] args) {

    Escribir("Ingrese su nombre ");
    String nombre = leerEntrada();

    Escribir("Ingrese su edad ");
    int edad = leerNum();

    Escribir("Su nombre es " + nombre + " y su edad es " + edad);

    String rta = "NO";
    boolean bandera = false;

    while(!rta.toUpperCase().equals("SI")){
        if (bandera==false) {
            Escribir("¿Le gustan los gatitos? Responda que si");
            rta = leerEntrada();
            bandera=true;
        }else{
            Escribir("Le dije que diga que si...");
            Escribir("¿Le gustan los gatitos?");
            rta = leerEntrada();
        }
    }

    Escribir("Muy bien! asi se habla");

    Escribir("Elija un numero y yo le mostraré una escala");
    int num_eleccion = leerNum();
    String cadena = "*";

    for(int i=0; i<num_eleccion; i++){  /// se ejecuta el numero ingresado por el usuario del 0 --> al num-1
        for(int j=0; j<1; j++){  /// se ejecuta una vez : del 0 --> al 1
        EscribirSinSaltar(cadena);
        cadena += "*";
        } /// cierra bucle J
        Escribir("");
    } /// cierra bucle i
   

    Escribir("Ahora sigamos con algo de Matrices (presiona enter)");
    leerEntrada();

///////////////////////////////////////////////////////////////////////////////

    Escribir("Escriba la cantidad de materias en la escuela");
    int materias = leerNum();

    Escribir("Ahora la cantidad de examenes en el año");
    int examenes = leerNum();

    ///// pedir datos de materias

    int[][] matriz = new int[materias][examenes];
    String[] nombres_materias = new String [materias];

    for (int i=0; i<materias; i++){
        Escribir("Nombre de la " + (i+1) + "° materia: ");
        nombres_materias[i] = leerEntrada();
        for(int j=0; j<examenes; j++){
            Escribir ("Ingrese la nota del " + (j+1) + "° examen de " + nombres_materias[i].toUpperCase());
            matriz[i][j] = leerNum();
        } /// cierra bucle J
    } /// cierra bucle i


 //////////// calcular desaprobados con Vector CONTADOR
    int[] contador = new int [materias];


    for (int i=0; i<materias; i++){
        contador[i] = 0;
        for (int j=0; j<examenes; j++){
            contador[i] += matriz[i][j];
        }
    }
 
/////////// mostrar matriz de notas y materias
    for (int i=0; i<materias; i++){
        Escribir(nombres_materias[i].toUpperCase() + ":");
        for(int j=0; j<examenes; j++){
            EscribirSinSaltar(+ matriz[i][j] + "  -  ");
        } /// cierra bucle J
        if ( (contador[i] / examenes) >=6 ){   //////// SI EL PROMEDIO ES Mayor a 6
            EscribirSinSaltar("APROBADO");
        }else{
            EscribirSinSaltar("DESAPROBADO");
        }
        Escribir("");
    } /// cierra bucle i


 ////////////////////////// //////////////////////////
    Escribir("Busquemos el mayor y el menor entre un grupo de numeros...");
    leerEntrada();

    Escribir ("Ingrese la cantidad de numeros para el arreglo");
    int cant_numeros = leerNum();

    int[] numeros = new int [cant_numeros];

    int maximo = -999999;
    int minimo = 999999;
    int contador_maximo = 0;
    int contador_minimo = 0;

    for (int i = 0; i < numeros.length; i++) {
        while(numeros[i]<1){
            Escribir ("Ingrese el n° " + (i+1));
            numeros[i] = leerNum();
        } ///cierro while
    }///cierro bucle "i"

    //// comparo min. y max.
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] == maximo){
            contador_maximo ++;
        }
        if (numeros[i] == minimo){
            contador_maximo ++;
        }
        if (numeros[i] > maximo) {
            maximo = numeros[i];
        }
        if (numeros[i] < minimo){
            minimo = numeros[i];
        }
   
    }
    
    ///muestro el vector 
    Escribir("Numeros:");

    for(int i=0 ; i<numeros.length ; i++){
        EscribirSinSaltar(numeros[i] + " ");
    }
   


   
    if (contador_maximo == 0){
        Escribir("El número minimo es: " + minimo);
    }else{
        Escribir("El numero máximo es: " + minimo + ". Y se presenta en " + contador_minimo + " ocasiones.");
    }
 

    if (contador_maximo == 0){
        Escribir("El número máximo es: " + maximo);
    }else{
        Escribir("El numero máximo es: " + maximo + ". Y se presenta en " + contador_maximo + " ocasiones.");
    }
 

} 




/////////////////////////////   MÉTODOS  ////////////////////////
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

}
