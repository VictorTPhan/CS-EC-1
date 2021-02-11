public class CharacterClientTester {
	public static void main(String[] args)
	{
		//Use of default constructor
		System.out.println("A. Use of default constructor");
		CharacterInterface testChar = new Character();
		System.out.println(testChar.toString());
		System.out.println("----------------------");
		
		//Use of other constructor
		System.out.println("B. Use of other constructor");
		testChar = new Character("John Doe", 2, 150f);
		System.out.println(testChar.toString());
		System.out.println("----------------------");
		
		//Overhealing
		System.out.println("C. Overhealing");
		heal(testChar, 100);
		
		//Taking damage
		injure(testChar, 50);
		
		//Overdamaging
		System.out.println("E. Overdamaging");
		injure(testChar, 100);
		
		//Healing
		System.out.println("F. Healing");
		heal(testChar, 50);
		
		//Changing Morality (Positive)
		System.out.println("G. Changing Morality (Positive)");
		change(testChar, 100);
		
		//Changing Morality (Negative)
		System.out.println("H. Changing Morality (Negative)");
		change(testChar, -100);
		
		//Changing Morality (0%)
		System.out.println("I. Changing Morality (0%)");
		change(testChar, 0);
		
		//Testing percent error
		System.out.println("J. Incorrect input");
		heal(testChar, 2000);
	}
	
	/** Increases the character's health by a given percentage.
	 * 
	 * @param percentage the amount to increase. Express this value as an integer, not a decimal. Only values between 0 and 100 are accepted.
	 */
	public static void heal(CharacterInterface cI, int percentage)
	{
		if (!cI.heal(percentage)) System.out.println("Could not heal!");
		else System.out.println(cI.toString());
		System.out.println("----------------------");
	}
	
	/** Decreases the character's health by a given percentage.
	 * 
	 * @param percentage the amount to decrease. Express this value as an integer, not a decimal. Only values between 0 and 100 are accepted.
	 */
	public static void injure(CharacterInterface cI, int percentage)
	{
		if (!cI.injure(percentage)) System.out.println("Could not injure further!");
		else System.out.println(cI.toString());
		System.out.println("----------------------");
	}

	/** Changes the character's morality morality by a random percentage based on a given percentage.
	 * 
	 * @param maxPercentChange the maximum amount to change the morality value by. A positive maxPercentChange increases the morality, 
	 * 		  while a negative maxPercentChange decreases the morality. Express this value as an integer, not a decimal. Only values between -100 and 100 are accepted.
	 */
	public static void change(CharacterInterface cI, int percentage)
	{
		if (!cI.change(percentage)) System.out.println("The morality did not change!");
		else System.out.println(cI.toString());
		System.out.println("----------------------");
	}
}
