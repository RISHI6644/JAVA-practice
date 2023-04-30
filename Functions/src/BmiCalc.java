/* Problem Description -

Given the height (A) and weight (B) of a person as input in centimetres and kilograms.

Find the BMI of that person and the classification of the user based on their BMI.

Print Underweight if BMI < 18.5
Print Normal weight if BMI lies in the range [18.5, 24.9]
Print Overweight if BMI lies in the range (24.9, 29.9]
Print Obese if BMI is greater than 29.9
If x is the weight in kilograms and y is the height in metres.

Then, BMI is calculated as x/(y*y). */

import java.util.Scanner;
public class BmiCalc {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        float height = sc.nextFloat();
        float weight = sc.nextFloat();

        String case1 = bmiCalc(height,weight);
        System.out.println(case1);
    }

    public static String bmiCalc(float A, float B) {
        float height = A / 100;
        float BMI = B / (height * height);
        String str = " ";

        if (BMI < 18.5) {
            str = "Undereight";
        }
        else if (BMI >= 18.5 && BMI <= 24.9) {
            str = "Normal weight";
        }
        else if (BMI >= 24.9 && BMI <= 29.9) {
            str = "Overweight";
        }
        else if (BMI  > 29.9){
            str = "Obese";
        }
        else {
            str = "Halted";
        }
        return str + "\n" + BMI;
    }
}
