//*************************************************** 
//    Lesson23.java        Author: Fiona Fung
//
// tests Bank, BankTeller, CustomerAccount, Branch
//***************************************************
public class Lesson23 
{
    public static void main(String[]args)
    {
        BankTeller green = new BankTeller("Mr. Green", "5D3AL0388");
        Branch newClue = new Branch("Green Bay", "Green Bay", 3001000, green);
        Bank clue = new Bank("Clue Bank", newClue);
        CustomerAccount scarlett = new CustomerAccount("Scarlett Red", 600600, 555, 1000, null);
        
        System.out.println(clue.toString());
        System.out.println(newClue.toString());
        System.out.println(green.toString());
        System.out.println(scarlett.toString());
        clue.hackAlarm();
        System.out.println(clue.rob("scarlett red"));
        
        // lesson 24 - testing (BankTeller.java)
        System.out.println(green.getBal(scarlett));
        green.deposit(600.60, scarlett);
        System.out.println(green.getBal(scarlett));
        
        // lesson 25 - testing (BankTeller.java)
        System.out.println(BankTeller.getCount());
        BankTeller plum = new BankTeller("Dr. Plum", "PROF0000");
        Branch oldClue = new Branch ("Mansion Bank", "Mansion Blvd", 9002000, plum);
        oldClue.setAddress("30 Mansion Blvd");
        System.out.println(Branch.getCount());

    }
}