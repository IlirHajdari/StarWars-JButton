import javax.swing.*;

public class StarWarsButton {
	public static void main(String[] args) {
		JFrame f=new JFrame("Star Wars Button");
		JButton b=new JButton("Star Wars!");
		
		b.setBounds(50,100,95,30);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
