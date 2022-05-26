package ro.ase.cts;

public class ContBancar {
    private String nrCont;
    private String nume;
    private double suma;
    private Boolean blocat;

    public ContBancar(String nrCont, String nume, double suma, Boolean blocat) {
        this.nrCont = nrCont;
        this.nume = nume;
        this.suma = suma;
        this.blocat = blocat;
    }

    public ContBancar(String nrCont, String nume, double suma) {
    }

    public String getNrCont() {
        return nrCont;
    }

    public void setNrCont(String nrCont) {
        this.nrCont = nrCont;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public Boolean getBlocat() {
        return blocat;
    }

    public void setBlocat(Boolean blocat) {
        this.blocat = blocat;
    }
}
