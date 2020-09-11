package com.company;

import java.io.Serializable;

public class KcalCalculator extends Calory implements Serializable {

        private double kcal;
        private int sex;
        private float bodyweight;
        private int height;
        private int age;


        public double obliczKcal() {
            if (getSex() == 1) {
                kcal = ((9.9 * getBodyweight() + 625 * getHeight()) - 4.29 * getAge() + 5) * getPhysicalactivity()+DecisionClass.getRoznica();
                System.out.println("Obliczylem ci kcal dziku");
            }

            if (getSex() == 2) {
                kcal = ((9.99 * getBodyweight() + 625 * getHeight()) - 4.29 * getAge() - 161) * getPhysicalactivity()+DecisionClass.getRoznica();
                System.out.println("Obliczylem ci kcal dziczko");
            }
            return kcal;
        }


    }


