package assignments.assignment5;

import assignments.assignment5.singleton.Second;

public class Main {
    public static void main(String[] args) {
        First first = new First();
        first.printClassVariables();
        first.printLocalVariables();
        Second second = Second.initialize("hello");
        second.printString();
    }
}
