import java.util.Scanner;
import java.util.Random;

public class Magic8Ball 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        input.close();
    }

    public String answer(int choice)
    {
        String answer = "";
        switch(choice) {
            case 1:
                answer = "it is certain";
                break;

            case 2:
                answer = "it is decidedly so";
                break;
            
            case 3:
                answer = "without a doubt";
                break;
            
            case 4:
                answer = "definitely";
                break; 

            case 5:
                answer = "you may rely on it";
                break;

            case 6:
                answer = "as i see it, yes";
                break;

            case 7:
                answer = "most likely";
                break;

            case 8:
                answer = "outlook good";
                break;

            case 9:
                answer = "yes";
                break;
            
            case 10:
                answer = "signs point to yes";
                break;

            case 11:
                answer = "reply hazy, try again";
                break;

            case 12:
                answer = "ask again later";
                break;
            
            case 13:
                answer = "better not tell you now";
                break;
            
            case 14:
                answer = "cannot predict now";
                break;

            case 15:
                answer = "concentrate and ask again";
                break;
            
            case 16:
                answer = "don't count on it";
                break;
    
            case 17:
                answer = "my reply is no";
                break;
            
            case 18:
                answer = "my sources say no";
                break;
        
            case 19:
                answer = "outlook not so good";
                break;
    
            case 20:
                answer = "very doubtful";
                break;
        }
        return answer;
    }
}
