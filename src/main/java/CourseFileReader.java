/**
 * File: CourseFileReader.java
 * Description: This module reads a text file based on an input string containing the filename.
 * Author: Stephen Corns
 * Student ID: 2908741
 * Email ID: A2908741
 * AI Tool Used: Y
 * This is my own work as defined by
 *    the University's Academic Integrity Policy.
 **/

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CourseFileReader {
    /**
     *
     * @param filepath
     * @return
     */
    public List<String> readFile(String filepath) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Path.of(filepath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Error reading file with Files.readAllLines: " + e.getMessage());
        }
        return lines;
    }
}