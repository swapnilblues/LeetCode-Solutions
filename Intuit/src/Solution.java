
import java.io.*;
import java.util.*;

public class Solution {
    // If you need extra classes, you can define them privately here within class Solution

    // Prints to standard output.
    static String findMidpointCourse(String[][] pairs) {
        // Your code here.
        HashMap<String, String> line = new HashMap<>();
        int courseCount = 0;
        String startingCourse;
        List<String> courses = new ArrayList<>();
        for (String[] pair : pairs) {

        }
        return null;
    }

    // DO NOT MODIFY MAIN()
    public static void main(String[] args) {
        List<String[]> arg1 = new ArrayList<String[]>();

        String line;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while ((line = br.readLine()) != null) {
                if (line.equals("")) {
                    continue;
                }

                arg1.add(line.split(" "));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        String[][] pairs = arg1.toArray(new String[arg1.size()][]);

        System.out.println(findMidpointCourse(pairs));
    }
}

