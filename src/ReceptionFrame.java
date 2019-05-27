import javax.swing.*;
import java.awt.*;

public class ReceptionFrame extends JFrame {

    public ReceptionFrame() {
        super("Recepcjonista");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.darkGray);
        setSize(300, 100);
        setLocation(50, 50);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(menuPanel());
        add(rezerwacjePanel());

        setVisible(true);
    }

    private JPanel menuPanel(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.add(new JButton("Rezerwacje"));
        panel.add(new JButton("Klienci"));
        panel.add(new JButton("Rowery"));

        return panel;
    }

    private JPanel rezerwacjePanel(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        JLabel podajNumer = new JLabel("Podaj numer rezerwacji:");


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
