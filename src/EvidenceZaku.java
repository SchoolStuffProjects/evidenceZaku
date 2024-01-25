import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;

public class EvidenceZaku {
    private List<Zak> seznamZaku = new ArrayList<>();

    public List<Zak> ziskejSeznamZaku() {
        return seznamZaku;
    }
    public EvidenceZaku() {
        nactiZaky();
    }

    private void nactiZaky() {
        Preferences prefs = Preferences.userRoot();
        String jmeno = prefs.get("jmeno", "jmeno");
        String prijmeni = prefs.get("prijmeni", "prijmeni");
        LocalDate datumNarozeni = LocalDate.parse(prefs.get("datumNarozeni", "1111-11-11"));
        boolean souhlasGDPR = prefs.getBoolean("souhlasGDPR", true);
        int rocnik = prefs.getInt("rocnik", 0);

        Zak defaultZak = new Zak(jmeno, prijmeni, datumNarozeni, souhlasGDPR, rocnik);
        seznamZaku = List.of(defaultZak);
    }

    public void ulozZaky(Zak updatedZak) {
        Preferences prefs = Preferences.userRoot();
        prefs.put("jmeno", updatedZak.getJmeno());
        prefs.put("prijmeni", updatedZak.getPrijmeni());
        prefs.put("datumNarozeni", updatedZak.getDatumNarozeni().toString());
        prefs.putBoolean("souhlasGDPR", updatedZak.isSouhlasGDPR());
        prefs.putInt("rocnik", updatedZak.getRocnik());
    }
}