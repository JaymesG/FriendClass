/*This class is part of a one time run through test*/
package FriendPackage;
import javax.swing.*;
import java.awt.*;

public class Note extends JTextPane{

	Friend friend;
	JTextPane noteText;
	JScrollPane scrollPane;
	Font font = new Font("Arial", Font.BOLD, 14);
	Color teal = new Color(0, 120, 140);
	String text;

	public Note(Friend friend)
	{
		this.friend = friend;
		
		text = "\nHello and welcome to the friend class. " + 
				friend.getName() + " is excited that you're here! He will be your best friend " + 
				"for as long as you stand to not click the X button. Even if you do decide to exit " +
				"the program, " + friend.getName() + " will love you until the end of time! " + 
				"Now, lets get started by giving " + friend.getName() + " a bath...\n";
		
		noteText = new JTextPane();
		noteText.setContentType("text/html");
		noteText.setEditable(false);
		noteText.setHighlighter(null);
		//noteText.setBorder(BorderFactory.createLineBorder(teal, 5));
		noteText.setFont(font);
		
		scrollPane = new JScrollPane(noteText);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		
		noteText.setText("<html><center><b><p style=font-family:arial>" + text + "<p style></b></center></html>");
	}
	
	public void appendText(String text)
	{
		this.text = this.text + "<br>" + text;
		noteText.setText("<html><center><b><p style=font-family:arial>" + this.text + "<p style></b></center></html>");
	}
	
	public JScrollPane getNotes()
	{
		return scrollPane;
	}
}
