package UF4.Empresa;

public class Client {

    private String nom;
    private String adreca;
    private String tlf;
    private String email;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param e numero de encarrec que quieres asiganr
     */
    public void assignarEncarrec(Encarrec e){}

    /**
     * @param numero de encarrec que quieres eliminar
     */
    public void anularEncarrec(Encarrec e){}
}
