import java.util.Scanner;

/**
 * A simple class to run the YND class.
 * @author Laurie White
 * @version April 2012
 */
public class YNDRunner
{

	/**
	 * Create a YND, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		YND ynd = new YND();
		
		System.out.println (ynd.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equalsIgnoreCase("Bye"))
		{
			System.out.println (ynd.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
