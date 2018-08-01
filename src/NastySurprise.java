import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	NastySurprise(){
		JFrame b = new JFrame();
	
	JPanel a = new JPanel();
	
	
	
	b.add(a);
	a.add(treat);
	a.add(trick);
	b.setSize(250,250);
	b.setVisible(true);
	
	trick.setText("Trick");
	
	treat.setText("Treat");
	
	}
		
	
	
	
	JButton trick = new JButton();
	
	JButton treat = new JButton();
	
	
public static void main(String[] args) {
	

	
	
}

	private void showPictureFromTheInternet(String imageUrl)
	{
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
	
	
}





@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPress = (JButton)e.getSource();
	if(buttonPress==trick) {
		
	}

}
}
