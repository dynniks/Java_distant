package com.company;

public class sec_thread extends Thread{
    boolean isFinish = false;
    public void finish()
    {
        isFinish=true;
    }
    public void run()
    {
        if(!isFinish)
            System.out.println("Pong");
        else
            return;
    }
}
