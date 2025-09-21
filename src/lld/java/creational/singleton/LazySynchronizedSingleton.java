package com.ankush.rajabhoj.singleton;

public class LazySynchronizedSingleton {

    private static LazySynchronizedSingleton uniqueInstance;

    private LazySynchronizedSingleton() {
    }

    public static synchronized LazySynchronizedSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySynchronizedSingleton();
        }
        return uniqueInstance;
    }
}
