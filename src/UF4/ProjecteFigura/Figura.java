package UF4.ProjecteFigura;
import java.util.Scanner;

public class Figura {
    //----------------------ATRIBUTOS-------------------------
    private String figura;
    private static int id =0;
    //----------------------GET Y SET-------------------------

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //----------------------CONSTRUCTORAS-------------------------
    public Figura(){
        id = id +1;
    }
    public Figura(String fig){
        id = id +1;

    }

    //----------------------FUNCIONES-------------------------
    public void imprimirDades(){
        System.out.println("La figura con el ID " + getId() + " es un " + getFigura() );
        System.out.println("El area del " + getFigura() + " es " + calcularArea());
    }
    public double calcularArea(){
        double a =0;
        return a;
    }

    public void llegirDades(){
        Scanner lector = new Scanner(System.in);
        System.out.println("No se que figura quieres");
    }
    public static String elegirOpcion(){
        Scanner lector = new Scanner(System.in);
        String opcion = lector.nextLine();
        return opcion;

    }
    public static void mostrarMenu(){
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




}
