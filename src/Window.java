import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    JFrame frame = new JFrame("Converter.V1");

    ImageIcon icon = new ImageIcon("converterIcon.jpg");

    JLabel text = new JLabel("What do you want to convert?");
    JButton buttonCurrency = new JButton("Currency");
    JButton buttonMetrics = new JButton("Metrics");



    public void createFrame(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(260, 100);
        frame.setLocation(570, 300);

        frame.setIconImage(icon.getImage());

        buttonCurrency.setSize(100, 100);
        buttonMetrics.setSize(100, 100);

        frame.add(text, BorderLayout.NORTH);
        frame.add(buttonCurrency);
        frame.add(buttonMetrics);

    }



}
