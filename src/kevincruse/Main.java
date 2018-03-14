package kevincruse;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        final int ROWS = 20;
        final int COLUMNS = 5;
        double[][] scores = new double[ROWS][COLUMNS];
        String[] names = new String[ROWS];
        String mystring = "", line = null;
        FileInputStream fis = new FileInputStream("C:\\Users\\kevin\\OneDrive\\Documents\\bowlers2.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        for (int r = 1; r <= 10; r++) {
            line = br.readLine();
            names[r] = line;
            for (int c = 1; c <= 3; c++) {
                line = br.readLine();
                scores[r][c] = Integer.valueOf(line);
            }
        }
        br.close();
        FileWriter fWriter = new FileWriter("mydata.html");
        PrintWriter outfile = new PrintWriter(fWriter);
        outfile.println("<!DOCTYPE html>");
        outfile.println("<html>");
        outfile.println("<head>");
        outfile.println("<title>Page Title</title>");
        outfile.println("</head>");
        outfile.println("<body>");
        outfile.println("<h1>This is a Heading</h1>");
        outfile.println("<p>This is a paragraph.</p>");
        outfile.println("<table style='border: 1px solid black;'>");
        for (int r = 1; r <= 10; r++) {
            outfile.println("<tr>");
            outfile.println("<td>" + names[r] + "</td>");
            for (int c = 1; c <= 3; c++) {
                outfile.println("<td>" + scores[r][c] + "</td>");
            }
            outfile.println("</tr>");
        }
        outfile.println("</table>");
        outfile.println("</body>");
        outfile.println("</html>");
        outfile.close();
    }
}