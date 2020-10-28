package com.izavasconcelos.coreengineering.tema04;

import java.util.Random;

public class OddGenerator extends Thread {

    @Override
    public void run(){
        while(true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Odd: " + generateRandomOddNumber());
        }
    }
    private int generateRandomOddNumber() {
        Random random = new Random();
        int number = random.nextInt(100);
        return number * 2 + 1;
    }

}
