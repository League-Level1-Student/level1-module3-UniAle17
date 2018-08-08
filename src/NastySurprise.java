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
	JButton trick = new JButton();
	
	JButton treat = new JButton();
	
	NastySurprise(){
	
		JFrame b = new JFrame();
	
	JPanel a = new JPanel();
	
	
	b.setVisible(true);
	b.add(a);
	a.add(treat);
	a.add(trick);
	b.setSize(250,250);
	
	
	trick.setText("Trick");
	
	treat.setText("Treat");
	
	trick.addActionListener(this);
	
	treat.addActionListener(this);
	}
		
	
	
	

	
	
public static void main(String[] args) {
	NastySurprise blue = new NastySurprise();

	
	
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
		showPictureFromTheInternet("http://cdn.akc.org/content/hero/puppy-boundaries_header.jpg");
	}


if(buttonPress==treat) {
	showPictureFromTheInternet("https://media.tenor.com/images/4c6b9e07939a6fcb05c7096da8cbb1cd/tenor.png");
	
}


}}

