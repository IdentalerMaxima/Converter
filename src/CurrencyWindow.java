import com.sun.net.httpserver.Request;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

public class CurrencyWindow extends JFrame implements KeyListener {

    double LeiHuf = 80.38;
    double LeiEur = 0.20;
    double HufLei = 1/LeiHuf;
    double HufEur = 0.0025;
    double EurLei = 1/LeiEur;
    double EurHuf = 1/HufEur;



    //Frame
    JFrame frame = new JFrame("Converter V1");
    ImageIcon icon = new ImageIcon("converterIcon.jpg");

    //Format
    JLabel convertedAmount = new JLabel("");
    JLabel currSymbolGiven = new JLabel("");
    JLabel currSymbolReturned = new JLabel("");

    //Combo box options
    String[] currencies = {"Lei", "Forint", "Euro"};
    String[] currencies2 = {"Forint", "Lei", "Euro"};
    JComboBox<String> jComboBox = new JComboBox<>(currencies);
    JComboBox<String> jComboBox2 = new JComboBox<>(currencies2);

    //Text field (input)
    JTextField textField = new JTextField(10);

    //Numbers
    final DecimalFormat df = new DecimalFormat("0.00");

    public void createCurrencyFrame() {

        //Frame settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(255,130);
        frame.setLocationRelativeTo(null); //center
        frame.setIconImage(icon.getImage()); //icon


        frame.add(jComboBox);//From X
        frame.add(new JLabel("to"));//to
        frame.add(jComboBox2);//To Y

        frame.add(textField);//Data input
        textField.addKeyListener(this);
        frame.add(currSymbolGiven);//Given currency symbol
        frame.add(convertedAmount);//result
        frame.add(currSymbolReturned);//Returned currency symbol

    }

    void Conversion(){

        String currSymbolGivenS = "";
        String convertedAmountS = "";

        try{
            double givenAmount = Double.parseDouble(textField.getText());
            if (jComboBox.getSelectedItem().equals("Lei")){
                currSymbolGivenS = "Lei";

                if (jComboBox2.getSelectedItem().equals("Forint")){
                    currSymbolReturned.setText("Ft");
                    convertedAmountS = " = " + df.format(givenAmount * LeiHuf);

                }else if (jComboBox2.getSelectedItem().equals("Euro")){
                    currSymbolReturned.setText("EUR");
                    convertedAmountS = " = " + df.format(givenAmount * LeiEur);
                }
            }
            else if (jComboBox.getSelectedItem().equals("Forint")){
                currSymbolGivenS = "Ft";

                if (jComboBox2.getSelectedItem().equals("Lei")){
                    currSymbolReturned.setText("Lei");
                    convertedAmountS = " = " + df.format(givenAmount * HufLei);

                }else if (jComboBox2.getSelectedItem().equals("Euro")){
                    currSymbolReturned.setText("EUR");
                    convertedAmountS = " = " + df.format(givenAmount * HufEur);
                }
            }
            else if (jComboBox.getSelectedItem().equals("Eur")) {
                currSymbolGivenS = "EUR";

                if (jComboBox2.getSelectedItem().equals("Lei")) {
                    currSymbolReturned.setText("Lei");
                    convertedAmountS = " = " + df.format(givenAmount * EurLei);

                } else if (jComboBox2.getSelectedItem().equals("Forint")) {
                    currSymbolReturned.setText("Ft");
                    convertedAmountS = " = " + df.format(givenAmount * EurHuf);
                }
            }
        }catch (NumberFormatException e) {
            e.getStackTrace();
        }
        currSymbolGiven.setText(currSymbolGivenS);
        convertedAmount.setText(convertedAmountS);
    }


    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {Conversion();}
}
