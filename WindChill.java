import java.util.Scanner; // Scanner class
public class WindChill {

	public static void main(String[] args) 
	{	
		String name="Hieu Tran";
		double  t, // T is the temperature in degrees F. 
				v; // V is the Wind Speed in MPH.
		final double WIND_CHILL; // Wind chill temperature in degrees Fahrenheit.
		
		// Create a Scanner object to read input
		Scanner userInput = new Scanner(System.in);
		
		// display the header
		System.out.println("Wind Chill Calculator");
		
		// Ask the user for the temperature in degrees F
		System.out.println("Please, enter a number in degrees F:");
		t = userInput.nextDouble();
		
		// Ask the user for the wind speed
		System.out.println("Please, enter a number for wind speed:");
		v = userInput.nextDouble();
		
		// Calculation for Wind Chill index
		WIND_CHILL= 35.74 + 0.6215 * t - 35.75 * Math.pow(v,0.16) + 0.4275 * t * Math.pow(v,0.16);
		
		if (t >= -45 && t <= 40 && v >= 5 && v <= 60) 
		{
			System.out.println("Wind chill temperate: " + WIND_CHILL);
		}
		else 
		{
			System.out.println("The number of temperature in degrees F should be greater than or equal to -45,"
				+ "but less than or equal to 40");
			System.out.println("The number of wind speeds should be greater than or equal to 5,"
					+"but less than or equal to 60\nPlease try again!");
		}
		
		System.out.println("Programmer Name: "+name);
		
		userInput.close();
		
		
		
	}

}