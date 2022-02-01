package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        display(convert(askValue()));

    }
    static double askValue(){
        double temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit: ");
        temp = input.nextDouble();
        return temp;
    }
    static double convert(double temp){
        if (temp < -460) {
            System.out.println("That temperature is below absolute zero(-460 degrees fahrenheit).");
            System.exit(0);
            return temp;
        }
        else {
                double celsiusTemp = (temp - 32) * 5.0 / 9;
                return celsiusTemp;
            }
    }
    static void display(double celsiusTemp){
        System.out.println("The temperature in celsius is " + celsiusTemp + " degrees.");
        display(convert(askValue()));
    }
}
