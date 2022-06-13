package Lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab04_1 {

    private static int getUseroption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select option: ");
        int option = scanner.nextInt();
        return option;
    }
    private static void printSimpleMenu() {
        System.out.println("This is menu:");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print number");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
    }
    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing) {
            printSimpleMenu();
            int option = getUseroption();
            List<Integer> myArrayList = new ArrayList<>();
            myArrayList.add(0);
            myArrayList.add(1);
            myArrayList.add(2);
            myArrayList.add(3);
            myArrayList.add(4);

            switch (option) {
                case 1:
                    System.out.println("1. Add number into ArrayList");
                    myArrayList.add(0, 5 );
                    System.out.println("Number is added into ArrayList: " + myArrayList.get(1));
                    break;
                case 2:
                    System.out.println("2. Print number");
                    int index;
                    for (index = 0; index < myArrayList.size(); index++) {
                        myArrayList.get(index);
                        System.out.println(myArrayList.get(index));
                    }
                    break;
                case 3:
                    System.out.println("3. Get maximum number");
                    int maxArray;
                    maxArray = myArrayList.get(0);
                    for (int i = 0; i < myArrayList.size(); i++) {
                        if (myArrayList.get(i) > maxArray) {
                            maxArray = myArrayList.get(i);
                        }
                    }
                    System.out.println("Maximum number is: " + maxArray);
                    break;
                case 4:
                    System.out.println("4. Get minimum number");
                    int minArray;
                    minArray = myArrayList.get(0);
                    for (int i = 0; i < myArrayList.size(); i++) {
                        if (myArrayList.get(i) < minArray) {
                            minArray = myArrayList.get(i);
                        }
                    }
                    System.out.println("Minimum number is: " + minArray);
                    break;
                default:
                    System.out.println("Data is invalid");
            }
        }
    }
}