package assignments.assignment8;

public class LowAgeException extends Exception{
    public LowAgeException() {
        super();
        System.out.println("You are too young to ride");
    }
}
