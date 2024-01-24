import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EvidenceZaku {
    private List<Zak> seznamZaku = new ArrayList<>();

    public List<Zak> ziskejSeznamZaku(){
        return seznamZaku;
    }
    public EvidenceZaku(){
        Zak z1 = new Zak("Pavel", "Dobeš", LocalDate.of(1555, 1, 1), Boolean.TRUE, 3);
        seznamZaku.add(z1);
    }
}