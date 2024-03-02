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

        // System.out.println(myFavColor);

        // calculations();

        // averageOfNumbers();

        isEven();
    }

    private static void calculations() {
        System.out.println(2 + 4);
        System.out.println(8 - 3);
        System.out.println(9 * 2);
        System.out.println(11 / 2);
    }

    private static void averageOfNumbers() {
        int[] numbers = {1, 4};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double avg = (double) sum / numbers.length;

        System.out.println(avg);
    }

    private static void isEven() {
        int number = 10;

        System.out.println(number % 2 == 0);
    }
}
