package web;
// Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química, Historia 
// y Lengua) en una lista, pregunte al usuario la nota que ha sacado en cada asignatura, 
// y después las muestre por pantalla con el mensaje En <asignatura> has sacado <nota> 
// donde <asignatura> es cada una des las asignaturas de la lista 
// y <nota> cada una de las correspondientes notas introducidas por el usuario.

// Yo Agrego: Que al final , muestre una lista de las materias que debe repetir (nota menor a 6)

import java.util.Scanner;

/// leerEntrada();   para leer texto
/// leerNum();       para leer números enteros

public class ejercicio_web9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de materias: ");
        int cantidad = sc.nextInt();

        String[] materias = new String[cantidad];
        int[] notas = new int[cantidad];
        int rta = 10;
        boolean lleno = false;

        while (rta != 3){
            System.out.println("MENÚ PRINCIPAL >>");
            System.out.println("1- Ingresar Materias y Notas");
            System.out.println("2- Mostrar los Datos Completados");
            System.out.println("3- SALIR");
            rta = leerNum();
             /// para descartar problema de linea en blanco


            if (rta==1){ //////////// opcion 1 : llenar los datos
                for (int i=0; i < cantidad; i++){
                    System.out.println("Ingrese el nombre de la " + (i+1) + "° materia");
                    materias[i] = leerEntrada().toUpperCase();
                    System.out.println("Ingrese la Nota de " + materias[i]);
                    notas[i] = leerNum();
                }
                lleno=true;
            }


            if (rta==2){ ///////////// opcion 2  :  mostrar los datos
                if (lleno==false){
                    System.out.println("Aún no ha ingresado los datos...");
                }else{
                    for (int i=0; i < cantidad; i++){
                        System.out.println(materias[i] + ": " + notas[i]);
                        System.out.println("");
                    }
                }
                
            }

        } /// cierra el while del menú

    
        sc.close();

    }

    public static String leerEntrada() {
        Scanner sca = new Scanner(System.in);
        return sca.nextLine();
    }
    
    public static int leerNum() {
        Scanner sca = new Scanner(System.in);
        return sca.nextInt();
    }
        
    
}
