package com.test;

public class Application {

    public static void main(String[] args) {
        System.out.println("First task result -> " + reverseString("Java test"));
        System.out.println("Second task result -> " + addNumbers(-23, 34));
    }

    private static StringBuilder reverseString(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0;  i--) {
            result.append(str.charAt(i));
        }
        return result;
    }

    private static int addNumbers(int a, int b){
        while (b != 0){
            int c = (a & b) ;
            a = a^b;
            b = c << 1;
        }
        return a;
    }


}
