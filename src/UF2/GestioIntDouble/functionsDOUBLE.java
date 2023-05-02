package UF2.GestioIntDouble;

import java.util.Scanner;

public class functionsDOUBLE {
    public double MaximD(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public double MinimD(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public double MitjanaD(double[] array) {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma/array.length;
    }

    public double[] rellenar10D(double[] array){
        Scanner lector = new Scanner(System.in);
        for (int i = 0;i<array.length;i++){
            System.out.println("Introduce el " + (i+1) + " número");
            array[i]=lector.nextDouble();
        }
        return array;
    }

    public void imprimir (double max, double min, double med){
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
