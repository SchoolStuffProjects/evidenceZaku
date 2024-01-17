import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EvidenceZaku {
    private List<Zak> seznamZaku = new ArrayList<>();

    public void pridejZaka(Zak zak){
        seznamZaku.add(zak);
    }

    public EvidenceZaku(List<Zak> seznamZaku) {
        this.seznamZaku.addAll(seznamZaku);
    }

    public List<Zak> ziskejSeznamZaku(){
        return seznamZaku;
    }

    public EvidenceZaku(){
        Zak z1 = new Zak("Pavel", "Dobeš", LocalDate.of(1555, 1, 1), Boolean.TRUE, 1, LocalDate.now(), BigDecimal.valueOf(5));
        seznamZaku.add(z1);
    }
}
