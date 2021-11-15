package com.company;

public class Main {
    static sec_thread new_thread;

    public static void main(String[] args) {
        new_thread = new sec_thread();
        new_thread.start();
        for (int i = 0; i < 100; ++i) {
            new_thread.run();
            System.out.println("Ping");
        }
        new_thread.finish();
    }
}
