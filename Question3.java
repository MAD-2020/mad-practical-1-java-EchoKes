import java.util.Scanner;

public class Question3
{
  public static String concat(String s1, Integer s2)
  {
    return new StringBuilder(s1).append(s2).toString();
  }
  public static void main(String[] args)
  {
    System.out.print("Enter an integer bro: ");    
    Scanner digit = new Scanner(System.in);
    int i = digit.nextInt();
    int multiplication = i*i;
    String result = concat("The result is ",multiplication);
    System.out.println(result);    
  }
}
