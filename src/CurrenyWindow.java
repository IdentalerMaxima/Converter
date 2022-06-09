import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrenyWindow extends JFrame implements ActionListener {

    JFrame frame = new JFrame("Currency conversion");
    JLabel to = new JLabel("to");
    ImageIcon icon = new ImageIcon("converterIcon.jpg");

    String[] currencies = {"Lei", "Forint", "Euro"};
    JComboBox<String> jComboBox = new JComboBox<>(currencies);
    JComboBox<String> jComboBox2 = new JComboBox<>(currencies);

    JTextField textField = new JTextField(15);
    JTextField textField2 = new JTextField(15);



    public void createCurrencyFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(290,130);
        frame.setLocationRelativeTo(null);
        frame.setIconImage(icon.getImage());

        frame.add(jComboBox);
        frame.add(to);
        frame.add(jComboBox2);
        frame.add(textField);
        frame.add(textField2);





    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
