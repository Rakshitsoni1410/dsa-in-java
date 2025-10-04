package com.student.file;
import com.student.threading.FileReadThread;
import com.student.threading.FileWriteThread;
import java.util.*;

public class FileProcessor {
    private String input;
    private String output;

    public FileProcessor(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public void startProcessing() {
        try {
            List<String> lines = Collections.synchronizedList(new ArrayList<>());
            Thread reader = new Thread(new FileReadThread(input, lines));
            Thread writer = new Thread(new FileWriteThread(output, lines));
            reader.start();
            reader.join();
            writer.start();
            writer.join();
            System.out.println("File processing completed!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
