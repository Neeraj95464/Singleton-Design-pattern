package com.ynmio.Singleton.Design.pattern.eager;

public class EagerSingleton {

    // The single instance is created at the time of class loading.
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent instantiation from other classes.
    private EagerSingleton() {}

    // Public method to provide access to the instance.
    public static EagerSingleton getInstance() {
        return instance;
    }

    // Example method to demonstrate functionality.
    public void showMessage() {
        System.out.println("Hello from EagerSingleton!");
    }

    public static void main(String[] args) {
        // Accessing the single instance and calling a method on it.
        EagerSingleton singleton = EagerSingleton.getInstance();
        singleton.showMessage();
    }
}

