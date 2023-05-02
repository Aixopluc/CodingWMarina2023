package UF2.MitjanaMaxima;

import java.util.Scanner;

public class CalculsArrayReals {

    public double calcularMitjana(double[] array){
        double suma = 0;
        for (int i = 0;i<array.length;i++){
            suma = suma + array[i];
        }
        return suma/array.length;
    }
    public double[] rellenar(double[] array){
        Scanner lector = new Scanner(System.in);
        for (int i = 0;i<array.length;i++){
            System.out.println("Introduce el " + (i+1) + " número");
            array[i]=lector.nextDouble();
        }
        return array;

    }
}
