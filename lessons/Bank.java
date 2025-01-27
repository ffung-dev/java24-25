//****************************************************
//    Bank.java             Author: Fiona Fung
//
//    describes a Bank 
//****************************************************

public class Bank
{
   // instance variables
   private String name; 
   private Branch branch;
   private boolean security;
   
   // constructor
   public Bank(String name, Branch branch)
   {
      this.name = name;
      this.branch = branch;
   }

   // get methods
   public String getName() { return name; }
   public Branch getBranch() { return branch; }

   // set methods
   public void setName(String name) { this.name = name; }
   public void setBRanch(Branch branch) { this.branch = branch; }

   // toString method
   public String toString()
   {
        String result = "";
        result += "\nbank name: " + name;
        result += "\nbank branch: " + branch.getName();
        return result;
   }

   public void hackAlarm() { security = false; }
   public String rob(String team) 
   {
        String result = "";
        if (security) 
        {
            result = team + " has successfully robbed " + name;
        } else {
            result = team + " has unsuccessfully robbed " + name + " and got arrested :(";
        }
        return result;
   }
}

