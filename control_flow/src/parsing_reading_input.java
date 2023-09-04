public class parsing_reading_input {
    // Parsing is basically converting data types to usable form that you need them to be for the program.
    public static void main(String[] args) {

        int currentYear = 2022;
        String usersDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
        System.out.println("Age = " + (currentYear - dateOfBirth));
    }
}
