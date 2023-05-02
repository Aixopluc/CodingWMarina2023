package UF4.ActivitatHerencia;

public class Estudiant extends Persona {

    private String curs;
    private String Assignatures;
    private String Escola;
    private String Notes;

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public String getAssignatures() {
        return Assignatures;
    }

    public void setAssignatures(String assignatures) {
        Assignatures = assignatures;
    }

    public String getEscola() {
        return Escola;
    }

    public void setEscola(String escola) {
        Escola = escola;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
