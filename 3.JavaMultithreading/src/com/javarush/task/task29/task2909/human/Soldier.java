package com.javarush.task.task29.task2909.human;

/**
 * Created by MadHarry on 08.05.2017.
 */
public class Soldier extends Human {

    public Soldier(String name, int age) {
        super(name, age);
    }

    public void fight() {
    }
    public void live() {
        fight();
    }

}
