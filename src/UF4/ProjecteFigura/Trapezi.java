package UF4.ProjecteFigura;

import java.util.Scanner;

public class Trapezi extends Figura{

    //----------------------ATRIBUTOS-------------------------
    private int base1;
    private int base2;
    private int altura;

    //----------------------GET Y SET-------------------------

    public int getBase1() {
        return base1;
    }

    public void setBase1(int base1) {
        this.base1 = base1;
    }

    public int getBase2() {
        return base2;
    }

    public void setBase2(int base2) {
        this.base2 = base2;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    //----------------------CONSTRUCTORAS-------------------------
    public Trapezi(){
        setFigura("Trapezi");
    }
    public Trapezi(int b1,int b2,int altura){
        setFigura("Trapezi");
        base1=b1;
        base2=b2;
        this.altura = altura;
    }

    //----------------------FUNCIONES-------------------------
    public double calcularArea(){
        double area = ((getBase1()*getBase2())*getAltura())/2;
        return area;
    }
    public void llegirDades(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la base 1");
        setBase1(lector.nextInt());
        System.out.println("Introduce la base 2");
        setBase2(lector.nextInt());
        System.out.println("Introduce la altura");
        setAltura(lector.nextInt());
    }
}
