package _05_fortune_teller;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new FortuneTeller());
        begin();
    }

    static void begin() {
        // Welcome the user. Give them a hint for the secret location.
    	JPanel panel = new JPanel();
    	JOptionPane.showMessageDialog(panel, panel, "Welcome...", 0);
    }
}
