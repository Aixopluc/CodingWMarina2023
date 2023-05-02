package UF4.Figuras;

public class Triangulo {
    public int costat1;
    public int costat2;
    public int costat3;
    public String color;

    /**
     * @param c1 el lado 1 del triangulo
     * @param c2 el lado 2 del triangulo
     * @param c3 el lado 3 del triangulo
     * @param col el color del triangulo
     */
    public Triangulo(int c1,int c2,int c3,String col){
        costat1 = c1;
        costat2 = c2;
        costat3 = c3;
        color = col;
    }
}
