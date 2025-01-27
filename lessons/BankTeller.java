//*******************************************************************
//    BankTeller.java                  Author: Fiona Fung
//
//    provides information about a bank teller of a Branch 
//*******************************************************************

public class BankTeller
{
   // instance variable
   private String name;
   private String tellerID;
   
   // constuctor
   public BankTeller(String name, String tellerID)
   {
      this.name = name;
      this.tellerID = tellerID;
   }
   
   // get methods
   public String getName() { return name; }
   public String getTellerID() { return tellerID; }
   
   // set methods
   public void setName(String name) { this.name = name; }
   public void setTellerID(String tellerID) { this.tellerID = tellerID; }
   
   // toString
   public String toString()
   {
      String result = "";
      result += "\nteller name: " + name;
      result += "\nteller id: " + tellerID;
      return result;
   }

}  