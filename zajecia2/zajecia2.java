package zajecia2;

public class zajecia2 {
    public static void main(String[] args) {
        System.out.println("Hello world ");

        System.out.println(findIndexOfElement(new int[] { 4, 32, 3, 5, 12 }, 5));
    }

    private static int findIndexOfElement(int[] array, int numberToFind) {
        int indexOfNumber = -1;

        for (int i = 0; i < array.length; i++) {

            if (numberToFind == array[i]) {
                indexOfNumber = i;
            }

        }

        return indexOfNumber;
    }
}
