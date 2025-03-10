package collections;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class dataReader {
    private String fileName = "Ratio-Index.txt";
    public dataReader(String fileName) {
        this.fileName = fileName;
    }
    public ArrayList<String> getLines() {
        ArrayList<String> lines = new ArrayList<String>();
        Scanner fileScan;
        try {
            fileScan = new Scanner(new File(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return lines;
        }
        // Read the file and add each line to the lines ArrayList
        while (fileScan.hasNext()) {
            lines.add(fileScan.nextLine());
        }
        return lines;
    }
}
