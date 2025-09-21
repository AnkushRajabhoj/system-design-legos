package com.ankush.rajabhoj.decorator.condiment;

import com.ankush.rajabhoj.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
