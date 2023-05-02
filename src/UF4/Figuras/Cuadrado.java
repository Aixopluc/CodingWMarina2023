package UF4.Figuras;

public class Cuadrado {
    public int getCostat() {
        return costat;
    }

    public void setCostat(int costat) {
        this.costat = costat;
    }

    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public int costat;
    public String color;



    /**
     * @param cos el lado  del cuadrado
     * @param col el color del cuadrado
     */
    public Cuadrado(int cos, String col){
        costat=cos;
        color=col;
    }

}
