import javax.swing.*;

public class methodChallenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Neal", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bill", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Jill", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Phil", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Will", highScorePosition);
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position"
                + highScorePosition + " on the high score list");

    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
            return 4;
    }
}
