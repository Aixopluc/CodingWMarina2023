package UF2.cercavalors;

import java.util.Random;
import java.util.Arrays;
public class CercaValors {
    private int[] array = new int[10];
    private int [] copia1 = new int[5];
    private int[] copia2 = new int[5];
    public static void main(String[] args) {

        CercaValors programa = new CercaValors();
        programa.inici();
    }

    public void inici() {
        valores();
        imprimir();
        imprimirvalores();
    }

    public void valores(){
        for (int i = 0; i < array.length; i++) {
            Random rd = new Random();
            array[i] = rd.nextInt(11);
            copia1 = Arrays.copyOfRange(array, 0, 5);
             copia2 = Arrays.copyOfRange(array, 5, array.length);
        }
    }
    public void imprimir(){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        System.out.print("Valors a cercar: [ ");
        for (int i = 0; i < copia1.length; i++) {
            System.out.print(copia1[i] + " ");
        }
        System.out.println("]");

        Arrays.sort(copia2);
        System.out.print("Array on es cerca: [ ");
        for (int i = 0; i < copia2.length; i++) {
            System.out.print(copia2[i] + " ");
        }
        System.out.println("]");
    }
    public void imprimirvalores(){
        for (int i = 0; i < copia1.length; i++) {
            boolean trobat = false;
            for (int j = 0; j < copia2.length; j++) {
                if (copia1[i] == copia2[j] && trobat == false) {
                    System.out.println("A la posicio " + Arrays.binarySearch(copia2, copia1[i]) + " hi ha el valor " + copia1[i]);
                    trobat = true;
                }

            }
        }

    }
}
