import java.util.Scanner;


public class LeapYear {
   public static boolean isLeapYear(int year) {
      if(year%400==0||year%4==0) {
         return true;
      }
      else {
         return false;      
      }
   }
   
   public static void main(String[] args) {
      int input;
      Scanner scanner = new Scanner(System.in);
      input = scanner.nextInt();
      if(isLeapYear(input)) {
         System.out.println(input + " is a leap year.");
      }
      else {
         System.out.println(input + " is not a leap year.");
      }
   }
}