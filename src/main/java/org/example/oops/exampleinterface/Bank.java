package org.example.oops.exampleinterface;

public interface Bank {

    public abstract void accountNumber();

    public abstract void accountName();

    default void accountDate() {
        System.out.println("20-4-7744");
    }

    public  static void accountClosingDate() {
        System.out.println("Not yet Closing account");
    }

    public default void accountRunningGood() {
        System.out.println("running account");
    }
}


