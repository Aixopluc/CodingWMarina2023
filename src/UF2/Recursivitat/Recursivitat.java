package UF2.Recursivitat;
import java.util.Scanner;
public class Recursivitat {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = lector.nextInt();
        parimpar(num);
    }

    private static void parimpar(int num) {
        if (num % 2 == 0&&num>=0){
            System.out.println("El nombre " + num + " és parell");
            parimpar(num-1);
        }
        else if(num % 2 != 0&&num>=0){
            System.out.println("El nombre " + num + " és senar");
            parimpar(num-1);
        }

    }

}
