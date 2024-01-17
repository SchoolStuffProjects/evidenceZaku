import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ZakForm extends JFrame {
    private JTextField txtJmeno;
    private JTextField txtPrijmeni;
    private JTextField txtDatumNarozeni;
    private JLabel Ljmeno;
    private JLabel Lprijmeni;
    private JLabel LdatumNarozeni;
    private JLabel LbooleanGDPR;
    private JLabel Lrocnik;
    private JLabel LNakupy;
    private JCheckBox CheckBox;
    private JRadioButton prvniRB;
    private JRadioButton druhyRB;
    private JRadioButton tretiRB;
    private JRadioButton ctvrtyRB;
    private JPanel panel;
    private JTextArea nakupyBufet;
    private JButton saveBtn;


    public ZakForm() {
        EvidenceZaku evidence = new EvidenceZaku();
        List<Zak> seznamZaku = new ArrayList<>();
        Zak z1 = new Zak("Pavel", "Dobeš", LocalDate.of(1555, 1, 1), false, 3, LocalDate.now(), BigDecimal.valueOf(5));
        seznamZaku.add(z1);

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(prvniRB);
        btnGroup.add(druhyRB);
        btnGroup.add(tretiRB);
        btnGroup.add(ctvrtyRB);

        int index = 0;
        displayZak(evidence.ziskejSeznamZaku().get(index));

        saveBtn.addActionListener(e -> {

        });
    }

    public void displayZak(Zak zak) {
        txtJmeno.setText(zak.getJmeno());
        txtPrijmeni.setText(zak.getPrijmeni());
        txtDatumNarozeni.setText(String.valueOf(zak.getDatumNarozeni()));
        if (zak.isSouhlasGDPR()) {
            CheckBox.setSelected(true);
        }

        switch (zak.getRocnik()) {
            case 1 -> prvniRB.setSelected(true);
            case 2 -> druhyRB.setSelected(true);
            case 3 -> tretiRB.setSelected(true);
            case 4 -> ctvrtyRB.setSelected(true);
        }
    }


    public static void main(String[] args) {
        ZakForm z = new ZakForm();
        z.setContentPane(z.panel);
        z.setSize(500, 700);
        z.setDefaultCloseOperation(EXIT_ON_CLOSE);
        z.setVisible(true);
    }
}
