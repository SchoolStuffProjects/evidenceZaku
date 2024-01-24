import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EvidenceNakupuVBufetu {
    private List<NakupVBufetu> seznamNakupu = new ArrayList<>();
    public List<NakupVBufetu> ziskejSeznamNakupu(){
        return seznamNakupu;
    }
    public EvidenceNakupuVBufetu(){
        NakupVBufetu n1 = new NakupVBufetu(LocalDate.of(1570, 1, 1), BigDecimal.valueOf(7.27));
        NakupVBufetu n2 = new NakupVBufetu(LocalDate.of(1572, 1, 1), BigDecimal.valueOf(690));
        seznamNakupu.add(n1);
        seznamNakupu.add(n2);
    }
}