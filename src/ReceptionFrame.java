import javax.swing.*;
import java.awt.*;

public class ReceptionFrame extends JFrame {

    public ReceptionFrame() {
        super("Recepcjonista");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.darkGray);
        setSize(700, 120);
        setLocation(50, 50);
        setLayout(new GridLayout(2, 1));

        add(menuPanel());
        add(rezerwacjePanel());

        setVisible(true);
    }

    private JPanel menuPanel(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setSize(500, 40);

        panel.add(new JButton("Rezerwacje"));
        panel.add(new JButton("Klienci"));
        panel.add(new JButton("Rowery"));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        return panel;
    }

    private JPanel rezerwacjePanel(){
        JPanel panel = new JPanel();
        panel.setSize(600, 60);
        panel.setAlignmentY(100);
        panel.setBackground(Color.darkGray);
        panel.setLayout(new GridLayout(1, 2));

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        JPanel rightPanel = new JPanel();
        leftPanel.setSize(500, 60);

        JLabel podajNumer = new JLabel("Podaj numer rezerwacji:");
        JButton dodajRezerwacje = new JButton("Dodaj rezerwację");
        JButton usunRezerwacje = new JButton("Usuń rezerwację");
        JTextField numerRezerwacji = new JTextField();
        numerRezerwacji.setSize(200, 20);

        leftPanel.add(dodajRezerwacje);
        rightPanel.add(podajNumer);
        rightPanel.add(numerRezerwacji);
        rightPanel.add(usunRezerwacje);

        panel.add(leftPanel);
        panel.add(rightPanel);
        return panel;
    }

    private JPanel klientPanel(){
        JPanel panel = new JPanel();
        return panel;
    }

    private JPanel rowerPanel(){
        JPanel panel = new JPanel();
        return panel;
    }

}
