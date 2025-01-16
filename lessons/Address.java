//**********************************************************************************************
//    Address.java         Author: Fiona Fung
//
//    used to create address 
//**************************************************************

public class Address
{
   // instance variables
   private String streetAddress;
   private String city;
   private String state;
   private int zip;
   
   // default constructor
   public Address()
   {
      streetAddress = "";
      city = "";
      state = "";
      zip = 0;
   }
   
   // set constructor
   public Address(String streetAddress, String city, String state, int zip)
   {
      this.streetAddress = streetAddress;
      this.city = city;
      this.state = state;
      this.zip = zip;
   }
   
   // accessor methods
   public String getStreetAddress() { return streetAddress; }
   public String getCity() { return city; }
   public String getState() { return state; } 
   public int getZip() { return zip; }
   
   // mutator methods
   public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }
   public void setCity(String city) { this.city = city; }
   public void setState(String state) { this.state = state; }
   public void setZip(int zip) { this.zip = zip; }
   
   // toString
   public String toString()
   {
      String full = "";
      full += streetAddress;
      full += ", " + city;
      full += ", " + state;
      full += " " + zip;
      return full;
   }
   
   
   

}