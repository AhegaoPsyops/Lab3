import java.util.*;
// where data will be translated into console from our dataReader object.

public class dataConsole {
    public static void main(String[] args) {
        dataReader reader = new dataReader();
        ArrayList<String> lines = reader.getLines();

        // Headers
        System.out.println("Extracted Data:");
        System.out.println("Date\tYear\tDuration\tClass\tIntensity");

        // Process console requirements of Lab
        int totalLines = lines.size();
        int[] targetLines = {1, 10};

        for (int lineNum : targetLines) {
            if (lineNum < totalLines && lineNum > 0) { // Ensure valid line index
                String[] columns = lines.get(lineNum).split("\\t");
                String date = columns[0]; // Exact date
                String year = columns[1].split("\\.")[0]; // Year
                // this one sucked because I had to turn a decimal year (ex 1975.6657534247) into the actual year value
                String duration = columns[6];  // Duration
                String class_flare = columns[14];  // Class of flare
                String intensity = columns[15]; // Intensity

                // print out the row data
                System.out.printf("%s\t%s\t%s\t%s\t%s%n", date, year, duration, class_flare, intensity);

            }
        }
        // print total number of lines in txt file
        totalLines--;
        System.out.println("Total Lines: " + totalLines);

    }
}
