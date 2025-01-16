//**********************************************************************************************
//    GNSStudent.java         Author: Fiona Fung
//
//    represents a gns student: use with Address.java, GNSStudentDriver.java
//**********************************************************************************************

public class GNSStudent
{
   // instance variables
   private String name;
   private String address;
   private String id;
   private double average;
   private int points;
   
   // default constructor
   public GNSStudent()
   {
      name = "";
      address = "";
      id = "3000XXXXX";
      average= 0;
      points = 0;
   }
   
   // set constructor
   public GNSStudent(String name, Address address, String id, double average)
   {
      this.name = name;
      this.address = address.toString();
      this.id = id;
      this.average = average; 
      this.points = qualityPoint((int)average);
   }
      
   // accessor methods
   public String getName() { return name; }
   public String getAddress() { return address.toString(); }
   public String getID() { return id; }
   public double getAverage() { return average; }
   public int getPoints() { return points; }
   
   // average: student average (scheme 1)
   public double average(double inClass1, double inClass2, double inClass3, double inClass4, double finalExam, double hw)
   {
      double exams = (inClass1 + inClass2 + inClass3 + inClass4 + (finalExam * 2))/6;
      double average = (exams * 0.8) + (hw * 0.2);
      return average;
   } 
   
   // average: student average (scheme 2)
   public double average(double inClass1, double inClass2, double inClass3, double finalExam, double projects, double hw, boolean extra) // "extra" added to have overloaded method
   {
      double exams = (inClass1 + inClass2 + inClass3 + (finalExam * 2))/5;
      double average = (exams * 0.5) + (projects * 0.3) + (hw * 0.2);
      return average;
   }
   
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
   
   // mutator methods
   public void setName(String name) { this.name = name; }
   public void setAddress(Address address) { this.address = address.toString(); }
   public void setID(String id) { this.id = id; }
   public void setAverage(double average) { this.average = average; } // force-change average
   public void setQualityPoint(int points) { this.points = points; } // force-change points
   
   // toString
   public String toString()
   {
      String result = "";
      result += "student name: " + name;
      result += "\naddress: " + address;
      result += "\nID: " + id;
      result += "\naverage: " + average;
      result += "\nquality points: " + qualityPoint((int)average);
      return result;
   }
}