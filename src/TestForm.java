import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestForm {

    private JButton rezerwacjeButton;
    private JButton klienciButton;
    private JButton roweryButton;
    private JButton dodajRezerwacjęButton;
    private JTextField textField1;
    private JButton usuńRezerwacjęButton;
    JPanel TestPanel;
    private JTable reservationTable;

    private String[] columnNames = {
            "Nazwa",
            "Imię",
            "Nazwisko",
            "Adres",
            "Adres mailowy",
            "Pesel"
    };

    public TestForm() {
        usuńRezerwacjęButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        dodajRezerwacjęButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
