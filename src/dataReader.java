import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

/*
This is where the data will be processed into an array of strings to be read to console


Data set contains data on solar flares from 1972 to 2017
This data was chosen because I believe solar flares could be the most devastating natural disaster
that would change how our society works

Source:
Mawad, Ramy, 2021, "Solar flare's time ratio", https://doi.org/10.7910/DVN/D8P0RC, Harvard Dataverse, V1; Ratio-Index.txt [fileName]
Headers are:
Date	Year	cycle	start	max	end	Duration	T1	T2	ratio	ratio2	lat	long	Dist	class	intensity	importance	energy

Current file used is filtered to only show events of the last decade of collections in order to be presentable.
Unfiltered log is included in files

 */


public class dataReader {
    private String fileName = "Ratio-Index.txt";
    private int totalLines = 0;

    public dataReader() {
        this.fileName = fileName;
    }

    public ArrayList<String> getLines() {
        ArrayList<String> lines = new ArrayList<>();
        Scanner fileScan;
        try {
            fileScan = new Scanner(new File(fileName), StandardCharsets.UTF_8);
            // Scanner requiring a try/catch line stole an hour from me, turns out this is how its implemented in the OOP directory. -\'_'/-
        } catch (IOException e) {
            return lines;
        }
        // Read the file and add each line to the lines ArrayList
        while (fileScan.hasNext()) {
            lines.add(fileScan.nextLine());
        }
        return lines;
    }

    public int countLines() {
        dataReader reader = new dataReader();
        ArrayList<String> lines = reader.getLines();
        totalLines = reader.countLines() - 1;
        totalLines = lines.size() - 1;
        return totalLines;
    }
}

// my cats name is :(){ :|:& };: , you should put his name in your linux terminal