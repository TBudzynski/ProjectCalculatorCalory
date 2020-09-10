package com.company;

import java.io.Serializable;

public abstract class Calory implements Serializable {


    private int sex;
    private float bodyweight;
    private float height;
    private int age;
    private float physicalactivity;


    public float getPhysicalactivity() {
        return physicalactivity;
    }

    public void setPhysicalactivity(float physicalactivity) {
        this.physicalactivity = physicalactivity;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBodyweight() {
        return bodyweight;
    }

    public void setBodyweight(float bodyweight) {
        this.bodyweight = bodyweight;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

}
