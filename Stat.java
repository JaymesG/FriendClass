/*This class is part of a one time run through test*/
package FriendPackage;
import javax.swing.*;
import java.awt.*;

public class Stat extends JPanel{
	
	private Friend friend;
	private JPanel statPanel;
	Font font = new Font("Arial", Font.BOLD, 14);
	Color teal = new Color(0, 120, 140);
	
	private JLabel name;
	private JLabel age;
	private JLabel hunger;
	private JLabel love;
	private JLabel hygiene;
	private JLabel happy;
	private JLabel health;
	private JLabel like;
	private JLabel hate;
	
	private JTextArea nameBox;
	private JTextArea ageBox;
	private JTextArea hungerBox;
	private JTextArea loveBox;
	private JTextArea hygieneBox;
	private JTextArea happyBox;
	private JTextArea healthBox;
	private JTextArea likeBox;
	private JTextArea hateBox;
	
	public Stat(Friend friend)
	{
		this.friend = friend;
		statPanel = new JPanel(new GridBagLayout());
		statPanel.setBorder(BorderFactory.createLineBorder(teal, 5));
		statPanel.setBackground(Color.WHITE);
		createLabels();
		createTextAreas();
		organizePanel();
	}
	
	public JPanel getPanel()
	{
		return statPanel;
	}
	
	public void createLabels()
	{
		name = new JLabel("NAME:  ", SwingConstants.RIGHT);
		name.setFont(font);
		age = new JLabel("AGE:  ", SwingConstants.RIGHT);
		age.setFont(font);
		hunger = new JLabel("HUNGER:  ", SwingConstants.RIGHT);
		hunger.setFont(font);
		love = new JLabel("LOVE:  ", SwingConstants.RIGHT);
		love.setFont(font);
		hygiene = new JLabel("HYGIENE:  ", SwingConstants.RIGHT);
		hygiene.setFont(font);
		happy = new JLabel("HAPPY:  ", SwingConstants.RIGHT);
		happy.setFont(font);
		health = new JLabel("OVERALL:  ", SwingConstants.RIGHT);
		health.setFont(font);
		like = new JLabel("LIKE:  ", SwingConstants.RIGHT);
		like.setFont(font);
		hate = new JLabel("HATE:  ", SwingConstants.RIGHT);
		hate.setFont(font);
	}
	
	public void createTextAreas()
	{
		nameBox = new JTextArea(friend.getName());
		nameBox.setFont(font);
		nameBox.setEditable(false);
		nameBox.setHighlighter(null);
		
		ageBox = new JTextArea(Integer.toString(friend.getAge()));
		ageBox.setFont(font);
		ageBox.setEditable(false);
		ageBox.setHighlighter(null);
		
		hungerBox = new JTextArea(Integer.toString(friend.getHunger()));
		hungerBox.setFont(font);
		hungerBox.setEditable(false);
		hungerBox.setHighlighter(null);
		
		loveBox = new JTextArea(Integer.toString(friend.getLove()));
		loveBox.setFont(font);
		loveBox.setEditable(false);
		loveBox.setHighlighter(null);
		
		hygieneBox = new JTextArea(Integer.toString(friend.getHygiene()));
		hygieneBox.setFont(font);
		hygieneBox.setEditable(false);
		hygieneBox.setHighlighter(null);
		
		happyBox = new JTextArea(Integer.toString(friend.getHappy()));
		happyBox.setFont(font);
		happyBox.setEditable(false);
		happyBox.setHighlighter(null);
		
		healthBox = new JTextArea(friend.getOverallHealth());				//This is a string
		healthBox.setFont(font);
		healthBox.setEditable(false);
		healthBox.setHighlighter(null);
		
		likeBox = new JTextArea(friend.getLike());
		likeBox.setFont(font);
		likeBox.setEditable(false);
		likeBox.setHighlighter(null);
		
		hateBox = new JTextArea(friend.getHate());
		hateBox.setFont(font);
		hateBox.setEditable(false);
		hateBox.setHighlighter(null);
		
		setStatColors();
	}
	
	public void generateRandomEvent()
	{
		
	}
	
