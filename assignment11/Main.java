package assignments.assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/assignments/assignment11/hello.txt");
        FileReader fileReader = new FileReader(file);
        while(fileReader.read() != -1) {
            System.out.println((char)fileReader.read());
        }
    }
}
