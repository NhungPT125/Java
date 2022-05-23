package lab02;

import java.util.Scanner;

public class Lab02_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight (kg): ");
        float inputWeight = scanner.nextFloat();

        System.out.println("Please enter your height (m): ");
        float inputHeight = scanner.nextFloat();

        float BMI = inputWeight / (inputHeight * 2);

        System.out.printf("Your weight is: %.2f\n ", inputWeight);
        System.out.printf("Your height is: %.2f\n ",inputHeight);
        System.out.printf("Your BMI is: %.2f\n ", BMI);




       if(BMI <= 18.5){
           double normalWeight = 18.5 * (inputHeight * 2);
            System.out.println("Underweight");
            System.out.println("You should increase:"+ (normalWeight - inputWeight));
        }else if(BMI > 24.9){
           double normalWeight = 24.9 * (inputHeight * 2);
            System.out.println("Overweight");
            System.out.println("You should decrease:" + (inputWeight - normalWeight));

        }

    }
}


