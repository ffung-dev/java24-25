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
   private static int count = 0;
   
   // constuctor
   public BankTeller(String name, String tellerID)
   {
      this.name = name;
      this.tellerID = tellerID;
      count++;
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
   
   // get balance of a customer account (class)
   public double getBal(CustomerAccount account)
   {
      return account.getBal();
   }
   
   // deposit to customer account
   public void deposit(double amount, CustomerAccount account)
   {
      account.setBal(account.getBal() + amount);
   }
   
   // withdraw from customer account
   public void withdraw(double amount, CustomerAccount account)
   {
      account.setBal(account.getBal() - amount);
   }
   
   public static int getCount()
   {
      return count;
   }
}  