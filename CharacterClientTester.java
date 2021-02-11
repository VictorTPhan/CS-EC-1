public class CharacterClientTester {
	public static void main(String[] args)
	{
		//Use of default constructor
		System.out.println("A. Use of default constructor");
		Character testChar = new Character();
		System.out.println(testChar.toString());
		System.out.println("----------------------");
		
		//Use of other constructor
		System.out.println("B. Use of other constructor");
		testChar = new Character("John Doe", 2, 150f);
		System.out.println(testChar.toString());
		System.out.println("----------------------");
		
		//Overhealing
		System.out.println("C. Overhealing");
		testChar.heal(100);
		System.out.println(testChar.toString());
		System.out.println("----------------------");
		
		//Taking damage
		System.out.println("D. Taking Damage");
		testChar.injure(50);
		System.out.println(testChar.toString());
		System.out.println("----------------------");
		
		//Overdamaging
		System.out.println("E. Overdamaging");
		testChar.injure(100);
		System.out.println(testChar.toString());
		System.out.println("----------------------");
		
		//Healing
		System.out.println("F. Healing");
		testChar.heal(50);
		System.out.println(testChar.toString());
		System.out.println("----------------------");
		
		//Changing Morality (Positive)
		System.out.println("G. Changing Morality (Positive)");
		testChar.change(100);
		System.out.println(testChar.toString());
		System.out.println("----------------------");
		
		//Changing Morality (Negative)
		System.out.println("H. Changing Morality (Negative)");
		testChar.change(-100);
		System.out.println(testChar.toString());
		System.out.println("----------------------");
		
		//Changing Morality (0%)
		System.out.println("I. Changing Morality (0%)");
		testChar.change(0);
		System.out.println(testChar.toString());
		System.out.println("----------------------");
	}
}
