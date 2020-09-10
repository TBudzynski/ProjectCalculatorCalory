package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        KcalCalculator kcalCalculator = new KcalCalculator();
        BMIcalculator BMIcalculator = new BMIcalculator();

boolean wzrosttruefalse = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your gender");
        System.out.println("1- men");
        System.out.println("2 - women");
        System.out.println("3 - other");

        kcalCalculator.setSex(scanner.nextInt());

        System.out.println("Please enter your age");

        kcalCalculator.setAge(scanner.nextInt());

        System.out.println("Please enter your height");

        float height = scanner.nextFloat();
        if( wzrosttruefalse = height > 10);
        {
            System.out.println("Please enter your height again,You have to use the x,yz format. For example 170cm it is a 1,7m ");

        }

        kcalCalculator.setHeight( height);
        BMIcalculator.setHeight(height);

        System.out.println("Prosze o podanie wagi ciała, używając do tego jednostki [kg]");
        float bodyweight = scanner.nextFloat();
        kcalCalculator.setBodyweight(bodyweight);
        BMIcalculator.setBodyweight(bodyweight);
        System.out.println("Please enter your physical aktyvity factor. Please you the range 1.2-2");

        kcalCalculator.setPhysicalactivity(scanner.nextFloat());


        System.out.printf("The calorie value is %.2f", kcalCalculator.obliczKcal());
            System.out.println();
        System.out.println( BMIcalculator.decyzjaBMI());

         // Serializable
        try{
                FileOutputStream f1 = new FileOutputStream("Filewithstateofobject.txt");

                ObjectOutputStream strumien1 = new ObjectOutputStream(f1);

                strumien1.writeObject(kcalCalculator);
                strumien1.writeObject(BMIcalculator);
                strumien1.close();

        }
          catch(FileNotFoundException ex)
          {
                  ex.printStackTrace();
          }
        catch (IOException ex)
        {
                ex.printStackTrace();
        }

        //Deserializable
        try
        {
            FileInputStream f1input = new FileInputStream("Filewithstateofobject.txt");
            ObjectInputStream czytamy  = new ObjectInputStream(f1input);
            KcalCalculator wyraz = (KcalCalculator) czytamy.readObject();
            System.out.println(wyraz.getSex());
            System.out.println(wyraz.obliczKcal());
            czytamy.close();
        }

        catch (ClassNotFoundException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
