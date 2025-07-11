package _06_calculator;

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator implements ActionListener{
	JTextField field= new JTextField();
	JTextField field2 = new JTextField();
	JButton add = new JButton("add");
	JButton sub = new JButton("sub");
	JButton mul = new JButton("mul");
	JButton div = new JButton("div");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel("result: 0");
	int end;
	int num1;
	int num2;
	String result;
	void main()
	{
		frame.setSize(700,500);
		panel.add(div);
		panel.add(mul);
		panel.add(sub);
		panel.add(add);
		frame.add(panel);
		panel.add(field);
		panel.add(field2);
		frame.setVisible(true);
		mul.setVisible(true);
		div.setVisible(true);
		add.setVisible(true);
		sub.setVisible(true);
		panel.setVisible(true);
		field.setVisible(true);
		field2.setVisible(true);
		mul.addActionListener(this);
		div.addActionListener(this);
		sub.addActionListener(this);
		add.addActionListener(this);
		panel.add(label);
		label.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton souce = (JButton) e.getSource();
		if(souce == add)
		{
			num1 = Integer.parseInt(field.getText());
			num2 = Integer.parseInt(field.getText());
			end = num1 + num2;
			result = String.valueOf(end);
			label.setText("result: " + result);
		}
		else if (souce == sub) {
			num1 = Integer.parseInt(field.getText());
			num2 = Integer.parseInt(field.getText());
			end = num1 - num2;
			result = String.valueOf(end);
			label.setText("result: " + result);
		}
		else if(souce == div)
		{
			num1 = Integer.parseInt(field.getText());
			num2 = Integer.parseInt(field.getText());
			end = num1/num2;
			result = String.valueOf(end);
			label.setText("result: " + result);
		}
		else if(souce == mul)
		{
			num1 = Integer.parseInt(field.getText());
			num2 = Integer.parseInt(field.getText());
			end = num1*num2;
			result = String.valueOf(end);
			label.setText("result: " + result);
		}
	}
	
}
