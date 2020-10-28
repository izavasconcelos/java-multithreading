package com.izavasconcelos.coreengineering.tema04;

import java.util.Random;

public class EvenGenerator extends Thread {

    @Override
    public void run(){
        while(true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Even: " + generateRandomEvenNumber());
        }
    }
    private int generateRandomEvenNumber() {
        Random random = new Random();
        int number = random.nextInt(100);
        return number * 2;
    }
}
