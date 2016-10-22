package Comparacao;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;
public class Mascara extends JFrame {
	
    private JFormattedTextField jFormattedTextField;

    public Mascara() {
        try {
            MaskFormatter mask = new MaskFormatter("####-####");
            jFormattedTextField = new JFormattedTextField(mask);
            mask = null;
           } catch (Exception e) {
        }
        getContentPane().add(jFormattedTextField);
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new Mascara();
    }
}