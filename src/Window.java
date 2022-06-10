import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
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
        frame.setLocationRelativeTo(null);

        frame.setIconImage(icon.getImage());

        buttonCurrency.setSize(100, 100);
        buttonCurrency.addActionListener(this);
        buttonMetrics.setSize(100, 100);
        buttonMetrics.addActionListener(this);

        frame.add(text, BorderLayout.NORTH);
        frame.add(buttonCurrency);
        frame.add(buttonMetrics);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonCurrency){
            frame.setVisible(false);
            frame.dispose();
            System.out.println("Open curr. window");
            CurrencyWindow currencyWindow = new CurrencyWindow();
            currencyWindow.createCurrencyFrame();
        }
        if (e.getSource() == buttonMetrics){
            frame.setVisible(false);
            frame.dispose();
            System.out.println("Open metric window");
            MetricWindow metricWindow = new MetricWindow();
            metricWindow.createMetricFrame();
        }
    }
}
