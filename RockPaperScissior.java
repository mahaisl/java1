package games;

import java.util.Scanner;

public class RockPaperScissior {

    Player player;
    int datorVal = Fist.datorVal();




    RockPaperScissior(String playerName, int playerScore) {
        player = new Player(playerName, playerScore);
        System.out.println("Välkommen till sten, sax, påse, spelet\n välj ett av alternativen\n ");
    }


    public static void main(String[] args) {
        RockPaperScissior game=new RockPaperScissior("Mahmuda",0);
        game.playGame();

    }
    int aiScore;
    int score;

    void playGame() {

        for (int i = 1; i < 4; i++) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Sten(1), Sax(2) eller Påse(3)?");
            int playerChoice = scanner.nextInt();



            if (playerChoice == datorVal) {
                System.out.println("Ni valde samma. Oavgjort!!");
            }


            if (playerChoice == 2 & datorVal == 1) {
                System.out.println("Du tog sax. Datorn tog sten. Du förlorade!");
                aiScore += +1;
            }
            if (playerChoice == 3 & datorVal == 1) {
                System.out.println("Du tog påse. Datorn tog sten. Du vann!");
                score += +1;
            }


            if (playerChoice == 1 & datorVal == 2) {
                System.out.println("Du tog sten. Datorn tog sax. Du vann!");
                score += +1;

            }
            if (playerChoice == 3 & datorVal == 2) {
                System.out.println("Du tog påse. Datorn tog sten. Du vann!");
                score += +1;
            }


            if (playerChoice == 1 & datorVal == 3) {
                System.out.println("Du tog sten. Datorn tog påse. Du Förlorade!");
                aiScore += +1;
            }
            if (playerChoice == 2 & datorVal == 3) {
                System.out.println("Du tog sax. Datorn tog påse. du vann!");
                score += +1;
            }



        }System.out.println("****************************************\n du fick  " + score+ " poäng, datorn fick " + aiScore + " poäng\n****************************************");

    }


}



