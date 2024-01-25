import javax.swing.*;
import java.time.LocalDate;
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
    private JRadioButton RB1;
    private JRadioButton RB2;
    private JRadioButton RB3;
    private JRadioButton RB4;
    private JPanel panel;
    private JTextArea nakupyBufet;
    private JButton saveBtn;
    private final int[] selectedRocnik = {1};
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

            RB1.addItemListener(e -> handleRadioButtonClick(1));
            RB2.addItemListener(e -> handleRadioButtonClick(2));
            RB3.addItemListener(e -> handleRadioButtonClick(3));
            RB4.addItemListener(e -> handleRadioButtonClick(4));

            int index = 0;
            displayZak(seznamZaku.get(index));
            displayNakupy(seznamNakupu);

            saveBtn.addActionListener(e -> {
                int selectedIndex = 0;

                Zak selectedZak = seznamZaku.get(selectedIndex);
                selectedZak.setJmeno(txtJmeno.getText());
                selectedZak.setPrijmeni(txtPrijmeni.getText());
                selectedZak.setDatumNarozeni(LocalDate.parse(txtDatumNarozeni.getText()));
                selectedZak.setSouhlasGDPR(CheckBox.isSelected());
                selectedZak.setRocnik(selectedRocnik[0]);

                evidenceZaku.ulozZaky(selectedZak);
                displayZak(selectedZak);

                JOptionPane.showMessageDialog(this, "Data byly uloženy", "Paráda", JOptionPane.INFORMATION_MESSAGE);
            });
        }

        private void handleRadioButtonClick(int rocnik) {
            selectedRocnik[0] = rocnik;
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
            nakupyText.append("Datum: ").append(nakupVBufetu.getDatumTransakce()).append(" ").append("Cena: ").append(nakupVBufetu.getCena()).append("\n");
        }

        nakupyBufet.setText(nakupyText.toString());
        nakupyBufet.setEditable(false);
    }
    public static void main(String[] args) {
        ZakForm z = new ZakForm();
        z.setContentPane(z.panel);
        z.setSize(500, 700);
        z.setDefaultCloseOperation(EXIT_ON_CLOSE);
        z.setTitle("Evidence žáků");
        z.setVisible(true);
    }
}