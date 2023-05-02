package UF2.mmm;

import java.util.Scanner;

public class mmm {
    private double[] arrayy = new double[5];
    private double max = 0;
    private double min = 0;
    private double media = 0;
    public static void main(String[] args) {
        mmm programa = new mmm();
        programa.inici();

    }

    public void inici() {
        mostrarmenu();
        llegirdades();
        max = max();
        min = min();
        media = media();
        imprimir();
    }

    public void mostrarmenu() {
        System.out.println("Introduce ls 5 notas:");
    }

    public void llegirdades() {
        int cont = 1;
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < arrayy.length; i++) {
            System.out.print("Introduce la " + cont + " nota: ");
            arrayy[i] = lector.nextDouble();
            cont++;
        }
    }

    public double max() {
        for (int i = 0; i < arrayy.length - 1; i++) {

            for (int j = i + 1; j < arrayy.length; j++) {

                if (arrayy[i] > arrayy[j]) {


                    double aux = arrayy[i];
                    arrayy[i] = arrayy[j];
                    arrayy[j] = aux;
                }
            }
        }
        return arrayy[arrayy.length-1];
    }

    public double min(){
        for (int i = 0; i < arrayy.length - 1; i++) {

            for (int j = i + 1; j < arrayy.length; j++) {

                if (arrayy[i] > arrayy[j]) {


                    double aux = arrayy[i];
                    arrayy[i] = arrayy[j];
                    arrayy[j] = aux;
                }
            }
        }
        return arrayy[0];
    }

    public double media(){
        double suma = 0;
        for (int i = 0; i<arrayy.length;i++){
            suma = suma + arrayy[i];
        }
        return suma/arrayy.length;
    }

    public void imprimir(){
        System.out.println("La nota maxima es " + max+".");
        System.out.println("La nota minima es " + min+".");
        System.out.println("La nota media es " + media+".");
    }
}

