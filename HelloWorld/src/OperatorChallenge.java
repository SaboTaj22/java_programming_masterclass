public class OperatorChallenge {
    public static void main(String[] args) {
        double varVal = 20.00d;
        double varVal2 = 80.00d;
        double sum = ((varVal + varVal2)*100.00d);
        System.out.println("My sum of values = " + sum);
        double remainder = sum % 40.00d;
        System.out.println("My sum remainder = " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
