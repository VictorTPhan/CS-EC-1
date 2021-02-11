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

	public void heal(int percentage)
	{
		float amountToAdd = percentage/100f;
		
		health = Math.min(1.0f, health+amountToAdd);
	}
	
	public void injure(int percentage)
	{
		float amountToRemove = percentage/100f;
		
		health = Math.max(0.0f, health-amountToRemove);
	}

	public void change(int maxPercentChange)
	{
		float maxChange = maxPercentChange/100f;
		
		float changeInMorality = rand.nextFloat() * maxChange;
		
		if (maxPercentChange < 0)
		{
			morality = Math.max(0.0f, morality+changeInMorality);
		}
		else if (maxPercentChange > 0)
		{
			morality = Math.min(1.0f, morality+changeInMorality);
		}
		else
			return;
	}

	public String toString()
	{
		return ("Name: " + name + " \n" + 
				"Height: " + height + " meters tall \n" +
				"Weight: " + weight + " pounds \n" +
				"Morality: " + morality + " \n" + 
				"Health: " + health);
	}
}
