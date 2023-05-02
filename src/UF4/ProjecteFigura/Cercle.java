package UF4.ProjecteFigura;

import java.util.Scanner;

public class Cercle extends Figura{

    //----------------------ATRIBUTOS-------------------------
    private int radi;


    //----------------------GET Y SET-------------------------
    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }



    //----------------------CONSTRUCTORAS-------------------------
    public Cercle(){
        setFigura("Cercle");
    }
    public Cercle(int r){
        setFigura("Cercle");
        radi = r;
    }

    //----------------------FUNCIONES-------------------------
    public double calcularArea(){
        double area = Math.pow(getRadi(), 2)*Math.PI;
        return area;
    }
    public void llegirDades(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el radio:");
        setRadi(lector.nextInt());

    }
}
