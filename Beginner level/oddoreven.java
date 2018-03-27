/* package whatever; // don't place package name! */
import java.util.Scanner;
 
class Ideone
{
   public static void main(String args[])
   {
      int x;
      System.out.println("Enter an integer to check if it is odd or even ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
    if(x<100000)
    {
 
      if ( x % 2 == 0 )
         System.out.println("You entered an even number.");
      else
         System.out.println("You entered an odd number.");
    }
   else
   {
    System.out.println("More than 1 lakh");
   }
}
}
