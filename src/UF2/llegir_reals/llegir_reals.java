package UF2.llegir_reals;
import java.util.Scanner;

public class llegir_reals {
    public static void main(String[] args){
        llegir_reals programa = new llegir_reals();
        programa.inici();

    }

    public void inici(){
        System.out.println("Introduce un real");
        double a = llegirteclat();
        System.out.println("El real es" + a);
        System.out.println("Introduce un real");
        double b = llegirteclat();
        System.out.println("El real es" + b);
    }

    public double llegirteclat(){
        Scanner lector = new Scanner(System.in);
        double numero = 0;
        boolean leido = false;
        while (!leido){
            leido = lector.hasNextDouble();
            if(leido){
                numero = lector.nextDouble();
            }

            else {
                System.out.println("Esto no es un real");
                lector.next();            }
        }
        return numero;
    }

}
