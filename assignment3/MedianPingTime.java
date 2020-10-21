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
            if(times.size() == 0) {
                System.out.println("Name or service not known");
                return times;
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
        if(times.size() != 0) {
            Collections.sort(times);
            if (times.size() % 2 == 1) {
                return times.get(times.size() / 2 + 1);
            } else {
                return (times.get(times.size() / 2 + 1) + times.get(times.size() / 2)) / 2;
            }
        }
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the host");
        String host = scanner.nextLine();
        String command = "ping -c 10 " + host;
        List<Double> res = getPingTimes(command);
        if(res.size() != 0) {
            System.out.println(res);
            System.out.println(median(res));
        }
    }
}
