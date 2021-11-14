package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float dollarToRuble(float value) {
        return value * 60;
    }

    public static float euroToRuble(float value) {
        return value * 70;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("120 rubles are " + dollar + " dollars.");
        float rubles = Converter.dollarToRuble(3);
        System.out.println("120 rubles are " + dollar + " dollars.");
        float rublese = Converter.euroToRuble(2);
        System.out.println("210 rubles are " + euro + " euro.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        System.out.println("140 rubles are 2.33 dollars. Test result : " + passed);
        System.out.println("140 rubless are 2.33 dollars. Test result : " + passed);
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
    }
}
