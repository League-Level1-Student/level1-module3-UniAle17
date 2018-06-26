import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton trick = new JButton();
	
	JButton treat = new JButton();
public static void main(String[] args) {
	

	JFrame b = new JFrame();
	
	JPanel a = new JPanel();
	
	
	
	b.add(a);
	a.add(treat);
	a.add(trick);
	b.setSize(250,250);
	b.setVisible(true);
	
	trick.setText("Trick");
	
	treat.setText("Treat");
	
	trick.addActionListener(null);
	treat.addActionListener(null);
	
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPress = (JButton)e.getSource();
	if(buttonPress==trick) {
		
	}
	
}
}
