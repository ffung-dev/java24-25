//******************************************************************
//    StudentInfo.java              Author: Fiona Fung
//
//    standalone class for students
//    tested in StudentInfoDriver.java
//******************************************************************

public class StudentInfo
{
   private String name;
   private int age;
   private double gpa;
   private boolean honors;
   private char gender;
   private String id;
   
   // default constructor
   public StudentInfo()
   {
      name = "";
      age = 0;
      gpa = 0;
      honors = false; 
      gender = ' ';
      id = "";
   }
   
   // constructor to create new
   public StudentInfo(String name, int age, double gpa, boolean honors, char gender, String id)
   {
      this.name = name;
      this.age = age;
      this.gpa = gpa;
      this.honors = honors;
      this.gender = gender;
      this.id = id;
   }
   
   // get methods to retrieve values
   public String getName() { return name; }
   public int getAge() { return age; }
   public double getGPA() { return gpa; }
   public boolean getHonors() { return honors; }
   public char getGender() { return gender; }
   public String getID() { return id; }
   
   // mutator methods to set values
   public void setName(String name) { this.name = name; }
   public void setAge(int age) { this.age = age; }
   public void setGPA(double gpa) { this.gpa = gpa; }
   public void setHonors(boolean honors) { this.honors = honors; }
   public void setGender(char gender) { this.gender = gender; }
   public void setID(String id) { this.id = id; }
   
   // toString method
   public String toString()
   {
      String result = "";
      result += "student name: " + name;
      result += "\ngender: " + gender;
      result += "\nstudent id: " + id;
      result += "\nage: " + age;
      result += "\ngpa: " + gpa;
      result += "\nin honors: " + honors;
      return result;
   }
   
   // failing method: if gpa = 0 then failing = true
   public boolean failing()
   {
      boolean failing;
      if (gpa == 0)
      {
         failing = true;
      } else {
         failing = false;
      }
      return failing;
   }
   
   public String has$3CR3T()
   {
      String psst = "";
      if (name == "scarlett red")
      {
         psst += name + " has a secret";
      } else {
         psst += name + " has no suspicious activity";
      }
      return psst;
   }
}