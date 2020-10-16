package assignments.assignment11;

import java.io.*;
import java.util.*;

public class Count {
    public static void findLetterCount(File inputFile, String outputFile) throws IOException{
            FileReader fileReader = new FileReader(inputFile);
            Map<Character, Integer> countMap = new TreeMap<>();
            int x;
            while ((x = fileReader.read()) != -1) {
                char letter = (char) x;
                if (countMap.containsKey(letter)) {
                    countMap.put(letter, countMap.get(letter) + 1);
                }
                else {
                    countMap.put(letter, 1);
                }
            }
            intoOutputFile(countMap, outputFile);
    }

    public static void intoOutputFile(Map<Character, Integer> map, String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        PrintStream printStream = new PrintStream(fileOutputStream);
        for(Map.Entry<Character, Integer> m : map.entrySet()) {
            Character key = m.getKey();
            int val = m.getValue();
            printStream.print(key);
            printStream.print(" ");
            printStream.println(val);
        }
    }

    public static void main(String[] args) throws IOException {
        File input = new File("src/assignments/assignment11/hello.txt");
        String output = "src/assignments/assignment11/output.txt";
        findLetterCount(input, output);
    }
}
