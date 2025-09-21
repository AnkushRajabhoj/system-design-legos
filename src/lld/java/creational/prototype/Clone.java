package com.ankush.rajabhoj.prototype;

public class Clone implements Cloneable {

    private int a = 1;


    public Clone(Clone clone) {
        this.a = clone.a;

    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
