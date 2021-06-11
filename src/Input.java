import java.util.Scanner;


    public class Input {
        private Scanner scanner;

        public Input() {
            this.scanner = new Scanner(System.in);
        }

        public String getString() {
           /* System.out.println("Please enter a sentence.");
            String userSentence = scanner.nextLine();
            System.out.println("Your sentence is: " + userSentence);
            return userSentence;*/

            return this.scanner.nextLine();
        }



        public boolean yesNo() {
        /*System.out.println("Please enter yes or no.");
        String userYesOrNo = scanner.nextLine();
        boolean result = false;
        if (userYesOrNo.equalsIgnoreCase("yes")) {
            result = true;
        } else if (userYesOrNo.equalsIgnoreCase("no")) {
            result = false;
        }
        System.out.println("Your boolean is:" + result);
        return result;*/
            //Jay's solution below:
            String userInput = this.scanner.nextLine();
            return userInput.trim().equalsIgnoreCase("y") || userInput.trim().equalsIgnoreCase("yes");

        }

        public int getInt(int min, int max) {
            System.out.printf("Give me a number between %d and %d:\n", min, max);
            int userNumber = scanner.nextInt();

            if ((userNumber >= min) || (userNumber <= max)) {
                return userNumber;
            } else {
                System.out.println("That number is invalid.");
                return getInt(min, max);
            }
        }

        public int getInt(){
            return this.scanner.nextInt();
        }
        @SuppressWarnings("all")
        //edit for exception errors
        //Jay's solution
        public int getInt(String prompt){
            System.out.println("\n");
            try{
                return Integer.valueOf(getString());
            } catch(NumberFormatException e){
                System.out.println("That is not a valid number");
                return getInt("Please enter a valid number");
            }
        }

        public double getDouble() {
            return this.scanner.nextDouble();
        }



        public double getDouble(double min, double max) {
            System.out.printf("Enter a number with a decimal between %f and %f:%n", min, max);
            double userInputNum = scanner.nextDouble();
            if (userInputNum >= min || userInputNum <= max) {
                return userInputNum;
            } else {
                System.out.println("That number is invalid.");
                return getDouble(min, max);
            }


        }}
