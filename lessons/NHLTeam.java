//*******************************************************
//    NHLTeam.java         Author: Fiona Fung
//
//    provides info about nhl team 
//*******************************************************

public class NHLTeam
{
   // instance variables
   String name, conference, division;
   int years;
   NHLPlayer player;
   // conference: western/eastern
   // division based on conference
   
   // constructor to set all parameters
   public NHLTeam(String name, int years, String conference, String division, NHLPlayer player)
   {
      this.name = name;
      this.years = years;
      this.conference = conference;
      this.division = division;
      this.player = player;
   }
   
   // get methods
   public String getName() { return name; }
   public int getYears() { return years; }
   public String getConference() { return conference; }
   public String getDivision() { return division; }
   public String getPlayer() { return player.getName(); }
   
   // set methods
   public void setName(String name) { this.name = name; }
   public void setYears(int years) { this.years = years; }
   public void setConference(String conference) { this.conference = conference; }
   public void setDivision(String division) { this.division = division; }
   public void setPlayer (NHLPlayer player) { this.player = player; }
   
   // toString method
   public String toString()
   {
      String result = "";
      result += "team name: " + name;
      result += "\nyears in existence: " + years;
      result += "\nconference: " + conference;
      result += "\ndivision: " + division;
      result += "\nplayer: " + player.name;
      return result;
   }
}