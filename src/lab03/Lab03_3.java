package lab03;

public class Lab03_3 {
    public static void main(String[] args) {
        int[] intArray = {12, 34, 1, 16, 28};
        int numArray = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
