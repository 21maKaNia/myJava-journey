import java.util.Scanner;// Import the Scanner class
public class AgeTest{
    public static void main(String[] args) {
    Scanner date_of_birth = new Scanner(System.in); 
    System.out.println("Enter your date of birth (DD/MM/YYYY):"); 
    String inputDob = date_of_birth.nextLine();

	String[]parts = inputDob.split("/");
	String day = parts[0];
	String month = parts[1];
	String year= parts[2];
	int age = 2022 - Integer.parseInt(year);
	double ageSec = (double) (age * 31536000);
	double ageMilli = (double) (age * 31536000000d);
	System.out.println("You are " + age + " years old");
	System.out.println("You are " + ageSec + " seconds old");
	System.out.println("You are " + ageMilli + " milliseconds old");
  }
}