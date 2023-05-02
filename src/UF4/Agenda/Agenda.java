package UF4.Agenda;

public class Agenda {
    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int any;
    public Agenda(){}
    public Agenda (int a){
        any = a;
    }

    public void avançarPagina(){

    }
    public void retrocedirPagina(){

    }

    /**
     * @return Devuelve la página que quieres leer
     */
    public Pagina llegirPagina(){

        Pagina p = new Pagina();
        return p;
    }

}
