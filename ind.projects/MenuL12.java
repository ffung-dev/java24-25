//****************************************************
// MenuL12.java            Author: Fiona Fung
//
// Takes food orders from user
// Includes: if/else, while, arrays, methods, parameters
//****************************************************

import java.util.*;

public class MenuL12 
{
   static void menuList (String dish, String price) { // parameters = variables in methods
      System.out.println(dish + " - $" + price);
   }
   
   static void menuMethod() 
   {
      // creates variables for menu items
      String[] main = {"pineapple bun", "buttered french toast", "fish 'n chips", "rice noodles"};
      String[] dessert = {"cinnamon roll", "macaron", "cupcake", "cheesecake"};
      String[] drinks = {"caramel latte", "hot chocolate", "peppermint tea", "cappuccino"};
      // a function that displays menu
      menuList(main[1], "3.50");
      
   }
   
   public static void main (String[] args)
   {
      menuMethod();
   }
   
}