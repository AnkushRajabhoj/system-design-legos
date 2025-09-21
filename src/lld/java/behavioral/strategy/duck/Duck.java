package com.ankush.rajabhoj.strategy.duck;

import com.ankush.rajabhoj.strategy.flying.FlyBehavior;
import com.ankush.rajabhoj.strategy.quacking.QuackBehavior;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performSwim() {
        System.out.println("every thing floats");
    }
}

