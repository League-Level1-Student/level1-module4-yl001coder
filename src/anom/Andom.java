package anom;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JButton;

import java.util.Random;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Andom {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	Random random = new Random();
	JMenuBar menu = new JMenuBar();
		public static void main(String[] args) {
			new Andom().slip();

	}
		public void slip()
		{
			JOptionPane.showMessageDialog(panel, "After a long day of school, you find yourself staggering towards your front door. [continue]");
			JOptionPane.showMessageDialog(panel, "However, before you can even reach the front door, a  gloved hand reaches out and grasps your arm. \nScared, you try to pull back. However, it doesn't budge. \nBefore you can scream for help, the figure grasps your mouth with their hand, and you get dragged away... \n[continue]");
			String e = JOptionPane.showInputDialog("Do you let yourself get captured? \n [yes/no]", panel);
			if(e.equalsIgnoreCase("yes"))
			{
				//yes
				//getting taken away
				JOptionPane.showMessageDialog(panel, "Choosing to go limp, you sigh and close your eyes, fatigued, not even wondering about what would happen. \nYou get dragged into a white van, and barely hear the door slam, and before you know it, you're driving off somewhere.");
			}
			else
			{
				//no
				//fight back, captured
				JOptionPane.showMessageDialog(panel, "You fight back, trying to struggle free with whatever strength you have left. \nYou then turn around, and punch the person in the face, dashing off, it's not long until their white van reaches you, and you get pulled in, panting.");
			}
		}

}
