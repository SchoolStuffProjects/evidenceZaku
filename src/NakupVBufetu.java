import java.math.BigDecimal;
import java.time.LocalDate;

public class NakupVBufetu {
    private LocalDate datumTransakce;
    private BigDecimal cena;

    public NakupVBufetu(LocalDate datumTransakce, BigDecimal cena) {
        this.datumTransakce = datumTransakce;
        this.cena = cena;
    }

    public LocalDate getDatumTransakce() {
        return datumTransakce;
    }

    public void setDatumTransakce(LocalDate datumTransakce) {
        this.datumTransakce = datumTransakce;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }
}