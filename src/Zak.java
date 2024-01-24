import java.math.BigDecimal;
import java.time.LocalDate;

public class Zak {
    private String jmeno;
    private String prijmeni;
    private LocalDate datumNarozeni;
    private boolean souhlasGDPR;
    private int rocnik;

    public Zak(String jmeno, String prijmeni, LocalDate datumNarozeni, boolean souhlasGDPR, int rocnik) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
        this.souhlasGDPR = souhlasGDPR;
        this.rocnik = rocnik;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public boolean isSouhlasGDPR() {
        return souhlasGDPR;
    }

    public void setSouhlasGDPR(boolean souhlasGDPR) {
        this.souhlasGDPR = souhlasGDPR;
    }

    public int getRocnik() {
        return rocnik;
    }

    public void setRocnik(int rocnik) {
        this.rocnik = rocnik;
    }
}