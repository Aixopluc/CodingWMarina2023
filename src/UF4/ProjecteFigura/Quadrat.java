package UF4.ProjecteFigura;

import java.util.Scanner;

public class Quadrat extends Figura{
    //----------------------ATRIBUTOS-------------------------
    private int costat;

    //----------------------GET Y SET-------------------------
    public int getCostat() {
        return costat;
    }

    public void setCostat(int costat) {
        this.costat = costat;
    }

    //----------------------CONSTRUCTORAS-------------------------
    public Quadrat(){
        setFigura("Quadrat");
    }
    public Quadrat(int c){
        setFigura("Quadrat");
        costat = c;
    }

    //----------------------FUNCIONES-------------------------

    public double calcularArea(){
        double area = Math.pow(getCostat(), 2);
        return area;
    }
    public void llegirDades(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el lado:");
        setCostat(lector.nextInt());
    }
}
