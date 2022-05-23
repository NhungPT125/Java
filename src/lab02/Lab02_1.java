package lab02;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Lab02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight (kg): ");
        float inputWeight = scanner.nextFloat();

        System.out.println("Please enter your height (m): ");
        float inputHeight = scanner.nextFloat();

        Float BMI = inputWeight / (inputHeight * 2);

        System.out.printf("Your weight is: %.2f\n ", inputWeight);
        System.out.printf("Your height is: %.2f\n ",inputHeight);
        System.out.printf("Your BMI is: %.2f\n ", BMI);

        if(BMI <= 18.5){
            System.out.println("Underweight");
        }else if(BMI <= 24.9){
            System.out.println("Normal weight");
        }else if(BMI <=29.9){
            System.out.println("Overweight");
        }else {
            System.out.println("Obesity");
        }

    }
}
