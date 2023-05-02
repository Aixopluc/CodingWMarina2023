package UF2.EscriureEstrelles;

import UF2.RegistreTemperatures.RegistreTemperatures_PART6;

import java.sql.SQLOutput;

public class estrelles {
    public static void main (String[] args) {


        estrelles programa = new estrelles();
        programa.inici();
    }

    public void inici() {
        estrellar(4);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
    }


    public void estrellar(int est){
        for(int i = 0;i<est;i++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}


