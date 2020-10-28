package com.izavasconcelos.coreengineering.tema04;

public class Main {
    public static void main(String[] args) {
        Thread numberEven = new EvenGenerator();
        Thread numberOdd = new OddGenerator();

        numberEven.start();
        numberOdd.start();
    }
}
