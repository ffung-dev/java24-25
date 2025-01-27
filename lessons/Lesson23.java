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
        

    }
}
