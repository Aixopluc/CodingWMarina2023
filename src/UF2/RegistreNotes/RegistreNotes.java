package UF2.RegistreNotes;

public class RegistreNotes {
    public static void main(String[] args) {
        //Functions func = new Functions();
        mitjana mitt = new mitjana();
        maxim maxx = new maxim();
        minim minn = new minim();
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        double max = maxx.calcularMaxim(notes);
        double min = minn.calcularMinim(notes);
        double mitjana = mitt.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }
}