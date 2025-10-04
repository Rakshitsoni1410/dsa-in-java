package com.student.threading;
import java.io.*;
import java.util.List;

public class FileWriteThread implements Runnable {
    private String output;
    private List<String> lines;

    public FileWriteThread(String output, List<String> lines) {
        this.output = output;
        this.lines = lines;
    }

    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Writing done.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }
    }
}
