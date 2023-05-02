package UF2.eliminararray;
import java.util.Scanner;
public class eliminararray {

    private int[] arrayy = new int[5];
    private int [] array2 = new int[4];
    private int delete = 0;

    public static void main (String[]args){
        eliminararray programa = new eliminararray();
        programa.inici();
    }

    public void inici(){
        texto();
        llenar();
        delete = elemento();
        eliminar(delete);
        imprimir();
    }



    public void texto(){
        System.out.println("Introduce 5 números: ");
    }
    public void llenar(){
        Scanner lector = new Scanner(System.in);
       for (int i = 0;i<arrayy.length;i++){
           System.out.print("Introduce el " + (i+1) + " numero: " );
           arrayy[i] = lector.nextInt();
       }

    }

    public int elemento(){
        Scanner lector = new Scanner(System.in);
        int d = 0;
        System.out.println("De los siguientes valores, cual quieres eliminar?");
        for (int i = 0;i<arrayy.length;i++){
            System.out.print(arrayy[i] + ", ");
        }
        System.out.println(" ");
        d = lector.nextInt();

        return d;
    }

    public void eliminar(int del){
        int cont = 0;
        for (int i = 0;i<arrayy.length;i++){
            if (arrayy[i] != del){
                array2[i-cont] = arrayy[i];

            }
            else {
                cont=1;
            }
        }
    }

    public void imprimir(){
        System.out.print("El array quediaría: ");
        for (int i = 0;i<array2.length;i++){

            System.out.print(array2[i] + ", ");
        }
    }




}
