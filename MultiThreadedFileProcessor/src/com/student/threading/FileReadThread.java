package com.student.threading;
import java.io.*;
import java.util.List;

public class FileReadThread implements Runnable {
    private String input;
    private List<String> lines;

    public FileReadThread(String input, List<String> lines) {
        this.input = input;
        this.lines = lines;
    }

    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(input))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line.toUpperCase());
            }
            System.out.println("Reading done.");
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
