package assignments.assignment8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age, height and weight to ride the roller coaster");
        int age = scanner.nextInt();
        int height = scanner.nextInt();
        int weight = scanner.nextInt();
        try {
            if(age < 12) {
                throw new LowAgeException();
            }
            if(height < 150) {
                throw new LowHeightException("You are too short to ride this");
            }
            if(weight > 110) {
                throw new HighWeightException("You are over weight to ride this");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("This executes no matter, what this is finally block");
        }
    }
}
