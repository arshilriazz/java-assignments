package assignments.assignment2;

import java.util.Scanner;

public class CheckLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(check(string));
    }
    public static boolean check(String string) {
        string = string.toLowerCase();
        int[] letters = new int[26];
        for(int i = 0; i < string.length(); i++) {
            int idx = string.charAt(i) - 'a';
            if(idx >= 0 && idx < 26) letters[idx]++;
        }
        for(int i = 0; i < letters.length; i++) {
            if(letters[i] == 0) return false;
        }
        return true;
    }
}
