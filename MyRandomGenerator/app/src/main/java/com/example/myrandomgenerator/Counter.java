package com.example.myrandomgenerator;

import java.util.Random;

public class Counter {
    private int count;
    private int i;

    public Counter(){
        count = 0;
        i = 1;
    }

    public int addCounter(){
        if (count <= 0)
            i = 1;

        count = count + i;
        return count;
    }

    public int resetCounter(){
        i = 1;
        count = 0;
        return 0;
    }

    public int randomCount(){
        Random rand = new Random();
        i = -1;
        count = rand.nextInt(100);
        return count;
    }

}
