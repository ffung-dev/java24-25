//**********************************************************************************************
//    GNSStudentDriver.java         Author: Fiona Fung
//
//    represents a gns student: use with Address.java, GNSStudent.java
//**********************************************************************************************

public class GNSStudentDriver
{
// Address(String streetAddress, String city, String state, int zip)
// GNSStudent(String name, Address address, String id, int average)
// scheme 1 : average(double inClass1, double inClass2, double inClass3, double inClass4, double finalExam, double hw)
// scheme 2 : average(double inClass1, double inClass2, double inClass3, double finalExam, double projects, double hw, boolean extra)
   public static void main(String[] args)
   {
      // create new students
      GNSStudent empty = new GNSStudent();
      
      Address scarlettAddress = new Address("8 Mansion Avenue", "Green Bay", "New Clue", 7620);
      GNSStudent scarlett = new GNSStudent("Scarlett Red", scarlettAddress, "30000XOXO", 0);
      scarlett.setAverage(scarlett.average(100, 97, 100, 99, 97.5, 100));
      
      System.out.println(empty.toString());
      System.out.println(scarlett.toString());
     
   }
}