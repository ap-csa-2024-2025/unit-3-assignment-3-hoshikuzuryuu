import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Problem 1");
    System.out.println("Enter the numerator (Make sure this is an integer and the resultant quotient is more than 1 and less than or equal to 8): ");
    int i1 = sc.nextInt();
    System.out.println("Enter the denominator (Make sure this is an integer and the resultant quotient is more than 1 and less than or equal to 8): ");
    int i2 = sc.nextInt();
    double q = (double)i1/i2;
    if(i2==0) 
    {
      System.out.println("Error-- you are dividing by 0.");
    }
    if( q > 1 && q<=8) 
    {
      System.out.println("Ratio OK");
    }
    else
    {
      System.out.println("Try again.");
    }
    sc.close();


    System.out.println("Problem 2");
    System.out.println("Enter an integer: ");
    int a = sc.nextInt();
    System.out.println("Enter an integer that is a factor of the integer you just put in: ");
    int b = sc.nextInt();
    if(b==0) 
    {
      System.out.println("Error-- you are dividing by 0.");
    }
    if(a%b == 0)
    {
      System.out.println("It's a factor");
    }
    else
    {
      System.out.print("Try again.");
    }


    System.out.println("Problem 3");


    
  }
  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first rectangle's length: ");
    r1.setLength(sc.nextDouble());
    System.out.println("Enter the first rectangle's width: ");
    r1.setWidth(sc.nextDouble());
    System.out.println("Enter the second rectangle's length: ");

    r2.setLength(sc.nextDouble());
    System.out.println("Enter the second rectangle's width: ");
    r2.setWidth(sc.nextDouble());
    sc.close();
    if (r1.getLength() == r2.getLength() && r1.getWidth() == r2.getWidth())
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
