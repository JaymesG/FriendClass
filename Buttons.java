/*This class is part of a one time run through test*/
package FriendPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JPanel{
	
	protected Friend friend;
	protected Note note;
	protected Stat stat;
	protected Resturant food;
	
	int feedCount = 0;
	int treatCount = 0;
	int playCount = 0;
	int hugCount = 0;
	int kissCount = 0;
	int batheCount = 0;
	int medxCount = 0;
	
	private static final long serialVersionUID = 781300901663590625L;
	private JPanel btnPanel;
	private JButton feed;
	private JButton treat;
	private JButton play;
	private JButton hug;
	private JButton kiss;
	private JButton bathe;
	private JButton medx;
	private JButton menu;
	
	public Buttons(Friend friend, Note note, Stat stat)
	{
		btnPanel = new JPanel(new GridBagLayout());
		btnPanel.setBorder(BorderFactory.createLoweredBevelBorder());
		this.friend = friend;
		this.note = note;
		this.stat = stat;
		createButtons();
	}
	
	public JPanel getPanel()
	{
		return btnPanel;
	}
	
	private void createButtons()
	{
		GridBagConstraints location = new GridBagConstraints();
		location.fill = GridBagConstraints.BOTH;					//Makes buttons all one size
		Font font = new Font("Arial", Font.BOLD, 14);
		Color teal = new Color(0, 120, 140);
		btnPanel.setBackground(teal);
		
		location.insets.top = 5;
		location.insets.bottom = 5;
		location.insets.left = 5;
		location.insets.right = 5;
		
		feed = new JButton("Feed");
		feed.addActionListener(new feedEvent());
		feed.setFont(font);
		location.gridx = 0;
		location.gridy = 0;
		btnPanel.add(feed, location);
		
		treat = new JButton("Treat");
		treat.addActionListener(new treatEvent());
		treat.setFont(font);
		location.gridx = 1;
		location.gridy = 0;
		btnPanel.add(treat, location);
		
		play = new JButton("Play");
		play.addActionListener(new playEvent());
		play.setFont(font);
		location.gridx = 2;
		location.gridy = 0;
		btnPanel.add(play, location);
		
		hug = new JButton("Hug");
		hug.addActionListener(new hugEvent());
		hug.setFont(font);
		location.gridx = 3;
		location.gridy = 0;
		btnPanel.add(hug, location);
		
		kiss = new JButton("Kiss");
		kiss.addActionListener(new kissEvent());
		kiss.setFont(font);
		location.gridx = 0;
		location.gridy = 1;
		btnPanel.add(kiss, location);
		
		bathe = new JButton("Bathe");
		bathe.addActionListener(new batheEvent());
		bathe.setFont(font);
		location.gridx = 1;
		location.gridy = 1;
		btnPanel.add(bathe, location);
		
		medx = new JButton("MedX");
		medx.addActionListener(new medxEvent());
		medx.setFont(font);
		location.gridx = 2;
		location.gridy = 1;
		btnPanel.add(medx, location);
		
		menu = new JButton("Menu");
		menu.addActionListener(new menuEvent());
		menu.setFont(font);
		location.gridx = 3;
		location.gridy = 1;
		btnPanel.add(menu, location);
	}
	
	
	
	//ACTION LISTENERS -------------------------------------------------------------------------//
	private class feedEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			food = new Resturant(friend);
		}
	}
	
	private class treatEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			friend.decreaseHunger(5);
			note.appendText("<br>*********** MESSAGE ***********");
			note.appendText("Hehe, " + friend.getName() + " likes treats!");
			note.appendText("<font color = green><b>Hunger decreased by 5!</b></font color>");
			friend.checkAge();
			stat.updateStats();
			treatCount++;
		}
	}
	
	private class playEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			friend.increaseHappy(5);
			note.appendText("<br>*********** MESSAGE ***********");
			note.appendText(friend.getName() + " likes to play games!");
			note.appendText("<font color = green><b>Happiness increased by 5!</b></font color>");
			friend.checkAge();
			stat.updateStats();
			playCount++;
		}
	}
	
	private class hugEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			friend.increaseHappy(10);
			note.appendText("<br>*********** MESSAGE ***********");
			note.appendText(friend.getName() + " loves to be hugged!");
			note.appendText("<font color = green><b>Happiness increased by 10!</b></font color>");
			friend.checkAge();
			stat.updateStats();
			hugCount++;
		}
	}
	
	private class kissEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			friend.increaseLove(10);
			note.appendText("<br>*********** MESSAGE ***********");
			note.appendText("MUAH!");
			note.appendText("<font color = green><b>Love increased by 10!</b></font color>");
			friend.checkAge();
			stat.updateStats();
			kissCount++;
		}
	}
	
	private class batheEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			friend.increaseHygiene(10);
			note.appendText("<br>*********** MESSAGE ***********");
			note.appendText("You gave " + friend.getName() + " a bath!");
			note.appendText("<font color = green><b>Hygiene increased by 10!</b></font color>");
			friend.checkAge();
			stat.updateStats();
			batheCount++;
		}
	}
	
	private class medxEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			friend.increaseHunger(10);
			friend.decreaseHygiene(10);
			friend.decreaseHappy(10);
			friend.decreaseLove(10);
			note.appendText("<br>*********** MESSAGE ***********");
			note.appendText("<font color = red><b>Hunger increased by 10!</b></font color>");
			note.appendText("<font color = red><b>Hygiene decreased by 10!</b></font color>");
			note.appendText("<font color = red><b>Happiness decreased by 10!</b></font color>");
			note.appendText("<font color = red><b>Love decreased by 10!</b></font color>");
			friend.checkAge();
			stat.updateStats();
			medxCount++;
		}
	}
	
	private class menuEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			note.appendText("Action not implemented.\n");
		}
	}
}
