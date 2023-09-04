public class while_do_statements {

    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++); {
//            System.out.println(i);
//        }

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        int x = 1; // do while used for passwords. keep asking up until a certain amount of times
        boolean isReady = false;
        do {
            if (x > 5) {
                break;
            }
            System.out.println(x);
            x++;
        } while (isReady);

        // continue statement. Allows you to ignore certain things in an iteration and keep going
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
