package UF4.ProjecteFigura;

import java.util.Scanner;

public class Parallelogram extends Figura{
    //----------------------ATRIBUTOS-------------------------
    private int base;
    private int altura;

    //----------------------GET Y SET-------------------------
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    //----------------------CONSTRUCTORAS-------------------------
    public Parallelogram(){
        setFigura("Parellllelogram");
    }
    public Parallelogram(int b,int h){
        b = base;
        h=altura;
        setFigura("Parellllelogram");
    }

    //----------------------FUNCIONES-------------------------
    public void llegirDades(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la base:");
        setBase(lector.nextInt());
        System.out.println("Introduce la altura");
        setAltura(lector.nextInt());
    }
    public double calcularArea(){
        double area = getAltura()*getBase();
        return area;
    }
}
