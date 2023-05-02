package UF4.Figuras;

public class Rectangle {
    public int base;
    public int alura;
    public String color;

    public Rectangle(int b,int a){
        base = b;
        alura = a;
    }
    public Rectangle(){

    }

    public Rectangle (String c){
        color = c;
    }
    public Rectangle (String c,int b,int a){
        color = c;
        base = b;
        alura = a;
    }
}
