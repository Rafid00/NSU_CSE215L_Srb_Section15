package com.rafid;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = null;
        String randomInput;
        Quiz quiz = new Quiz();
        try {
            input = new Scanner(new File("text.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("file missing");
        }
        while (input.hasNext()) {
            quiz.settingID(input.next());
            quiz.settingMark(Double.parseDouble(input.next()));
        }
        quiz.printQuiz();
    }
}
