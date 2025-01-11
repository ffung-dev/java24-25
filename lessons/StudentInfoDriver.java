//******************************************************************
//    StudentInfoDriver.java              Author: Fiona Fung
//
//    driver class for student tracking
//    standalone class:StudentInfo.java
//******************************************************************

public class StudentInfoDriver
{
   public static void main(String[] args)
   {
      // create new students
      StudentInfo empty = new StudentInfo();
      StudentInfo scarlett = new StudentInfo("scarlett red", 17, 3.9, true, 'F', "3000R1227");
      StudentInfo white = new StudentInfo("blanche white", 18, 0.0, false, 'F', "3000W6622");
      StudentInfo peacock = new StudentInfo("miss peacock", 17, 3.5, false, 'F', "3000B2942");
      
      // testing StudentInfo
      System.out.println(empty.toString() + "\n");
      empty.setID("3000XXXX");
      System.out.println(empty.toString() + "\n");
      
      peacock.setHonors(true);
      System.out.println(white.toString() + "\nfailing: " + white.failing() + "\n");
      System.out.println(peacock.toString() + "\nfailing: " + peacock.failing() + "\n");
      System.out.println(peacock.has$3CR3T() + "\n");
      System.out.println(scarlett.toString() + "\n");
      System.out.println(scarlett.has$3CR3T());
   }
}