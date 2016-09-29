package ru.ulstu.java;

public class DataManager implements Runnable {

    private static boolean ready = false;

    public void sendData() {
        while (!ready) {
            System.out.println("Waiting for data...");
        }
        System.out.println("Sending data...");
    }

    public void prepareData() {
        ready = true;
    }

    @Override
    public void run() {
        sendData();
    }
}
