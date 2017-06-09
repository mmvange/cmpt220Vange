/** 
File: UseBMIClass.java
Author: Mary Vange
Course: CMPT 220
Assignment: Lab 7
Version: 1.3

**/

public class UseBMIClass {
  public static void main(String[] args) {
    BMI BMI1 = new BMI("Kim Yang", 145, 18, 5, 10); //Kim Yang is 18 years old, 145lbs, 5 foot 10 inches
    System.out.println("The BMI for " + BMI1.getName() + " is " + BMI1.getBMI() + ", which is " + BMI1.getStatus());

    BMI BMI2 = new BMI("Susan King", 215, 40, 5, 10); //Susan King is 40 years old, 215lbs, 5 foot 10 inches
    System.out.println("The BMI for " + BMI2.getName() + " is " + BMI2.getBMI() + ", which is " + BMI2.getStatus());
  }
}








