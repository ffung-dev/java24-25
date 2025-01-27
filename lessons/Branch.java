//****************************************************
//    Branch.java             Author: Fiona Fung
//
//    describes a Bank branch
//****************************************************

public class Branch
{
   // instance variables
   String name;
   String address;
   int phone;
   BankTeller teller;
   
   // constructor
   public Branch(String name, String address, int phone, BankTeller teller)
   {
      this.name = name;
      this.address = address;
      this.phone = phone;
      this.teller = teller;
   }
   
   // get methods
   public String getAddress() { return address; }
   public int getPhone() { return phone; }
   public BankTeller getTeller() { return teller; }
   public String getName() { return name; }

   // set methods
   public void setAddress(String address) { this.address = address; }
   public void setPhone(int phone) { this.phone = phone; }
   public void setTeller(BankTeller teller) { this.teller = teller; }
   public void setName(String name) { this.name = name; }
   
   // toString
   public String toString()
   {
      String result = "";
      result += "\nbranch address: " + address;
      result += "\nphone: " + phone;
      result += "\nteller: " + teller.toString();
      return result;
   }
}