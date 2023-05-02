package UF4.Empresa;

public class Transportista {

    private String nom;
    private String tlf;
    private int numLlicencia;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public int getNumLlicencia() {
        return numLlicencia;
    }

    public void setNumLlicencia(int numLlicencia) {
        this.numLlicencia = numLlicencia;
    }

    /**
     * @param e Asigna un encarrec a un transportista
     */
    public void assignarEncarrec (Encarrec e){}

    /**
     * @param e encarrec que quieres anular al transportista
     */
    public void anularEncarrec(Encarrec e){}
}
