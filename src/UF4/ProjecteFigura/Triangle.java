package UF4.ProjecteFigura;

import java.util.Scanner;

public class Triangle extends Figura{
    //----------------------ATRIBUTOS-------------------------
    private int base;
    private int h;

    //----------------------GET Y SET-------------------------

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    //----------------------CONSTRUCTORAS-------------------------
    public Triangle(){
        setFigura("Triangle");
    }
    public Triangle(int base,int altura){
        setFigura("Triangle");
        this.base = base;
        h=altura;
    }

    //----------------------FUNCIONES-------------------------
    public double calcularArea(){
        double area = (getBase()*getH())/2;
        return area;
    }

    public void llegirDades(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la base:");
        setBase(lector.nextInt());
        System.out.println("Introduce la altura:");
        setH(lector.nextInt());

    }
}
