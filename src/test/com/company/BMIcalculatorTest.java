package com.company;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class BMIcalculatorTest extends Calory {
    BMIcalculator object = new BMIcalculator();

    @Test
    public void userGetAllDataAndBmiIsNotANull() {

        Assert.assertNotNull(object.calculateBMI());
    }


    @Test
    public void shouldShowThatsHumanisHealth() throws Exception
    {
        assertTrue(object.isHealth(22));
    }
}