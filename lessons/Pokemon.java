//**************************************************************
//    Pokemon.java         Author: Fiona Fung
//
//    pokemon standalone class (pair with PokemonDriver.java)
//**************************************************************

public class Pokemon
{
   // instance variables: present in all pokemon
   private String name;
   private int number;
   private String type;
   private int health;
   private int level;
   
   // default constructor
   public Pokemon()
   {
      name = "";
      number = 0;
      type = "";
      health = 0;
      level = 0;
   }  
   
   // set constructor (name)
   public Pokemon(String myName)
   {
      name = myName;
      number = 0;
      type = "";
      health = 0;
      level = 0;

   }
   
   // set constructor (all)
   public Pokemon(String name, int number, String type, int health, int level)
   {
      this.name = name;
      this.number = number;
      this.type = type;
      this.health = health;
      this.level = level;  
   }
   
   // accessor methods
   public String getName() { return name; }
   public int getNumber() { return number; }
   public String getType() { return type; }
   public int getHealth() { return health; }
   public int getLevel() { return level; }

   // mutator methods
   public void setName(String name) { this.name = name; }
   public void setNumber(int number) { this.number = number; }
   public void setType(String type) { this.type = type; }
   public void setHealth(int health) { this.health = health; }
   public void setLevel (int level) { this.level = level; }
   
   // other methods
   
   // toString method: displays variables of an object
   public String toString()
   {
      String result = "\tpokemon name: " + name;
      result += "\n\tnumber: " + number;
      result += "\n\ttype: " + type;
      result += "\n\thealth: " + health;
      result += "\n\tlevel: " + level;
      
      return result;
   }
   
   // levelUp: level + 1
   public void levelUp() { level++; }
   
   // hasFainted: true if health <= 0
   public boolean hasFainted()
   {
      if (health <= 0)
      {
         return true;
      } else {
         return false;
      }
   }
   
   // speak: pokemon says its name twice
   public String speak()
   {
      String dialogue = name + " " + name;
      return dialogue;
   }
   

}