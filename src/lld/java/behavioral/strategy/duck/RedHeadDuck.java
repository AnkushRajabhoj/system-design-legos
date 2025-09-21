package com.ankush.rajabhoj.strategy.duck;

import com.ankush.rajabhoj.strategy.flying.FlyWithWings;
import com.ankush.rajabhoj.strategy.quacking.Quack;

public class RedHeadDuck  extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("red headed duck");
    }
}
