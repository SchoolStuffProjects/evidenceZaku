import java.math.BigDecimal;
import java.time.LocalDate;

public class Zak {
    private String jmeno;
    private String prijmeni;
    private LocalDate datumNarozeni;
    private boolean souhlasGDPR;
    private int rocnik;
    private LocalDate datumNakupu;
    private BigDecimal cena;

    public Zak(String jmeno, String prijmeni, LocalDate datumNarozeni, boolean souhlasGDPR, int rocnik, LocalDate datumNakupu, BigDecimal cena) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
        this.souhlasGDPR = souhlasGDPR;
        this.rocnik = rocnik;
        this.datumNakupu = datumNakupu;
        this.cena = cena;
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

    public LocalDate getDatumNakupu() {
        return datumNakupu;
    }

    public void setDatumNakupu(LocalDate datumNakupu) {
        this.datumNakupu = datumNakupu;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }
}
