package UF4.Agenda;

public class Cita {
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public String getTítol() {
        return títol;
    }

    public void setTítol(String títol) {
        this.títol = títol;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private int dia;
    private int minuts;
    private String títol;
    private String text;

    public Cita(){}
    public Cita (int dia, int minuts,String títol,String text){
        this.dia = dia;
        this.minuts = minuts;
        this.títol=títol;
        this.text=text;

    }

    /**
     * @param t es el text que quieres modificar
     */
    public void modificarText(String t){
        text = t;
    }
}
