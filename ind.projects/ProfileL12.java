//***********************************************
// ProfileL12.java      Author: Fiona Fung
//
// Make a profile using scanners, etc.
//***********************************************
 
import java.util.*; // imports classes in a particular package 
 
public class ProfileL12
{
  public static void main (String[] args)
  {
     System.out.println("(*u*)> Welcome~");
     
     String name, age, favColor, favAnimal, favFood, hobby;
     Scanner scan = new Scanner (System.in);
     
     System.out.print("What's your name?   ");
     name = scan.nextLine();
     System.out.println (". . .");
     
     System.out.print("How old are you?   ");
     age = scan.nextLine();
     System.out.println (". . .");
     
     System.out.print("What's your favorite color?   ");
     favColor = scan.nextLine();
     System.out.println (". . .");
     
     System.out.print("What's your favorite animal?   ");
     favAnimal = scan.nextLine();
     System.out.println (". . .");
     
     System.out.print("What's your favorite food?   ");
     favFood = scan.nextLine();
     System.out.println (". . .");
     
     System.out.print("What is your hobby?   ");
     hobby = scan.nextLine();
     System.out.println (". . .");
     
     scan.close();
     
     System.out.println ("\n---------------------------");
     System.out.println (name + " , " + age);
     System.out.println("favorite color: " + favColor);
     System.out.println("favorite animal: " + favAnimal);
     System.out.println("favorite food: " + favFood);
     System.out.println("hobby: " + hobby);
     
       
  
  }
}