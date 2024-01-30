package c.a.junit.examples;

public class Calculator {
    public static Number multiply(Number x, Number y){
        return Math.multiplyExact((Integer) x, (Integer) y);
    }

    public static Number divide(Number x, Number y){
        return Math.floorDiv((Integer) x, (Integer) y);
    }

    //non static method
    public Number multiply_2(Number x, Number y){
        return Math.multiplyExact((Integer) x, (Integer) y);
    }

}
