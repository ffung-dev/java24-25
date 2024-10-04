//****************************************************
// MenuL12.java            Author: Fiona Fung
// created september 27, 2024
//
// Takes food orders from user
// Includes: if/else, while, arrays, methods, parameters
//****************************************************

import java.util.*;

public class MenuL12 
{
   static void menuList (String dish, double price) { // parameters = variables in methods
      System.out.println("   " + dish + " - $" + price);
   }
   
   static void menuMethod() 
   {
      // creates variables for menu items 
      String[] main = {"pineapple bun", "buttered french toast", "fish 'n chips", "rice noodles"};
      String[] dessert = {"cinnamon roll", "macaron", "cupcake", "cheesecake"};
      String[] drink = {"caramel latte", "hot chocolate", "peppermint tea", "cappuccino"};
      // a function that displays menu
      System.out.println(".  .  .  Menu  .  .  .");
      
      System.out.println("   main meals");
      menuList(main[0], 3.50);
      menuList(main[1], 4.50);
      menuList(main[2], 8.99);
      menuList(main[3], 7.99);

      System.out.println("\n   sweets");
      menuList(dessert[0], 2.59);
      menuList(dessert[1], 1.29);
      menuList(dessert[2], 2.30);
      menuList(dessert[3], 4.99);

      System.out.println("\n   sips");
      menuList(drink[0], 2.29);
      menuList(drink[1], 2.10);
      menuList(drink[2], 2.10);
   }  
   
   public static void main (String[] args)
   {
      Scanner input = new Scanner (System.in);
      double total, change;
      menuMethod();
   }
   
}