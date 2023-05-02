package UF2.GestioIntDouble;
import java.util.Scanner;
public class gintdouble {
    public static void main(String[]args){
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];
        Scanner lector = new Scanner(System.in);
        System.out.println("Que vas a introducir? INT[I] o DOUBLE[D]");
        char opcion = lector.next().charAt(0);


        if(opcion == 'i' || opcion == 'I'){
            int maxint=-111,minint=-111,mediaint=-111;
            functionsINT fint = new functionsINT();
            intArray=fint.rellenar10I(intArray);
            System.out.println("Que quieres calcular?\nMaximo[MAX]\nMinimo[MIN]\nMedia[MED]");
            lector.nextLine();
            String opcionmmm = lector.nextLine();
            if (opcionmmm.equalsIgnoreCase("max")){
                 maxint=fint.MaximI(intArray);
            }
            else if (opcionmmm.equalsIgnoreCase("min")) {
                minint =fint.MinimI(intArray);
            }
            else if (opcionmmm.equalsIgnoreCase("med")) {
                 mediaint = fint.MitjanaI(intArray);
            }
            fint.imprimir(maxint,minint,mediaint);

        }
        else if (opcion == 'd' || opcion=='D') {
            double maxd=-111,mind=-111,mediad=-111;
            functionsDOUBLE fdouble = new functionsDOUBLE();
            doubleArray = fdouble.rellenar10D(doubleArray);
            System.out.println("Que quieres calcular?\nMaximo[MAX]\nMinimo[MIN]\nMedia[MED]");
            lector.nextLine();
            String opcionmmm1 = lector.nextLine();
            System.out.println(opcionmmm1 + " " + opcionmmm1.equalsIgnoreCase("max") );
            if (opcionmmm1.equalsIgnoreCase("max")){
                maxd=fdouble.MaximD(doubleArray);
            }
            else if (opcionmmm1.equalsIgnoreCase("min")) {
                mind =fdouble.MinimD(doubleArray);
            }
            else if (opcionmmm1.equalsIgnoreCase("med")) {
                mediad= fdouble.MitjanaD(doubleArray);
            }
            fdouble.imprimir(maxd,mind,mediad);
        }


    }
}
