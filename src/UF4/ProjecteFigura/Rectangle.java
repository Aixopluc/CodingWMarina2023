package UF4.ProjecteFigura;

import java.util.Scanner;

public class Rectangle extends Figura{

    //----------------------ATRIBUTOS-------------------------
    private int costat1;
    private int costat2;
    //----------------------GET Y SET-------------------------
    public int getCostat1() {
        return costat1;
    }

    public void setCostat1(int costat1) {
        this.costat1 = costat1;
    }

    public int getCostat2() {
        return costat2;
    }

    public void setCostat2(int costat2) {
        this.costat2 = costat2;
    }
    //----------------------CONSTRUCTORAS-------------------------
    public Rectangle(){
        setFigura("Rectangle");
    }
    public Rectangle(int c1,int c2){
        costat1 = c1;
        costat2 = c2;
        setFigura("Rectangle");
    }

    //----------------------FUNCIONES-------------------------
    public double calcularArea(){
        double area = getCostat1()*getCostat2();
        return area;
    }
    public void llegirDades(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer lado:");
        setCostat1(lector.nextInt());
        System.out.println("Introduce el segundo lado:");
        setCostat2(lector.nextInt());
    }

}
