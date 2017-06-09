/** 
File: BMI.java
Author: Mary Vange
Course: CMPT 220
Assignment: Lab 7
Version: 1.3

**/

public class BMI { //class to describe elements of BMI
  private String name; //indiviudal's name
  private double weight; //individual's weight measured in pounds
  private int age; //individual's age
  private double feet; //part of individual's height measured in feet
  private double inches; //remainder of individual's height measured in inches
  public static final double KILOGRAMS_PER_POUND = 0.45359237; //conversion constant
  public static final double METER_PER_FOOT = 0.3048; //coversion constant
  public static final double METER_PER_INCH = 0.0254; //conversion constant
  
  public BMI(String name, double weight, int age, double feet, double inches){ //constructor when given all info
    this.name = name; //assign given name to variable
    this.weight = weight; //assign given weight to variable
    this.age = age; //assign given age to variable
    this.feet = feet; //assign given height to variable
    this.inches = inches; //assign given height to variable
    
  }
  
   public BMI(String name, double weight, double feet, double inches){ //constructor when age is not given
    this(name, weight, 20, feet, inches); //set age to 20
  }
  
  public double getBMI() { //method to calculate BMI
    double BMI = (weight*KILOGRAMS_PER_POUND) / (((feet*METER_PER_FOOT) + (inches*(METER_PER_INCH))) * ((feet*METER_PER_FOOT) + (inches*(METER_PER_INCH))));
  
    return Math.round(BMI*100) / 100.0;
    
  }
  
  public String getStatus() { //return either "underweight", "normal", "overweight", or "obese" based off of BMI
    double BMI = getBMI();
    if (BMI < 18.5) //BMI under 18.5 is underweight
      return "Underweight";
    else if (BMI < 25)
      return "Normal";
    else if (BMI < 30)
      return "Overweight";
    else
      return "Obese";
  }

  public String getName() { //return name
    return name;
  }

  public double getWeight() { //return weight
    return weight;
  }
  
  public int getAge() { //return age
    return age;
  } 

  public double getFeet() { //return feet
    return feet;
  }
  
  public double getInches() { //return inches
    return inches;
  }
 
  
  
  
}