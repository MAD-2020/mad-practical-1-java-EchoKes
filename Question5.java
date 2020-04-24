import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Main
{
  public static void main(String[] args)
  {
    ArrayList<Integer> listOfIntegers = new ArrayList<>();
    getInputs(listOfIntegers);
    System.out.println("The mode for these set of values is " + deriveMode(sortedNumbers(listOfIntegers)));
  }

  public static ArrayList<Integer> getInputs(ArrayList<Integer>integerList)   /*Method for obtaining integers*/
  {    
    System.out.print("Enter a number: "); 
    Scanner initial = new Scanner(System.in);
    int a = initial.nextInt();                            /*INCOMPLETE WORK PLS DON MARK :(*/

    for(int i=0; i<a; i++)
    {
      System.out.print("Enter an integer: ");
      Scanner input = new Scanner(System.in);
      Integer inputs = input.nextInt();
      integerList.add(inputs);
    } 
    return integerList;
  }   
     
  public static ArrayList<Integer> sortedNumbers(ArrayList<Integer>integerList) /*Method for sorting integer list*/
  {
    Collections.sort(integerList);
    return integerList;
  }

  public static int deriveMode(ArrayList<Integer>integerList) /*Method for deriving mode*/
  {
    int length = integerList.size();
    int cP = 0;
    int mode = 0;
    int currentPos = integerList.get(cP);
    int currentCount = 1;
    int prevCount = 0;
    for(int i=0; i<length; i++)
    {
      if(currentPos == integerList.get(cP+1)){
        currentCount += 1;          
      }
      else{
        prevCount = currentCount;
        currentCount = 1;        
      }
      cP+=1;      
    }
    if(prevCount>=currentCount){
      mode = integerList.get(prevCount-1);
    }
    else{
      mode = integerList.get(prevCount+1);
    }
    return mode;
  }
  
}
