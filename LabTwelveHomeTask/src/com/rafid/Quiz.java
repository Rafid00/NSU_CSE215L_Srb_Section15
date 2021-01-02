package com.rafid;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {
    private ArrayList<String> id = new ArrayList<String>();
    private ArrayList<Double> mark = new ArrayList<Double>();

    public void settingID(String idd) {
        id.add(idd);
    }

    public void settingMark(Double markk) {
        mark.add(markk);
    }

    public void printQuiz() {
        for (int i = 0; i < id.size(); i++) {
            System.out.println("ID: " + id.get(i) + " mark: " + mark.get(i));
        }
        int x = mark.indexOf(Collections.max(mark));
        System.out.println("Highest Mark Obtained By ID: " + id.get(x));
    }
}
