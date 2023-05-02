package UF4.Agenda;

public class Pagina {
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int dia;
    public int mes;

    public Pagina(){}
    public Pagina(int d,int m){
        dia = d;
        mes = m;
    }

    /**
     * @param c la cita que quieres agregar a la pagina
     */
    public void afegirCita(Cita c){

    }

    /**
     * @param c La cita que quieres borrar de la página
     */
    public void borrarCita(Cita c){

    }

    /**
     * @param Títol El título de la cita que quieres buscar
     * @return Te devuelve la cita
     */
    public Cita cercarCita(String Títol){
        Cita c = new Cita();
        return c;
    }

    /**
     * @return Devuelbve un array de citas
     */
    public Cita[] llistarCites(){
        Cita[] cv = new Cita[10];
        return cv;
    }
}
