//*******************************************************
//    NHLTeamDriver.java         Author: Fiona Fung
//
//    driver class for NHLTeam, NHLPlayer, Arena classes
//*******************************************************
//    public Arena(String name, String location, int capacity, int openSince)
//    public NHLTeam(String name, int years, String conference, String division, NHLPlayer player)
//    public NHLPlayer(String name, int uniform, String position, String city, String dob)

public class NHLTeamDriver
{
   public static void main(String[] args)
   {
      Arena arenaC = new Arena("ClueRink", "New Clue", 15600, 1999);
      NHLPlayer green = new NHLPlayer("Mr. Green", 58, "goalie", "Green Bay", "May 10, 2002");
      NHLTeam clue =  new NHLTeam("Clue Cobras", 8, "Eastern", "Atlantic", green);
      
      System.out.println(green.toString()); 
      System.out.println(arenaC.toString());
      System.out.println(clue.toString());
   }
}