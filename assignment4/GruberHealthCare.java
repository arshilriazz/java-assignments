package assignments.assignment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GruberHealthCare {
    public String formDate(String formDate, String todayDate) {
        int lessDay = 0, moreday = 0, lessMonth = 0, moreMonth = 0, year = 0;
        int[] dform = new int[3];
        int[] dtoday = new int[3];
        String first = "", second = "";
        String[] sf = formDate.split("-");
        String[] st = todayDate.split("-");
        for(int i = 0; i < sf.length; i++) {
            dform[i] = Integer.parseInt(sf[i]);
            dtoday[i] = Integer.parseInt(st[i]);
        }
        if(dform[2] < dtoday[2]) {
            year = dtoday[2];
            lessMonth = dform[1] - 1;
            moreMonth = dform[1] + 1;
            if(dform[1] == 2) {
                lessDay = dform[0] + 1;
                moreday = dform[0] + 2;
            }
            else if(dform[1]%2 == 1) {
                lessDay = dform[0];
                moreday = dform[0] + 1;
            }
            else if(dform[1]%2 == 0) {
                lessDay = dform[0] + 1;
                moreday = dform[0];
            }
            if(dtoday[1] >= lessMonth && dtoday[1] <= moreMonth) {
                moreMonth = dtoday[1];
                moreday = dtoday[0];
            }
        }
        else {
            return "No range";
        }
        String days[] = new String[4];
        days[0] = lessDay+"";
        days[1] = lessMonth+"";
        days[2] = moreday+"";
        days[3] = moreMonth+"";
        for(int i = 0; i < days.length; i++) {
            if(days[i].length() == 1) days[i] = "0"+days[i];
        }
        first = days[0] + "-" + days[1] + "-" + year;
        second = days[2] + "-" + days[3] + "-" + year;
        return first + " " + second;
    }

    public static void main(String[] args) throws IOException {
//        GruberHealthCare gruberHealthCare = new GruberHealthCare();
        UsingLocalDate gruberHealthCare = new UsingLocalDate();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < 5; i++) {
            String string = br.readLine();
            System.out.print("\n");
            String[] strings = string.split(" ");
//            String ans = gruberHealthCare.formDate(strings[0], strings[1]);
//            System.out.println(ans);
            gruberHealthCare.formDate(strings[0], strings[1]);
        }
    }
}