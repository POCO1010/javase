package demo01;

import java.math.*;

public class random {
    public static void main(String[] args) {
        double value = (int) ((Math.random() * 90) + 10); // [0.0~1.0]->[0.0~90.0]->[10.0~100.0]->[10~99]
        System.out.println(value);
    }
}
