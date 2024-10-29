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
      System.out.println("Try again.");
    }


    System.out.println("Problem 3");
    System.out.println("Enter an integer in the fifties: ");
    int f = sc.nextInt();
    if (f >= 50 && f <= 59)
    {
      System.out.println("Your number is " + f);
    }
    else
    {
      f = 55;
      System.out.println("That's not in the fifties!");
      System.out.println("Your number is " + f);
    }
    

    System.out.println("Problem 4");
    System.out.println("Enter an integer that is not less than or equal to 2: ");
    int x = sc.nextInt();
    System.out.println("Enter an integer that is not greater than 9, optional if the last one fulfilled the prerequisites (AND make sure the product of this integer and the last is greater than 10): ");
    int y = sc.nextInt();
    if (x > 2 || (y < 9 && (x*y)>10))
    {
      System.out.println("pass");
    }
    else
    {
      System.out.println("Try again!");
    }
    sc.close();
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
