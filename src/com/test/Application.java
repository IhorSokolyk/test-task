package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        System.out.println("First task result -> " + reverseString("Java test"));
        System.out.println("Second task result -> " + addNumbers(-23, 34));
        readFile();
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

    private static void readFile() {
        File file = new File("src/com/test/test.txt");
        StringBuilder content = new StringBuilder();

        try(FileInputStream fis = new FileInputStream(file)) {
            int character;
            while ((character = fis.read()) != -1) {
                if (character == ',') {
                    break;
                } else {
                    content.append((char)character);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Content before comma -> " + content);

    }


}
