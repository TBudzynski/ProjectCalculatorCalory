package com.company;

public class DecisionClass extends BMIcalculator {

    private float BMI;
    private static int roznica;

    public static int getRoznica() {
        return roznica;
    }

    public int decisioncalc()
    {
        if (getBMI() < 20)
        {
          roznica = 300;
        }
        if(getBMI()<=25 && getBMI()>=20)
        {
            roznica =0;
        }
        if(getBMI()>25)
        {
            roznica = -300;
        }
        return roznica;
    }




}
