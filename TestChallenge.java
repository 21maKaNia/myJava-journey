import java.util.Scanner;// Import the Scanner class
public class TestChallenge{
    public static void main(String[] args) {
    Scanner Input1 = new Scanner(System.in); 

    System.out.println("What is your name?"); 
    String name = Input1.nextLine();
    
    System.out.println("What is your surname?");
    String surname = Input1.nextLine();

    System.out.println("Enter your date of birth (DD/MM/YYYY):"); 
    String date_of_birth = Input1.nextLine();

    System.out.println("How far is your favourite store from your home?");
    String distance_from_store = Input1.nextLine();

    System.out.println("Hi "+ name + " " + surname);
  }
}
