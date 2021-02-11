import java.util.Random;

public class Character {
	public static final Random rand = new Random();
	
	private String name;
	private float height; //in meters
	private float weight; //in pounds
	private float morality; //ranges from -1 to 1, starts at 0
	private float health; //ranges from 0 to 1, starts at 1
	
	/**
	 * Default constructor for the Character class.
	 */
	public Character()
	{
		this("", 0, 0);
	}
	
	/**
	 * A constructor for the Character class.
	 * 
	 * @param _name the name of the character
	 * @param _height the height of the character (in meters)
	 * @param _weight the weight of the character (in pounds)
	 */
	public Character(String _name, float _height, float _weight)
	{
		name = _name;
		height = _height;
		weight = _weight;
		
		//characters will start off neutral
		morality = 0.0f;
		
		//characters will start off totally healthy
		health = 1;
	}
	
	/** Increases the character's health by a given percentage.
	 * 
	 * @param percentage the amount to increase. Express this value as an integer, not a decimal. Only values between 0 and 100 are accepted.
	 * @return true if health was added, false if health was already at 1.0.
	 */
	public boolean heal(int percentage)
	{
		if (health == 1.0f) return false;
		{
			float amountToAdd = percentage/100f;
			
			health = Math.min(1.0f, health+amountToAdd);
			return true;
		}
	}
	
	/** Decreases the character's health by a given percentage.
	 * 
	 * @param percentage the amount to decrease. Express this value as an integer, not a decimal. Only values between 0 and 100 are accepted.
	 * @return true if health was removed, false if health was already at 0.0.
	 */
	public boolean injure(int percentage)
	{
		if (health == 0.0f) return false;
		else
		{
			float amountToRemove = percentage/100f;
			
			health = Math.max(0.0f, health-amountToRemove);
			return true;	
		}
	}
	
	/** Changes the character's morality morality by a random percentage based on a given percentage.
	 * 
	 * @param maxPercentChange the maximum amount to change the morality value by. A positive maxPercentChange increases the morality, 
	 * 		  while a negative maxPercentChange decreases the morality. Express this value as an integer, not a decimal. Only values between -100 and 100 are accepted.
	 * @return true if the morality changed, false if the morality did not change (it is either at -1.0 or 1.0 already or the user entered 0)
	 */
	public boolean change(int maxPercentChange)
	{
		if (maxPercentChange == -1.0f || maxPercentChange == 0 || maxPercentChange == 1.0f) return false;
		else
		{
			float maxChange = maxPercentChange/100f;
			
			float changeInMorality = rand.nextFloat() * maxChange;
			
			if (maxPercentChange < 0)
			{
				morality = Math.max(-1.0f, morality+changeInMorality);
			}
			else if (maxPercentChange > 0)
			{
				morality = Math.min(1.0f, morality+changeInMorality);
			}	
			return true;
		}
	}
	
	public String toString()
	{
		return ("Name: " + name + " \n" + 
				"Height: " + height + " meters tall \n" +
				"Weight: " + weight + " pounds \n" +
				"Morality: " + morality + "\t(" + determineMorality() + ")" + " \n" + 
				"Health: " + health + "\t(" + determineHealth() + ")");
	}
	
	public String getName()
	{
		return name;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	public float getWeight()
	{
		return weight;
	}
	
	public float getHealth()
	{
		return health;
	}
	
	public float getMorality()
	{
		return morality;
	}
	
	/** checks the health field
	 * 
	 * @return a String depending on the state of health, ranging from dead (0.0), healthy, and totally healthy (1.0)
	 */
	public String determineHealth()
	{
		if (health == 0.0f) return "dead";
		else if (health == 1.0f) return "totally healthy";
		else return "healthy";
	}
	
	/** checks the morality field
	 * 
	 * @return a String depending on the state of morality, ranging from evil (-1.0), slightly evil, neutral (0.0), slightly good, and good (1.0);
	 */
	public String determineMorality()
	{
		if (morality == -1.0f) return "evil";
		else if (morality < 0.0f) return "slightly evil";
		else if (morality == 0.0f) return "neutral";
		else if (morality > 0.0f) return "slightly good";
		else if (morality == 1.0f) return "good";
		else return null;
	}
}
