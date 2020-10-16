package assignments.assignment3;

import java.io.*;
import java.util.*;

public class MedianPingTime {
    public static List<Double> getPingTimes(String command) {
        List<Double> times = new ArrayList<>();
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader bfr = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while((line = bfr.readLine()) != null) {
                int timeIndex = line.indexOf("time");
                int msIndex = line.indexOf("ms");
                if(timeIndex != -1 && msIndex != -1) {
                    Double time = Double.parseDouble(line.substring(timeIndex + 5, msIndex - 1));
                    times.add(time);
                }
            }
            times.remove(times.size()-1);
            process.waitFor();
            return times;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static double median(List<Double> times) {
        Collections.sort(times);
        if(times.size() % 2 == 1) {
            return times.get(times.size()/2 + 1);
        }
        else {
            return (times.get(times.size()/2 + 1) + times.get(times.size()/2 )) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the website");
        String host = scanner.nextLine();
        String command = "ping -c 10 " + host;
        List<Double> res = getPingTimes(command);
        System.out.println(res);
        System.out.println(median(res));
    }
}
