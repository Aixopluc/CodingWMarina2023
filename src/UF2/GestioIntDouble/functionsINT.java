package UF2.GestioIntDouble;
import java.util.Scanner;
/**
* @author Alex
* */
public class functionsINT {
    /**
     * @param array hola hola hola
     * @return intMax retorn retorn*/
    public int MaximI(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int MinimI(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int MitjanaI(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma/array.length;
    }

    public int[] rellenar10I(int[] array){
        Scanner lector = new Scanner(System.in);
        for (int i = 0;i<array.length;i++){
            System.out.println("Introduce el " + (i+1) + " número");
            array[i]=lector.nextInt();
        }
        return array;
    }

    public void imprimir (int max, int min, int med){
        if (max != -111){
            System.out.println("La máxmima es " + max);
        }
        else if (min != -111) {
            System.out.println("La minima es " + min);
        }
        else if(med != -111){
            System.out.println("La media es " + med);
        }
    }


}
