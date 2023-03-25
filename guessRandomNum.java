import java.util.*;

public class guessRandomNum {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber) {
                System.out.println("Wowww YOU GUESSED IT RIGHT!!");
            }
            else if (userNumber > myNumber) {
                System.out.println("Bummer...Your number is too large!");
            }
            else {
                System.out.println("Bummer...Your number is too small!");
            }
        }
        while (userNumber >= 0);

        System.out.println("My number was " + myNumber);
    }
}