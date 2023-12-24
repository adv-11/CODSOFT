package codsoft;
import java.util.*;

public class Task1RandomNoGame {
	
	public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Random Number is between 1 and 20");
        System.out.println("");
        System.out.println("You Have 10 Guesses ! Enter your Number and press enter to Guess : ");
        
        
        int userNumber = 0;
        
        for(int i = 0 ; i < 10 ; i++) {
        	userNumber = sc.nextInt();
        	
        	if (userNumber == randomNumber) {
        		System.out.println("YOU GUESSED CORRECT !!!!");
        		System.out.println("");
        		System.out.println("YOUR SCSORE : " + (10-i)+"/10");
        		break;
        	}
        	else {
        		if(userNumber > randomNumber) {
        			System.out.println("Your guess is higher than random number ..." + (10-i) + " tries left !");
        		}
        		else {
        			System.out.println("Your guess is lower than random number ..." + (10-i) + " tries left !");
        		}
        	}
        }
    }
     
}
