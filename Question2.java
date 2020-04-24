import java.util.Scanner;
import java.text.DecimalFormat;

public class Question2
{
  public static DecimalFormat dp2 = new DecimalFormat("#.##");
  public static void main(String[] args)
  {     
    System.out.print("height in meters: ");  
    Scanner h = new Scanner(System.in);
    double height = h.nextDouble();
    
    System.out.print("Enter weight in kilograms: ");  
    Scanner w = new Scanner(System.in);
    double weight = w.nextDouble();
    
    double bmi = weight/(height*height);
    String s = "Your Body Mass Index is " + dp2.format(bmi);
    System.out.println(s);      
  }
}
