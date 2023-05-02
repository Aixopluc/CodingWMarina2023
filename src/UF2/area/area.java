package UF2.area;

import java.util.Scanner;
public class area {
    private boolean fin = false;
    private String figura = " ";
    private double area = 0;
    public static void main(String[] args){
        area programa = new area();
        programa.inici();

    }

    public void inici(){
        while (!fin) {
            mostrarmenu();
            opcion();
            resultadoarea();
        }
    }

    public void mostrarmenu() {
        System.out.println("\nIntroduce la figura de la que quieres calcular el area:");
        System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println("[TI] Triangulo");
        System.out.println("[CU] CUADRADO");
        System.out.println("[RE] RECTANGULO");
        System.out.println("[TR] TRAPECIO");
        System.out.println("[RO] ROMBO");
        System.out.println("[PA] PARALELOGRAMO");
        System.out.println("[CI] CIRCULO");
        System.out.println("[FIN] SALIR");
        System.out.print("Opción: ");
    }

    public void opcion(){
        Scanner lector = new Scanner(System.in);
        String opcion = " ";
        boolean leido = false;
        while (!leido){
            leido = lector.hasNextLine();
            if (leido){
                opcion = lector.nextLine();
                if(opcion.equalsIgnoreCase("TI")){
                    figura = "triangulo";
                    System.out.println("Introduce la base: ");
                    double base = lector.nextDouble();
                    System.out.println("Introduce la altura: ");
                    double altura = lector.nextDouble();
                    area = triangulo(base, altura);

                }

                else if(opcion.equalsIgnoreCase("CU")){
                    figura = "cuadrado";
                    System.out.println("Introduce la longitud del lado: ");
                    double lado = lector.nextDouble();
                    area = cuadrado(lado);


                }

                else if(opcion.equalsIgnoreCase("RE")){
                    figura = "rectangulo";
                    System.out.println("Introduce la base: ");
                    double base = lector.nextDouble();
                    System.out.println("Introduce la altura: ");
                    double altura = lector.nextDouble();
                    area = rectangulo_paralelo(base, altura);


                }

                else if(opcion.equalsIgnoreCase("TR")){
                    figura = "trapecio";
                    System.out.println("Introduce la altura:");
                    double altura = lector.nextDouble();
                    System.out.println("Introduce la base larga:");
                    double basel = lector.nextDouble();
                    System.out.println("Introduce la base corta");
                    double basec = lector.nextDouble();
                    area = trapecio(altura,basel,basec);

                }

                else if (opcion.equalsIgnoreCase("RO")){
                    figura = "rombo";
                    System.out.println("Introduce la diagonal larga");
                    double diagonal = lector.nextDouble();
                    System.out.println("Introduce la diagonal corta");
                    double diagonalc = lector.nextDouble();
                    area = rombo(diagonal,diagonalc);

                }

                else if(opcion.equalsIgnoreCase("PA")){
                    figura = "paralelogramo";
                    System.out.println("Introduce la base: ");
                    double base = lector.nextDouble();
                    System.out.println("Introduce la altura: ");
                    double altura = lector.nextDouble();
                    area = rectangulo_paralelo(base, altura);

                }

                else if(opcion.equalsIgnoreCase("CI")){
                    figura = "circulo";
                    System.out.println("Introduce el radio");
                    double radio = lector.nextDouble();
                    area = circulo(radio);
                
                }

                else if (opcion.equalsIgnoreCase("FIN")) {
                    fin = true;
                }


            }
            else{
                System.out.println("Eso no es ninguna figura");
            }
        }
    }


    public double triangulo (double b, double a){
        double areatri = (b*a)/2;
        return areatri;
    }

    public double cuadrado(double a){
        double areacu = Math.pow(a, 2);
        return areacu;
    }

    public double rectangulo_paralelo(double a, double b){
        double arearec = a*b;
        return arearec;
    }

    public double trapecio(double h, double a, double b){
        double areatr = ((a*b)*h)/2;
        return areatr;
    }

    public double rombo (double dl, double dc){
            double arear= (dl+dc)/2;
            return arear;
    }

    public  double circulo (double r){
        double areac = Math.pow(r, 2)*Math.PI;
        return areac;
    }

    public void resultadoarea(){
        System.out.println("El area del " + figura + " es: " + area + ".");
    }
}




