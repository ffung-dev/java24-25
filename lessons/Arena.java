//********************************************************
//    Arena.java           Author: Fiona Fung
//
//    information about team arena
//********************************************************

public class Arena
{
   // instance variables
   String name;
   String location;
   int capacity;
   int openSince;

   // constructor   
   public Arena(String name, String location, int capacity, int openSince)
   {  
      this.name = name;
      this.location = location;
      this.capacity = capacity;
      this.openSince = openSince;
   }
   
   // get methods
   public String getName() { return name; }
   public String getLocation() { return location; }
   public int getCapacity() { return capacity; }
   public int getOpenSince() { return openSince; }
   
   // set methods
   public void setName(String name) { this.name = name; }
   public void setLocation(String location) { this.location = location; }
   public void setCapacity(int capacity) { this.capacity = capacity; }
   public void setOpenSince(int openSince) { this.openSince = openSince; }
   
   // toString method
   public String toString()
   {
      String result = "";
      result += "arena name: " + name;
      result += "\nlocation: " + location;
      result += "\ncapacity: " + capacity;
      result += "\nopen since: " + openSince;
      return result;
   }
}