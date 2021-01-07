package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KcalCalculatorTest extends Calory{

    KcalCalculator kcalCalculator = new KcalCalculator();
    DecisionClass decisionClass = new DecisionClass();
    @Test
    public void shouldCorrectCalculatedKcal()  {

        //given

        kcalCalculator.setSex(1);
        kcalCalculator.setAge(22);
        kcalCalculator.setPhysicalactivity(1.5f);
        kcalCalculator.setBodyweight(67);
        kcalCalculator.setHeight(1.75f);
        decisionClass.calculateBMI();

        //when
       double kcal = kcalCalculator.obliczKcal();

       // then
      assertEquals(2501.5,kcal,1);






    }
}