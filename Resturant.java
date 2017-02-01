package FriendPackage;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Resturant extends JFrame{

	JFrame window;
	JPanel btnPanel;
	
	JButton steak;
	JButton fish;
	JButton fruit;
	JButton soup;
	JButton corn;
	JButton slime;
	
	public Resturant(Friend friend)
	{
		window = new JFrame();
		JFrame window = new JFrame("Riley's Resturant");
		window.setSize(250,100);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		btnPanel = new JPanel(new GridBagLayout());
		createButtons();
		window.add(btnPanel);
		window.setVisible(true);
	}
	
	public void createButtons()
	{
		GridBagConstraints location = new GridBagConstraints();
		location.fill = GridBagConstraints.BOTH;
		Font font = new Font("Arial", Font.BOLD, 14);
		Color teal = new Color(0, 120, 140);
		btnPanel.setBackground(teal);
		
		steak = new JButton("Steak");
		steak.addActionListener(new steakEvent());
		steak.setFont(font);
		location.gridx = 0;
		location.gridy = 0;
		btnPanel.add(steak, location);
		
		fish = new JButton("Fish");
		fish.addActionListener(new steakEvent());
		fish.setFont(font);
		location.gridx = 1;
		location.gridy = 0;
		btnPanel.add(fish, location);
		
		fruit = new JButton("Fruit");
		fruit.addActionListener(new steakEvent());
		fruit.setFont(font);
		location.gridx = 2;
		location.gridy = 0;
		btnPanel.add(fruit, location);
		
		soup = new JButton("Soup");
		soup.addActionListener(new steakEvent());
		soup.setFont(font);
		location.gridx = 0;
		location.gridy = 1;
		btnPanel.add(soup, location);
		
		corn = new JButton("Corn");
		corn.addActionListener(new steakEvent());
		corn.setFont(font);
		location.gridx = 1;
		location.gridy = 1;
		btnPanel.add(corn, location);
		
		slime = new JButton("Slime");
		slime.addActionListener(new steakEvent());
		slime.setFont(font);
		location.gridx = 2;
		location.gridy = 1;
		btnPanel.add(slime, location);
	}
	
	public void close()
	{
		window.setVisible(false);
	}
	
	private class steakEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Resturant food = new Resturant(friend);
		}
	}
	
	private class fishEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Resturant food = new Resturant(friend);
		}
	}
	
	private class fruitEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Resturant food = new Resturant(friend);
		}
	}
	
	private class soupEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Resturant food = new Resturant(friend);
		}
	}
	
	private class cornEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Resturant food = new Resturant(friend);
		}
	}
	
	private class slimeEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Resturant food = new Resturant(friend);
		}
	}
}
