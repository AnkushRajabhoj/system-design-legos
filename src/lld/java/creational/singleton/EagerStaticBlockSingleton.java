package com.ankush.rajabhoj.singleton;

public class EagerStaticBlockSingleton {

    private static final EagerStaticBlockSingleton uniqueInstance;

    static {
        uniqueInstance = new EagerStaticBlockSingleton();
    }

    private EagerStaticBlockSingleton() {
    }

    public static EagerStaticBlockSingleton getInstance() {
        return uniqueInstance;
    }

}
