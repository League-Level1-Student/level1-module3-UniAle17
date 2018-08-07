package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class quiz implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();	
	JTextField field = new JTextField();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	
public static void main(String[] args) {
	quiz blue = new quiz();	
	
}

quiz(){
frame.setVisible(true);
frame.setSize(300,300);
frame.add(panel);
panel.add(button);
panel.add(field);
panel.add(label1);
panel.add(label2);
panel.add(label3);
button.addActionListener(this);
field.setText("");
field.setSize(50,100);
label1.setText("Degrees Fahrenheit");
label2.setText("Degrees Celsius");
button.setText("convert");



}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonpress = (JButton)arg0.getSource();
	if(buttonpress==button) {
		
String useranswer = field.getText();
int numanswer = Integer.parseInt(useranswer);
double calculatoranswer = 5/9 * numanswer - 32;
JOptionPane.showMessageDialog(null, "Your answer is, " +calculatoranswer);
	}
	
			}

	
	
	
	
	
	
}
