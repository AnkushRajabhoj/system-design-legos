package com.ankush.rajabhoj.strategy.duck;

import com.ankush.rajabhoj.strategy.flying.FlyRocketPowered;
import com.ankush.rajabhoj.strategy.quacking.Quack;

public class ModelDuck  extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyRocketPowered();
        quackBehavior = () -> System.out.println("VOOOOOSHHHH!");
    }

    public void display() {
        System.out.println("model duck");
    }
}