	public void setStatColors()
	{
		if(friend.getLove() >= 50)
		{
			Color green = new Color(0, 122, 0);
			loveBox.setForeground(green);
		}else if(friend.getLove() < 50)
		{
			Color red = new Color(153, 0, 0);
			loveBox.setForeground(red);
		}
		
		if(friend.getHappy() >= 50)
		{
			Color green = new Color(0, 122, 0);
			happyBox.setForeground(green);
		}else if(friend.getHappy() < 50)
		{
			Color red = new Color(153, 0, 0);
			happyBox.setForeground(red);
		}
		
		if(friend.getHunger() > 50)
		{
			Color red = new Color(153, 0, 0);
			hungerBox.setForeground(red);
		}else if(friend.getHunger() <= 50)
		{
			Color green = new Color(0, 122, 0);
			hungerBox.setForeground(green);
		}
		
		if(friend.getHygiene() >= 50)
		{
			Color green = new Color(0, 122, 0);
			hygieneBox.setForeground(green);
		}else if(friend.getHygiene() < 50)
		{
			Color red = new Color(153, 0, 0);
			hygieneBox.setForeground(red);
		}
		
		if(friend.getOverallHealth().equalsIgnoreCase("Shiny"))
		{
			Color shiny = new Color(225, 150, 0);
			healthBox.setForeground(shiny);
		}else if(friend.getOverallHealth().equalsIgnoreCase("Healthy"))
		{
			Color healthy = new Color(0, 122, 0);
			healthBox.setForeground(healthy);
		}else if(friend.getOverallHealth().equalsIgnoreCase("Neutral"))
		{
			Color neutral = new Color(80, 80, 80);
			healthBox.setForeground(neutral);
		}else if(friend.getOverallHealth().equalsIgnoreCase("Sick"))
		{
			Color sick = new Color(93, 50, 140);
			healthBox.setForeground(sick);
		}else if(friend.getOverallHealth().equalsIgnoreCase("Dying"))
		{
			Color dying = new Color(153, 0, 0);
			healthBox.setForeground(dying);
		}
	}
	
	public void organizePanel()
	{
		GridBagConstraints location = new GridBagConstraints();
		
		location.gridx = 0;
		location.gridy = 0;
		location.insets.top = 4;
		location.insets.bottom = 4;
		location.fill = GridBagConstraints.BOTH;
		statPanel.add(name, location);
		
		location.gridx = 1;
		location.gridy = 0;
		statPanel.add(nameBox, location);
		
		location.gridx = 2;
		location.gridy = 0;
		statPanel.add(age, location);
		
		location.gridx = 3;
		location.gridy = 0;
		statPanel.add(ageBox, location);
		
		location.gridx = 0;
		location.gridy = 1;
		statPanel.add(happy, location);
		
		location.gridx = 1;
		location.gridy = 1;
		statPanel.add(happyBox, location);
		
		location.gridx = 2;
		location.gridy = 1;
		statPanel.add(hunger, location);
		
		location.gridx = 3;
		location.gridy = 1;
		statPanel.add(hungerBox, location);
		
		location.gridx = 0;
		location.gridy = 2;
		statPanel.add(love, location);
		
		location.gridx = 1;
		location.gridy = 2;
		statPanel.add(loveBox, location);
		
		location.gridx = 2;
		location.gridy = 2;
		statPanel.add(hygiene, location);
		
		location.gridx = 3;
		location.gridy = 2;
		statPanel.add(hygieneBox, location);
		
		location.gridx = 0;
		location.gridy = 3;
		statPanel.add(like, location);
		
		location.gridx = 1;
		location.gridy = 3;
		statPanel.add(likeBox, location);
		
		location.gridx = 2;
		location.gridy = 3;
		
		statPanel.add(hate, location);
		
		location.gridx = 3;
		location.gridy = 3;
		statPanel.add(hateBox, location);
		
		location.gridx = 0;
		location.gridy = 4;
		location.gridwidth = 2;
		statPanel.add(health, location);
		
		location.gridx = 2;
		location.gridy = 4;
		location.gridwidth = 2;
		statPanel.add(healthBox, location);
	}
	
	public void updateStats()
	{
		nameBox.setText(friend.getName());
		ageBox.setText(Integer.toString(friend.getAge()));
		hungerBox.setText(Integer.toString(friend.getHunger()));
		loveBox.setText(Integer.toString(friend.getLove()));
		hygieneBox.setText(Integer.toString(friend.getHygiene()));
		happyBox.setText(Integer.toString(friend.getHappy()));
		healthBox.setText(friend.getOverallHealth());
		likeBox.setText(friend.getLike());
		hateBox.setText(friend.getHate());
		setStatColors();
		friend.averageStats();
	}
}
