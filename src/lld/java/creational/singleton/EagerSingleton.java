package com.ankush.rajabhoj.singleton;

public class EagerSingleton {

    private static final EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }
}
