package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	JFrame red = new JFrame();
	JPanel orange = new JPanel();
	JTextField yellow = new JTextField();
	JTextField green = new JTextField();
	JButton one = new JButton();
	JButton two = new JButton();
	JButton three = new JButton();
	JButton four = new JButton();
	
	public Calculator() {
	
	red.add(orange);
	orange.add(yellow);
	orange.add(green);
	orange.add(one);
	orange.add(two);
	orange.add(three);
	orange.add(four);	
	
	
	one.setText("add");	
	two.setText("subtract");	
	three.setText("multiply");	
	four.setText("divide");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
	}
}
	



