public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Hell No World");

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the top score!");
        }

        int SecondTopScore = 81;
        if ((topScore > SecondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (SecondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
    }
}
