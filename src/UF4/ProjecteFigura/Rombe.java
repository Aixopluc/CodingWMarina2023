package UF4.ProjecteFigura;

import java.util.Scanner;

public class Rombe extends Figura{


    //----------------------ATRIBUTOS-------------------------
    private int dM;
    private int dm;

    //----------------------GET Y SET-------------------------
    public int getdM() {
        return dM;
    }

    public void setdM(int dM) {
        this.dM = dM;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }
    //----------------------CONSTRUCTORAS-------------------------
    public Rombe(){
        setFigura("Rombe");
    }
    public Rombe(int dM,int dm){
        this.dM=dM;
        this.dm=dm;
        setFigura("Rombe");
    }

    //----------------------FUNCIONES-------------------------
    public double calcularArea(){
        double area = (getDm()+getdM())*2;
        return area;
    }
    public void llegirDades(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la diagonal mayor;");
        setdM(lector.nextInt());
        System.out.println("Introduce la diagonal menor");
        setDm(lector.nextInt());
    }
}
