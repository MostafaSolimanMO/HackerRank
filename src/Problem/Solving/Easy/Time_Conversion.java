package Problem.Solving.Easy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time_Conversion {
    private static final Scanner scan = new Scanner(System.in);

    static String timeConversion(String s) {
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssa");
        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
        Date date;
        String output = null;
        try {
            //Converting the input String to Date
            date = dateFormat.parse(s);
            //Changing the format of date and storing it in String
            output = outputformat.format(date);
            //Displaying the date
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        return output;
    }

    public static void main(String[] args) {
        String s = scan.nextLine();
        String result = timeConversion(s);
        System.out.println(result);
    }

}

