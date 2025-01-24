//*******************************************************
//    NHLPlayer.java          Author: Fiona Fung
//
//    provides info about nhl player
//*******************************************************

public class NHLPlayer
{
   // instance variables
   String name, position, city;
   int uniform;
   String dob;
   
   // constructor to set var
   public NHLPlayer(String name, int uniform, String position, String city, String dob)
   {
      this.name = name;
      this.uniform = uniform;
      this.position = position;
      this.city = city;
      this.dob = dob;
   }
   
   // get methods
   public String getName() { return name; }
   public int getUniform() { return uniform; }
   public String getPosition() { return position; }
   public String getCity() { return city; }
   public String getDoB() { return dob; }
   
   // set methods
   public void setName(String name) { this.name = name; }
   public void setUniform(int uniform) { this.uniform = uniform; }
   public void setPosition(String position) { this.position = position; }
   public void setCity(String city) { this.city = city; }
   public void setDoB(String dob) { this.dob = dob; }
   
   // toString
   public String toString()
   {
      String result = "";
      result += "name: " + name;
      result += "\nuniform #: " + uniform;
      result += "\nposition: " + position;
      result += "\ncity: " + city;
      result += "\ndate of birth: " + dob;
      return result;
   }
   
}