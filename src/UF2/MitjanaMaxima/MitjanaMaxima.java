package UF2.MitjanaMaxima;
public class MitjanaMaxima {
    public static void main(String[] args) {
        MitjanaMaxima programa = new MitjanaMaxima();
        programa.inici();
    }

    public void inici() {
        CalculsArrayReals calculador = new CalculsArrayReals();
        double[] arrayA = new double[10];
        double[] arrayB = new double[10];
        //Per cridar els m todes cal inicialitzar la classe que els cont 
        calculador.rellenar(arrayA);
        calculador.rellenar(arrayB);
        //Un cop fet, cal cridar−los usant com a prefix l’identificador
        double mitjanaA = calculador.calcularMitjana(arrayA);
        double mitjanaB = calculador.calcularMitjana(arrayB);
        if (mitjanaA > mitjanaB) {
            System.out.println("arrayA té una mitjana més alta.");
        }
        else if (mitjanaA < mitjanaB) {
            System.out.println("arrayB té una mitjana més alta.");
        }
        else {
            System.out.println("Les dues mitjanes són iguals!");
        }
    }
}

