package assignments.assignment1;

import java.util.Scanner;

public class RegexFileMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = "";
        while(!expression.equals("exit")) {
            System.out.println("Enter regex");
            expression = scanner.nextLine();
            Search searchFiles = new Search(expression);
            searchFiles.searchFiles("/home");
        }
    }
}