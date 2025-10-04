package com.student.main;
import com.student.file.FileProcessor;

public class Main {
    public static void main(String[] args) {
        String input = "input.txt";
        String output = "output.txt";
        FileProcessor processor = new FileProcessor(input, output);
        processor.startProcessing();
    }
}
