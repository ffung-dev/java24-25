//**************************************************************
//    PokemonDriver.java         Author: Fiona Fung
//
//    pokemon driver class (pair with Pokemon.java)
//**************************************************************
// add comment
public class PokemonDriver
{
   public static void main(String[] args)
   {  
      // make pokemon
      Pokemon empty = new Pokemon(); // default constructor
      Pokemon eevee = new Pokemon("Eevee"); // name constructor
      Pokemon cubachoo = new Pokemon("Cubachoo", 613, "ice", 100, 25); // using full constructor
            
      // print values
      System.out.println(empty);
      System.out.println("\n" + eevee);
      System.out.println("\n" + cubachoo + "\n");
      
      // using mutator methods
      empty.setType("none");
      eevee.setNumber(133);
      eevee.setLevel(2);
      eevee.setHealth(-3);

      // using other methods
      cubachoo.levelUp();
      boolean eeveeFaint = eevee.hasFainted();

      System.out.println(cubachoo + "\n\t" + cubachoo.speak() + "\n");
      System.out.println(eevee);
      System.out.println("\teevee has fainted: " + eeveeFaint);
   }
}