package com.company;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Writer {
    public static void main(String[] args) throws IOException {
        List<List<String>> lists = new ArrayList<>();
        FileWriter fW = new FileWriter("output.txt");
        for (int i = 0; i < lists.size(); i++){
            for (int j = 0; j < lists.get(i).size(); j++){
                fW.write(lists.get(i).get(j));
            }
            fW.write("\n");
        }
        fW.close();
    }
}