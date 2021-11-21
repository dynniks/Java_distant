package com.company;

public  class Horse implements Runnable{
    private int Number;

    public Horse(int number) {
        Number = number;
    }

    @Override
    public void run() {
        System.out.println("Horse number " +Number+ " has finished!");
    }
}
