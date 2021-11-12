package ru.job4j;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height1) {
        double rsl = (height1 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);

        short height1 = 187;
        double woman = Fit.womanWeight(height1);
        System.out.println("Woman 187 is " + woman);
    }

}