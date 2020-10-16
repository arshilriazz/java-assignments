package assignments.assignment1;

import java.io.File;
import java.util.regex.Pattern;

public class Search {
    private final String expression;
    public Search(String expression) {
        this.expression = expression;
    }
    public void searchFiles(String path) {
        File directory = new File(path);
        if(directory.listFiles() == null) return;
        for(File file : directory.listFiles()) {
            if(file.isDirectory()) searchFiles(file.getAbsolutePath());
            else {
                if(Pattern.matches(this.expression, file.getName()))
                    System.out.println(file.getAbsolutePath());
            }
        }
    }
}