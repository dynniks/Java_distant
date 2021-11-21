package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ArrayList<Horse> horses = new ArrayList<>();
        ArrayList<Integer> check1 = new ArrayList<>();
        for(int i=0;i<n;++i)
        {
            Horse new_horse = new Horse(i);
            horses.add(new_horse);
            check1.add(1);
        }
        Random random = new Random();
        for(int i=0;i<n;++i)
        {
            int check = -1;
            do{
                check = random.nextInt(n);
            }while(check1.get(check) != 1);
            check1.set(check,0);
            Horse horse = horses.get(check);
            synchronized (horse)
            {
                horse.run();
            }
        }
    }
}
