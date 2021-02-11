import java.util.Random;

public interface CharacterInterface {
	public static final Random rand = new Random();
	
	/** Increases the character's health by a given percentage.
	 * 
	 * @param percentage the amount to increase. Express this value as an integer, not a decimal. Only values between 0 and 100 are accepted.
	 * @return true if health was added, false if health was already at 1.0.
	 */
	public boolean heal(int percentage);
	
	/** Decreases the character's health by a given percentage.
	 * 
	 * @param percentage the amount to decrease. Express this value as an integer, not a decimal. Only values between 0 and 100 are accepted.
	 * @return true if health was removed, false if health was already at 0.0.
	 */
	public boolean injure(int percentage);
	
	/** Changes the character's morality morality by a random percentage based on a given percentage.
	 * 
	 * @param maxPercentChange the maximum amount to change the morality value by. A positive maxPercentChange increases the morality, 
	 * 		  while a negative maxPercentChange decreases the morality. Express this value as an integer, not a decimal. Only values between -100 and 100 are accepted.
	 * @return true if the morality changed, false if the morality did not change (it is either at -1.0 or 1.0 already or the user entered 0)
	 */
	public boolean change(int maxPercentChange);
}
