package _06_calculator;

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator {
	JTextField field,field2 = new JTextField();
	JButton add = new JButton("add");
	JButton sub = new JButton("sub");
	JButton mul = new JButton("mul");
	JButton div = new JButton("div");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	void main()
	{
		panel.add(div);
		panel.add(mul);
		panel.add(sub);
		panel.add(add);
		frame.add(panel);
		panel.add(field);
		panel.add(field2);
	}
	
	void ActionPerformed(ActionEvent e)
	{
		if(e.getSource() == add)
		{
			
		}
		else if(e.getSource() == sub)
		{
			
		}
		else if(e.getSource() == mul)
		{
			
		}
		else if(e.getSource() == div)
		{
			
		}
	}
}
