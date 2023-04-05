import java.util.Scanner;
import java.util.Random;

public class ejercicio4_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño=leer.nextInt();
        int[] vector=new int[tamaño];
       
      RellenarVector(vector,tamaño);
      RevisarVector(vector,tamaño);

      leer.close();
    }
        
     public static void RellenarVector(int[] vector,int tamaño){
        Random ram= new Random();

        int i;
          for (i=0; i<tamaño; i++){
            vector[i]=ram.nextInt(99999)+1;
              System.out.println(vector[i]);
        }

    
           
    }
      public static void RevisarVector(int[] vector,int tamaño){
                int j,cont=1,cinco=0,cuatro=0,tres=0,dos=0,uno=0;    
       
        for (int i=0; i<tamaño; i++){
               j=vector[i];
               cont=1;
                while (j>=10){
                j=j/10;
                cont++;
                }
             switch(cont) {
               case 1:
                    uno++;
                    break;
               case 2:
                    dos++;
                    break;
               case 3:
                    tres++;
                    break;
               case 4:
                    cuatro++;
                    break;    
               case 5:
                    cinco++;
                    break;
               
           }
           }
           System.out.println("Hay "+ uno +" numero(s) de 1 digito");
           System.out.println("Hay "+ dos +" numero(s) de 2 digitos");
           System.out.println("Hay "+ tres +" numero(s) de 3 digitos");
           System.out.println("Hay "+ cuatro +" numero(s) de 4 digitos");
           System.out.println("Hay "+ cinco +" numero(s) de 5 digitos");
               

           
           }// cierra el Main


    }  // cierra clase principal



