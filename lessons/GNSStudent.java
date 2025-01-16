//**********************************************************************************************
//    GNSStudent.java         Author: Fiona Fung
//
//    represents a gns student: use with Address.java, Average.java, GNSStudentDriver.java
//**********************************************************************************************

public class GNSStudent
{
   // instance variables
   private String name;
   private Address address;
   private String id;
   private int average;
   private int points;
   
   // default constructor
   public GNSStudent()
   {
      name = "";
      address = null;
      id = "3000XXXXX";
      average= 0;
      points = 0;
   }
   
   // set constructor
   public GNSStudent(String name, Address address, String id, int average)
   {
      this.name = name;
      this.address = address;
      this.id = id;
      this.average = average; 
      this.points = qualityPoint(average);
   }
      
   // accessor methods
   public String getName() { return name; }
   public Address getAddress() { return address.toString; }
   public String getID() { return id; }
   public int getAverage() { return average; }
   
   // qualityPoint : returns quality point based on average
   public int qualityPoint(int average)
   {
      int qualityPoint;
      if (average >= 90 && average <= 100)
      {
         qualityPoint = 4;
      } else if (average >= 80 && average <= 89) {
         qualityPoint = 3;
      } else if (average >= 70 && average <= 79) {
         qualityPoint = 2;
      } else if (average >= 65 && average <= 69) {
         qualityPoint = 1;
      } else if (average <= 65 && average >= 0) {
         qualityPoint = 0;
      } else {
         System.out.println("error: average must be > 0 and < 100");
         qualityPoint = 0; 
      }
      return qualityPoint;
   }

}