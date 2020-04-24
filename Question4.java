import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    System.out.print("Enter an integer: ");    
    Scanner in = new Scanner(System.in);
    Integer i = in.nextInt();

    for(int j=0; j<i; j++)
    {            
      for (int h=0; h<(i-j); h++)
      {
        System.out.print("*");
      } 
      System.out.println("");
    } 
  }
}
