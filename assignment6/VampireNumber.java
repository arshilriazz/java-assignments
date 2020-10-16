package assignments.assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class VampireNumber {
    public static boolean check(int num1, int num2, int num) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string = new StringBuilder();
        int count1 = 0, count2 = 0;
        while(num1 > 0) {
            int x = num1 % 10;
            num1 /= 10;
            char ch = (char) x;
            string1.append(ch);
            count1++;
        }
        while(num2 > 0) {
            int x = num2 % 10;
            num2 /= 10;
            char ch = (char) x;
            string1.append(ch);
            count2++;
        }
        if(count1 != count2) return false;
        while(num > 0) {
            int x = num % 10;
            num /= 10;
            char ch = (char) x;
            string.append(ch);
        }
        char[] string1Array = string1.toString().toCharArray();
        char[] stringArray = string.toString().toCharArray();
        Arrays.sort(string1Array);
        Arrays.sort(stringArray);
        if(string1Array.length != stringArray.length) return false;
        for(int i = 0; i < stringArray.length; i++) {
            if(string1Array[i] != stringArray[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 10;
        int x = 1260;
        while(count > 0) {
            for(int i = 2; i * i < x; i++) {
                if(x % i == 0) {
                    if(check(i, x/i, x)) {
                        System.out.println(x + "  is a vampire number with factors " + i + " " + x/i);
                        count--;
                    }
                }
            }
            x++;
        }
    }
}
