class Zajecia {
    public static void main(String[] args) {
        String x = "hello world";
        System.out.println(x);

        enum Colors {
            RED,
            GREEN,
            BLUE,
        }

        Colors myFavColor = Colors.BLUE;

        runAllExercises();

    }

    /**
     * Runs all exercises methods.
     */
    private static void runAllExercises() {

        calculations();

        System.out.println(averageOfNumbers(new int [] { 1,3, 4 }));

        System.out.println(isEven(10));

        System.out.println(calcBMI(1.85, 75));

        System.out.println(calcGrade(new int [] { 1,3, 4 }));

        System.out.println(isPalindrome("kajak"));
    }

    private static void calculations() {
        System.out.println(2 + 4);
        System.out.println(8 - 3);
        System.out.println(9 * 2);
        System.out.println(11 / 2);
    }

    /**
     * Calculates average of the passed numbers,
     * @param numbers
     * @return Average of the numbers;
     */
    private static double averageOfNumbers(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double avg = (double) sum / numbers.length;

        return avg;
    }


    /**
     * Checks if number is even.
     * @param number number to evaluate.
     * @return The Boolean value stating whether the specified number is even
     */
    private static boolean isEven(int number) {

        return number % 2 == 0;
    }

    /**
     * Calculates BMI based on passed params.
     * @param height in meters
     * @param weight in kilograms
     */
    private static double calcBMI(double height, double weight) {
        return weight / (height * height);
    }


    /**
     * Calculates the final grades, rounding the average.
     * @param grades grades from 1 to 6.
     * @return The final grade based on average of grades.
     */
    private static int calcGrade(int[] grades) {
        double average = averageOfNumbers(grades);

        return (int) Math.round(average);
    }


    /**
     * Check if the passed word is a palindrome.
     * @param word Word to check
     * @return Boolean value stating whether the specified word is a palindrome.
     */
    private static boolean isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);

        return word.equalsIgnoreCase(stringBuilder.reverse().toString());
    }
}
