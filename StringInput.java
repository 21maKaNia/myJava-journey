import java.util.Scanner;  // Import the Scanner class
public class StringInput{
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter full name");

    String fullName = myObj.nextLine();  
    System.out.println("Hello " + fullName);  
  }
}