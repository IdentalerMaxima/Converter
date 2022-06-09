import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetricWindow extends JFrame implements ActionListener {

    JFrame frame = new JFrame("Metric conversion");
    ImageIcon icon = new ImageIcon("converterIcon.jpg");


    public void createMetricFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(260, 100);
        frame.setLocation(570, 300);
        frame.setIconImage(icon.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
