import java.util.Scanner;// Import the Scanner class
public class ChallengeInput{
    public static void main(String[] args) {
    Scanner Input1 = new Scanner(System.in); 

    System.out.println("What is your name?"); 
    String name = Input1.nextLine();
    
    System.out.println("What is your surname?");
    String surname = Input1.nextLine();

    System.out.println("Enter your date of birth (DD/MM/YYYY):"); 
    String date_of_birth = Input1.nextLine();

    System.out.println("How far is your favourite store from your home?");
    double distance_from_store = Input1.nextDouble();
    

    System.out.println("Hi "+ name + " " + surname);

	String[]parts = date_of_birth.split("/");
	String day = parts[0];
	String month = parts[1];
	String year= parts[2];
	int age = 2022 - Integer.parseInt(year);
    System.out.println("You are " + age + " years old");

    double km = distance_from_store;
    double miles = (double) (km * 0.621371);
    double meters = (double) (km * 1000.0);
    System.out.println("Distance in miles will be " + miles);
    System.out.println("Distance in meters will be " + meters);

        double ageSec = (double) (age * 31536000);
        double ageMilli = (double) (age * 31536000000d);
	System.out.println("You are " + age + " years old");
	System.out.println("You are " + ageSec + " seconds old");
	System.out.println("You are " + ageMilli + " milliseconds old");

  }
}
