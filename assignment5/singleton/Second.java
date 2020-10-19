package assignments.assignment5.singleton;

public class Second {
    String string;
    public static Second initialize(String string) {
//        this.string = string;
//        static function needs static variables
        Second second = new Second();
        return second;
    }
    public void printString() {
        System.out.println(this.string);
    }
}
