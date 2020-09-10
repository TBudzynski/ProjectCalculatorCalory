package com.company;


import java.io.Serializable;

public class BMIcalculator extends Calory implements Serializable {
    private float BMI;
    private int sex;
    private float bodyweight;
    private float height;
    private int age;
    private float physicalactivity;

    public double decyzjaBMI() {
        calculateBMI();
        if (BMI < 18.5) {
            System.out.println("Twoje BMI wynosi " + BMI + "It is underweight! You should eat more, we took it into account in the calculations ");
        }
        if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Twoje BMI wynosi " + BMI + "It is good value!");
        }
        if (BMI >= 25 && BMI < 30) {
            System.out.println("Your BMI is " + BMI + "It is overweight ! You should control your weight, we took it into account in the calculations ");
        }
        if (BMI >= 30) {
            System.out.println("Your BMI is  " + BMI + "It is obesity!You should eat less, we took it into account in the calculations ");
        }
        return BMI;
    }

    public double calculateBMI() {
        BMI = getBodyweight() / ((getHeight()) * (getHeight()));
        return BMI;
    }

    public void setBMI(float BMI) {
        this.BMI = BMI;
    }

    public float getBMI() {
        return BMI;
    }
}
