import java.util.Scanner;// Import the Scanner class
public class DistanceInput{
    public static void main(String[] args) {
    Scanner distance_from_store = new Scanner(System.in); 
    System.out.println("How far is your favourite store from your home in km?"); 
    double km = distance_from_store.nextDouble();
    double miles = (double) (km * 0.621371);
    double meters = (double) (km * 1000.0);
    System.out.println("Distance in miles will be " + miles);
    System.out.println("Distance in meters will be " + meters);

  }
}
 