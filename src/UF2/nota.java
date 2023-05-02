package UF2;

import java.util.Scanner;


public class nota {
    private double nota = 0;
    public static void main(String[] args) {
        nota programa = new nota();
        programa.inici();

    }

    public void inici(){
        menu();
        nota = opcion();
        resultado(nota);
    }

    private void menu() {
        System.out.println("Introduce tu nota (0-10): ");
    }

    public double opcion(){
        Scanner lector = new Scanner(System.in);
        boolean leido = false;
        double n = 0;
        while (!leido){
            leido = lector.hasNextDouble();
            if (leido){
                n = lector.nextDouble();


            }
            else {
                System.out.println("Introduce numeros!");
                lector.next();
            }
        }
        return n;
    }

    public void resultado(double nota){
        if(nota>= 0 && nota <= 4.9){
            System.out.println("Supenso");
        }
        else if (nota >= 5 && nota <= 6.49){
            System.out.println("Aprobado");
        }
        else if (nota >= 6.5 && nota <= 8.9){
            System.out.println("Notable");
        }
        else if (nota >= 9 && nota <= 10) {
            System.out.println("Excelente");
        }
        else {
            inici();
        }
    }
}
