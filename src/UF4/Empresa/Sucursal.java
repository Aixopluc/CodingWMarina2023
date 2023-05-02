package UF4.Empresa;

public class Sucursal {
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
     *
     * @param t transportista qye descansa
     */
    public void descansa(Transportista t){}

    /**
     * @param t transportista que trabaja
     */
    public void treballa(Transportista t){}

    /**
     * @param c cliente que se de de alta
     */
    public void altaclient(Client c){}

    /**
     * @param c cliente que se da de baja
     */
    public void baixaclient (Client c){}

    /**
     * @param c cliente del encarrec
     * @param t transportista del encarrec
     * @param e numero de encarrec
     */
    public void altaencarrec(Client c, Transportista t, Encarrec e){}

    /**
     * @param e numero de encarrec que quieres anular
     */
    public void anularencarrec(Encarrec e){}


}
