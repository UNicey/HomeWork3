package com.company;

public class Main {

    public static void main(String[] args) {
        boolean firstNegative = false;
                double counter = 0;
                int sum = 0;
                double [] numbers = new double[] {10.2, 1.2, 34.5, -12.5, -5.6, 3.5, -6.7, 9.1, 5.9, -3.3, -5.12, 8.7, 2.3, 6.9, 2.2};
                for (double item : numbers){
                    if (item < 0) {
                        firstNegative = true;
                    }
                    if (firstNegative && item >= 0){
                        sum += item;
                        counter++;
                    }
                }
        System.out.println(sum);
        System.out.println(counter);
        System.out.println(sum/counter);
    }
}
