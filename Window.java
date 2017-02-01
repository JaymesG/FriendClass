/*This class is part of a one time run through test*/
package FriendPackage;
import javax.swing.*;
import java.awt.*;


public class Window extends JFrame{

	
	public static void main(String[] args)
	{
		Friend mainFriend = new Friend("Jaymes", "Boop");
		JFrame window = new JFrame("Friend Class");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//window.setResizable(false);
		window.setSize(400, 500);
		window.setLocationRelativeTo(null);
		
		JPanel mainPanel = new JPanel(new GridBagLayout());
		GridBagConstraints location = new GridBagConstraints();
		Color tealBack = new Color(0, 140, 160);
		Font titleFont = new Font("Arial", Font.BOLD, 18);
		mainPanel.setBackground(tealBack);
		window.add(mainPanel);

		Stat statPanel = new Stat(mainFriend);
		Note notePanel = new Note(mainFriend);
		Buttons btnPanel = new Buttons(mainFriend, notePanel, statPanel);
		
		JLabel friendStatus = new JLabel("FRIEND STATUS");
		JLabel notifications = new JLabel("NOTIFICATIONS");
		friendStatus.setFont(titleFont);
		friendStatus.setForeground(Color.WHITE);
		notifications.setFont(titleFont);
		notifications.setForeground(Color.WHITE);
		
		location.insets.bottom = 5;
		
		//Row 1
		location.gridx = 0;
		location.gridy = 0;
		//location.weightx = 0;
		//location.weighty = 0;
		location.fill = GridBagConstraints.NONE;
		location.anchor = GridBagConstraints.PAGE_START;
		mainPanel.add(friendStatus, location);
		
		//Row 2
		location.gridx = 0;
		location.gridy = 1;
		//location.weightx = 0;
		//location.weighty = 0;
		location.fill = GridBagConstraints.HORIZONTAL;
		location.anchor = GridBagConstraints.CENTER;
		mainPanel.add(statPanel.getPanel(), location);
		
		//Row 3
		location.gridx = 0;
		location.gridy = 2;
		//location.weightx = 0;
		//location.weighty = 0;
		location.fill = GridBagConstraints.NONE;
		location.anchor = GridBagConstraints.NORTH;
		mainPanel.add(notifications, location);
		
		//Row 4
		location.gridx = 0;
		location.gridy = 3;
		location.weightx = 0;
		location.weighty = 5;
		location.fill = GridBagConstraints.BOTH;
		location.anchor = GridBagConstraints.NORTH;
		mainPanel.add(notePanel.getNotes(), location);
		
		//Row 5
		location.gridx = 0;
		location.gridy = 4;
		location.weightx = 0;
		location.weighty = 0;
		location.fill = GridBagConstraints.BOTH;
		location.anchor = GridBagConstraints.CENTER;
		mainPanel.add(btnPanel.getPanel(), location);
			
		window.setVisible(true);
	}
}
