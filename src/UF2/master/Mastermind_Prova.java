package UF2.master;
import UF2.mmm.mmm;

import java.util.Scanner;

//Un programa per jugar al MasterMind.
public class Mastermind_Prova {
    //Constants
    public final static char TOT_CORRECTE = '0';
    public final static char MALA_POSICIO = 'X';
    public final static char INCORRECTE = '-';
    public final int LONG_SECRET = 5;
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static String secret = "";
    public static String resposta = "";
    public static boolean fin = false;
    public static boolean comprovar = false;

    //Mètodes associats al problema general
    public static void main(String[] args) {
        //desenvolupeu el codi d'aquesta funció
        Mastermind_Prova programa = new Mastermind_Prova();
        programa.inici();

    }


    public void inici() {
        //desenvolupeu el codi d'aquesta funció
        secret = generarParaulaSecreta();
        System.out.println(secret);
        while (!fin){
            resposta=preguntarResposta();
            if(comprovarResposta(resposta) == comprovar){
                System.out.println("Només pots introduir lletres, recorda que només pots introduir 5!!!!!!");
                System.out.println("Torna a començar!");
            }
            else{
                fin=resoldreResposta(secret,resposta);
            }
        }

    }


    //Mètodes associats al primer nivell de descomposició
    //Param. entrada: nada
    //Param. sortida: string (res- palabra secrete)
    public String generarParaulaSecreta() {
        String res = "";
        for (int i = 0; i < LONG_SECRET; i++) {
            res = res + generarLletraAleatoria();
        }
        return res;
    }

    //Param. entrada: cap, tot s’obté del teclat
    // Param. sortida: la paraula de resposta (un String)
    public String preguntarResposta() {
        //desenvolupeu el codi d'aquesta funci
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriu 5 lletres minúscules: ");
        String res = lector.nextLine();
        return res;
    }

    //Param. entrada: string string
    //Param. sortida: boolean
    public boolean resoldreResposta(String secret, String resposta) {
        String res = generarPista(secret, resposta);
        boolean fi = false;
        System.out.print("La resposta és [" + res + "].");
        if (resposta.equals(secret)){
            System.out.println("Has encertat!");
            fi = true;
        } else {
            System.out.println("Continua intentant−ho!");
        }
        return fi;
    }

    //Mètodes associats al segon nivell de descomposició
    //Param. entrada:nada
    //Param. sortida: char
    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % abc.length());
        return abc.charAt(index);
    }

    //Param. entrada:string
    //Param. sortida: boolean
    public boolean comprovarResposta(String resposta) {
        if (resposta.length() != LONG_SECRET) {
            return false;
        }
        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);
            if ( -1 == abc.indexOf(c)){
                return false;
            }
        }
        return true;
    }

    //Param. entrada: string string
    //Param. sortida: string
    public String generarPista(String s, String r) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char charSecret = s.charAt(i);
            char charResposta = r.charAt(i);
            if (charSecret == charResposta) {
                res = res + TOT_CORRECTE;
            }
            else if (s.indexOf(charResposta) != - 1){
                res = res + MALA_POSICIO;
            }
            else {
                res = res + INCORRECTE;
            }
        }
        return res;
    }
}

