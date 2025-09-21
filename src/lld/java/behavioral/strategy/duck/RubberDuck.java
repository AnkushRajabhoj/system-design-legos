package com.ankush.rajabhoj.strategy.duck;

import com.ankush.rajabhoj.strategy.flying.FlyBehavior;
import com.ankush.rajabhoj.strategy.flying.FlyNoWay;
import com.ankush.rajabhoj.strategy.quacking.QuackBehavior;
import com.ankush.rajabhoj.strategy.quacking.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("rubber duck");
    }
}
