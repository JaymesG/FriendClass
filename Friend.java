package FriendPackage;
import java.util.Random;
import javax.swing.JOptionPane;

public class Friend {
	
	private final String FINAL_OWNER;		//User name
	private String name;					//Friend name
	private String overallHealth;			//String of Friend health (Shiny, sick, ect...)
	private String displayLike;				//String of Friend favorite treat
	private String displayHate;				//String of Friend least favorite treat
	//private String gender;
	
	private int age;						//Age of friend based on
	private int hunger;						//Friends hunger (lower is better)
	private int hygiene;					//Friend cleanliness
	private int love;						//Love of Friend towards owner
	private int happy;						//Friend happiness
	private double health;					//Used to determine death / overallHealth
	private double statAverage;				//Used to determine health
	private int like;						//int value of Friend favorite treat
	private int hate;						//int value of Friend least favorite treat
	private int medCount;					//Used to determine how many times given medicine
	private int ageCount;					//Used to determine how many iterations (10 = age++)
	
	// CONSTRUCTOR ---------------------------------------------------------------------------------//
	public Friend(String owner, String name)
	{
		FINAL_OWNER = owner;		//Set name of Friend owner
		this.name = name;			//Set name of Friend
		age = 1;					//Set age of Friend			
		hunger = 50;				//Set Friend hunger
		hygiene = 50;				//Set Friend hygiene
		love = 100;					//Set Friend love
		happy = 100;				//Set Friend happy
		displayLike = "Unknown";	//Hold Friend favorite
		displayHate = "Unknown";	//Hold Friend least favorite
		ageCount = 0;
		checkStatLimits();			//No stat over 100, under 0, average stats, set overallHealth
		generateLike();				//Call to method to set int value to determine Friend favorite
		generateHate();				//Call to method to set int value to determine Friend least favorite
	}

	//COPY -----------------------------------------------------------------------------------------//
	public Friend copy()
	{
		Friend copyFriend = new Friend(FINAL_OWNER, name);
		return copyFriend;
	}
	
	// GENERATE FAVORITE TREAT AND LEAST FAVORITE TREAT --------------------------------------------//
	private void generateLike()
	{
		do
		{
			Random rand = new Random();
			like = rand.nextInt(5)+1;
			
		}while(hate == like);
	}
	
	private void generateHate()
	{
		do
		{
			Random rand = new Random();
			hate = rand.nextInt(5)+1;
			
		}while(like == hate);
	}
	
	// STAT LIMITATIONS ----------------------------------------------------------------------------//
	public void checkStatLimits()
	{
		if(hunger > 100)
		{
			hunger = 100;
		}else if(hunger < 0)
		{
			hunger = 0;
		}else if(hygiene > 100)
		{
			hygiene = 100;
		}else if(hygiene < 0)
		{
			hygiene = 0;
		}else if(love > 100)
		{
			love = 100;
		}else if(love < 0)
		{
			love = 0;
		}else if(happy > 100)
		{
			happy = 100;
		}else if(happy < 0)
		{
			happy = 0;
		}else if(health > 100)
		{
			health = 100;
		}else if(health < 0)
		{
			health = 0;
		}
		
		averageStats();
	}
	
	//AVERAGE STATS ---------------------------------------------------------------------------------//
	public void averageStats()
	{
		statAverage = 100 - hunger;
		statAverage += hygiene + love + happy;
		health = (statAverage / 4);
		setOverall();
	}
	
	//SET OVERALL STATUS ----------------------------------------------------------------------------//
	private void setOverall()
	{
		
		if(health > 95)
		{
			overallHealth = "Shiny";
		}else if(health < 95 && health >= 70)
		{
			overallHealth = "Healthy";
		}else if(health < 70 && health >= 50)
		{
			overallHealth = "Neutral";
		}else if(health < 50 && health >= 30)
		{
			overallHealth = "Sick";
		}else if(health < 30 && health > 10)
		{
			overallHealth = "Dying";
		}else if(health <= 10)
		{
			overallHealth = "Dead";
			checkDeath();
		}
	}
	
	// DEATH ----------------------------------------------------------------------------------------//
	private void checkDeath()
	{
		if(health <= 10)
		{
			JOptionPane.showMessageDialog(null, name + " has died!");
			System.exit(0);
		}
	}
	
	// GETTERS -------------------------------------------------------------------------------------//
	public String getOwner()
	{
		return FINAL_OWNER;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getLike()
	{
		return displayLike;
	}
	
	public String getHate()
	{
		return displayHate;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getHunger()
	{
		return hunger;
	}
	
	public int getHygiene()
	{
		return hygiene;
	}
	
	public int getLove()
	{
		return love;
	}
	
	public int getHappy()
	{
		return happy;
	}
	
	public double getHealth()
	{
		return health;
	}
	
	public String getOverallHealth()
	{
		return overallHealth;
	}
	
	public int getMedCount()
	{
		return medCount;
	}
	
	public int getAgeCount()
	{
		return ageCount;
	}
	
	//SETTERS -------------------------------------------------------------------------------------//
	
	public void rename(String name)
	{
		this.name = name;
	}
	
	public void setHunger(int hunger)
	{
		this.hunger = hunger;
	}
	
	public void setHygiene(int hygiene)
	{
		this.hygiene = hygiene;
	}
	
	public void setLove(int love)
	{
		this.love = love;
	}
	
	public void setHappy(int happy)
	{
		this.happy = happy;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public void setAgeCount()
	{
		ageCount++;
	}
	
	public void setMedCount()
	{
		medCount++;
	}
	
	// INCREASE AND DECREASE MAIN STATS ------------------------------------------------------------//
	// INCREASE
	
	public void checkAge()
	{
		ageCount++;
		
		if((ageCount % 10) == 0)
		{
			age++;
		}
	}
	
	public void increaseHunger(int h)
	{
		hunger += h;
		checkStatLimits();
	}
	
	public void increaseHygiene(int h)
	{
		hygiene += h;
		checkStatLimits();
	}
	
	public void increaseLove(int l)
	{
		love += l;
		checkStatLimits();
	}
	
	public void increaseHappy(int h)
	{
		happy += h;
		checkStatLimits();
	}
	
	public void increaseHealth(int h)
	{
		health += h;
		checkStatLimits();
	}
	
	// DECREASE
	public void decreaseHunger(int h)
	{
		hunger -= h;
		checkStatLimits();
	}
	
	public void decreaseHygiene(int h)
	{
		hygiene -= h;
		checkStatLimits();
	}
	
	public void decreaseLove(int l)
	{
		love -= l;
		checkStatLimits();
	}
	
	public void decreaseHappy(int h)
	{
		happy -= h;
		checkStatLimits();
	}
	
	public void decreaseHealth(int h)
	{
		health -= h;
		checkStatLimits();
	}
}
