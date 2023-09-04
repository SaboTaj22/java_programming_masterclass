public class for_statement {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        //System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        for (double rate = 2.0; rate <= 5.0; rate++) {
            // for (position where loop starts; how far it should loop "end of loop"; incrementation rate)
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }
        for (double i = 7.5; i <= 10; i += .25) {
            double interestAmount = calculateInterest(100.0, i);
            if (interestAmount > 8.5) { // Break statement used to break out of loop before it evaluates to false
                break;
            }
            System.out.println("$100 at " + i + "% interest = " + interestAmount);
        }
    }
        public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
