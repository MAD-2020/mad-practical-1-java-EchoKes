import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Question5
{
  public static void main(String[] args)
  {
    ArrayList<Integer> listOfIntegers = new ArrayList<>();
    getInputs(listOfIntegers);
    System.out.println("\nThe mode for these set of values is " + deriveMode(listOfIntegers));
  }

  public static ArrayList<Integer> getInputs(ArrayList<Integer>integerList)   /*Method for obtaining integers*/
  {    
    System.out.print("Enter a number: ");     
    Scanner initial = new Scanner(System.in);
    int a = initial.nextInt();                          
    System.out.println("");

    for(int i=0; i<a; i++)
    {
      System.out.print("Enter an integer: ");
      Scanner input = new Scanner(System.in);
      Integer inputs = input.nextInt();
      integerList.add(inputs);
    } 
    return integerList;
  }   

  public static int deriveMode(ArrayList<Integer>integerList) /*Method for deriving mode*/
  {
    int l = integerList.size();
    int mode = -1;
    int maxCount = -1;

    for(int i=0; i<l; i++){
      int count = 0;

      for(int j=0; j<l; j++){
        if(integerList.get(i)==integerList.get(j)){
          count++;
        }        
      }
      if(count>maxCount){
        mode = integerList.get(i);
        maxCount = count;
      }
    }
    return mode;
  }  
}
