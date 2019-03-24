import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String name = new String();


        name = name;
        double weight = 0.0;
        double height = 0.0;
        double bmi = 0.0;

        System.out.print("Enter your Name: ");
        name = input.next();

        System.out.print("Enter your weight in kg: ");
        weight = input.nextDouble();

        System.out.print("Enter your height in cm: ");
        height = input.nextDouble();

        bmi = ((weight/(height * height))* 10000);

        System.out.printf(name + " your BMI is =");

        System.out.printf("%6.1f", bmi);


        if (bmi < 18.5) {
            System.out.print(" it's Underweight!");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.print(" it's Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.print(" it's Overweight!");
        } else if (bmi >= 30) {
            System.out.print(" it's Obese!");
        }

        System.out.println();
        System.out.println();

        System.out.println("!!!!REMEMBER!!!!");
        System.out.println("Underweight: Under 18.5");
        System.out.println("Normal: 18.5-24.9 ");
        System.out.println("Overweight: 25-29.9");
        System.out.println("Obese: BMI > 30!!! ");




    }




}
