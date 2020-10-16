package assignments.assignment4;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsingLocalDate {
    final static String format = "dd-MM-yyyy";

    public void formDate(String signUpDate, String today) {
        String newDate = signUpDate.substring(0, 6) + today.substring(6);

        LocalDate dateNew = LocalDate.parse(newDate, DateTimeFormatter.ofPattern(format));
        LocalDate todayDate = LocalDate.parse(today, DateTimeFormatter.ofPattern(format));

        String startDate = dateNew.minusDays(30).format(DateTimeFormatter.ofPattern(format));
        String endDate = dateNew.plusDays(30).format(DateTimeFormatter.ofPattern(format));

        String signUpYear = signUpDate.substring(6, 10);
        String currYear = today.substring(6, 10);

        if (Integer.parseInt(signUpYear) >= Integer.parseInt(currYear)) {
            System.out.println("No range");
        }
        else {
            System.out.print(startDate);
            System.out.print(" ");
            if (todayDate.compareTo(dateNew.plusDays(30)) >= 0) {
                System.out.println(endDate);
            }
            else {
                System.out.println(today);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        UsingLocalDate usingLocalDate = new UsingLocalDate();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < 5; i++) {
            String string = br.readLine();
            System.out.print("\n");
            String[] strings = string.split(" ");
            usingLocalDate.formDate(strings[0], strings[1]);
        }
    }
}
