package com.ankush.rajabhoj.strategy.duck;

import com.ankush.rajabhoj.strategy.flying.FlyWithWings;
import com.ankush.rajabhoj.strategy.quacking.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("mallard duck");
    }
}
