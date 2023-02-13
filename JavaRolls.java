import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int diceRoll;
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println("- If you roll a 6, the game stops.");
        System.out.println("- If you roll a 4, nothing happens.");
        System.out.println("- Otherwise, you get 1 point.\n");
        System.out.println(" You must collect at least 3 points to win. Enter anything to roll:");
      

        while (true) {
            diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll + ".\n");
           
            if (diceRoll == 6) {
                System.out.println("End of game");
                break;
            } else if (diceRoll == 4) {
                System.out.println("Zero points. Keep rolling.\n");
                continue;
            } else {
                score++;
                System.out.println("One point. Keep rolling.\n");
            }
            scan.nextLine();
        }//while

        if (score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :(");
        }

    }//main

    /**
     * Function name: rollDice
     * @return randomNumber (int)
     *
     * Inside the function:
     *  - return a random number between one and six. 
     */
    public static int rollDice() {
        int randomNumber = (int)(Math.random() * 6) + 1;
        return randomNumber;
    }

  
  
}
