package com.ankush.rajabhoj.singleton;

public class LazyDoubleCheckedLockingSingleton {

    private static LazyDoubleCheckedLockingSingleton uniqueInstance;

    private LazyDoubleCheckedLockingSingleton() {
    }

    public static LazyDoubleCheckedLockingSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (LazyDoubleCheckedLockingSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new LazyDoubleCheckedLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
