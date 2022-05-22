package lab02;

import java.util.Scanner;

public class Lab02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter your number: ");
        int yourNumber = scanner.nextInt();

        if (yourNumber%2 == 0){
            System.out.println("Your number is an even number");
        }else {
            System.out.println("Your number is an odd number");
        }
    }
}
