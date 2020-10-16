package assignments.assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternMatcher {
    public boolean patternMatch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a sentence");
        String expression = "^[A-Z].*\\.$";
        String string = scanner.nextLine();
        return Pattern.matches(expression, string);
    }

    public static void main(String[] args) {
        PatternMatcher patternMatcher = new PatternMatcher();
        System.out.println(patternMatcher.patternMatch());
    }
}
