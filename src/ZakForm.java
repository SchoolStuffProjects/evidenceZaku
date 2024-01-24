import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    private JRadioButton RB1;
    private JRadioButton RB2;
    private JRadioButton RB3;
    private JRadioButton RB4;
    private JPanel panel;
    private JTextArea nakupyBufet;
    private JButton saveBtn;


    public ZakForm() {
            EvidenceZaku evidenceZaku = new EvidenceZaku();
            List<Zak> seznamZaku = evidenceZaku.ziskejSeznamZaku();
            EvidenceNakupuVBufetu evidenceNakupuVBufetu = new EvidenceNakupuVBufetu();
            List<NakupVBufetu> seznamNakupu = evidenceNakupuVBufetu.ziskejSeznamNakupu();

            ButtonGroup btnGroup = new ButtonGroup();
            btnGroup.add(RB1);
            btnGroup.add(RB2);
            btnGroup.add(RB3);
            btnGroup.add(RB4);

            int index = 0;
            displayZak(seznamZaku.get(index));
            displayNakupy(seznamNakupu);

            saveBtn.addActionListener(e -> {

            });
        }

    public void displayZak(Zak zak) {
        txtJmeno.setText(zak.getJmeno());
        txtPrijmeni.setText(zak.getPrijmeni());
        txtDatumNarozeni.setText(String.valueOf(zak.getDatumNarozeni()));
        if(zak.isSouhlasGDPR()){
            CheckBox.setSelected(true);
        }
        switch (zak.getRocnik()) {
            case 1 -> RB1.setSelected(true);
            case 2 -> RB2.setSelected(true);
            case 3 -> RB3.setSelected(true);
            case 4 -> RB4.setSelected(true);
        }
    }

    public void displayNakupy(List<NakupVBufetu> seznamNakupu) {
        StringBuilder nakupyText = new StringBuilder();

        for (NakupVBufetu nakupVBufetu : seznamNakupu) {
            nakupyText.append("Datum: ").append(nakupVBufetu.getDatumTransakce()).append(" ")
                    .append("Cena: ").append(nakupVBufetu.getCena()).append("\n");
        }

        nakupyBufet.setText(nakupyText.toString());
        nakupyBufet.setEditable(false);
    }
    public static void main(String[] args) {
        ZakForm z = new ZakForm();
        z.setContentPane(z.panel);
        z.setSize(500, 700);
        z.setDefaultCloseOperation(EXIT_ON_CLOSE);
        z.setVisible(true);
    }
}
