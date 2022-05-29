package lab03;

public class Lab03_2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        int minArray = intArray[0];
        int maxArray = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (maxArray < intArray[i]) {
                maxArray = intArray[i];
            }
            if (minArray > intArray[i]) {
                minArray = intArray[i];
            }
        }
        System.out.printf("Minimum: %d\n", minArray);
        System.out.printf("Maximum: %d\n", maxArray);

    }
}
