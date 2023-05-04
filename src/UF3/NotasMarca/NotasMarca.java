package UF3.NotasMarca;
import java.io.File;
import java.util.Scanner;

public class NotasMarca {
    //la paraula fi serveix com a marca de final de fitxer
    public static final String MARCA_FI = "fi";
    public static void main (String[] args) {
        NotasMarca programa = new NotasMarca();
        programa.inici();
    }
    public void inici() {
        try {
            File f = new File("C:\\Users\\alexr\\Desktop\\DAM\\Programacio\\CodingWMarina2023\\src\\UF3\\NotasMarca\\Notes.txt");
            Scanner lector = new Scanner(f);
            boolean llegir = true;
            while (llegir) {
                String nom = lector.next();
                if (MARCA_FI.equals(nom)) {
                    llegir = false;
                }
                else {
                    String cognom = lector.next();
                    System.out.print("Estudiant: " + nom + " " + cognom);
                    //Noteu com un scanner es pot passar com paràmetre
                    double mitjana = llegirNotes(lector);
                    System.out.println("− Mitjana: " + mitjana);
                }
            }
            //Cal tancar el fitxer
            lector.close();
        }
        catch(Exception e) {
            //Excepció!
            System.out.println("Error llegint estudiants: " + e);
        }
    }

    /** Donat un Scanner en un fitxer quan l’apuntador es troba sobre l’inici
     * de les notes, s’extreuen i es calcula la mitjana.
     *
     * @param lector Scanner a processar
     * @return Mitjana de notes
     */
    public double llegirNotes(Scanner lector) {
        double res = 0;
        try {
            //Es fan lectures. Cal controlar excepcions també!
            int numNotes = 0;
            double num = lector.nextDouble();
            while ( num != -1){
                //System.out.println(lector.nextDouble());
                res = res + num;
                numNotes++;
                num = lector.nextDouble();
            }
            //Es calcula nota mitjana
            res = res/numNotes;
        }
        catch (Exception e) {
            //Excepció!
            System.out.println("Error llegint notes: " + e);
        }
        return res;
    }
}