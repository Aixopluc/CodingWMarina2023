package UF4.ProjecteFigura;

public class MainFiguraa {
    public static void main(String[] args) {
        boolean fin = false;
        Figura f  =new Figura();
        f.setId(0);

        while (!fin) {
            Figura.mostrarMenu();
            String opcion = Figura.elegirOpcion();
            if(opcion.equalsIgnoreCase("TI")){
               Triangle t1 = new Triangle();
               t1.llegirDades();
               t1.imprimirDades();

            }

            else if(opcion.equalsIgnoreCase("CU")){
                Quadrat q1 = new Quadrat();
            q1.llegirDades();
            q1.imprimirDades();
            }

            else if(opcion.equalsIgnoreCase("RE")){
                Rectangle r1 = new Rectangle();
                r1.llegirDades();
                r1.imprimirDades();
            }

            else if(opcion.equalsIgnoreCase("TR")){
                Triangle tr1 = new Triangle();
                tr1.llegirDades();
                tr1.imprimirDades();
            }

            else if (opcion.equalsIgnoreCase("RO")){
                Rombe ro1 = new Rombe();
                ro1.llegirDades();
                ro1.imprimirDades();
            }

            else if(opcion.equalsIgnoreCase("PA")){
                Parallelogram p1 = new Parallelogram();
                p1.llegirDades();
                p1.imprimirDades();

            }

            else if(opcion.equalsIgnoreCase("CI")){
                Cercle c1 = new Cercle();
                c1.llegirDades();
                c1.imprimirDades();
            }

            else if (opcion.equalsIgnoreCase("FIN")) {
                fin = true;
            }
            else{
                System.out.println("Eso no es ninguna figura");

            }

        }
    }

}



