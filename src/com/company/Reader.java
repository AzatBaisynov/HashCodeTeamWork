package com.company;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List fileReader(String text){
        List<String[]> ary = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(text));
            String line = reader.readLine();
            int i=0;
            while (line != null) {
                ary.add(line.split(" "));
                line = reader.readLine();
                i++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ary;
    }

    public static void main(String[] args) {

        List<String[]> strings = Reader.fileReader("C:\\Users\\Bakdoolot\\Desktop\\bb.txt");

        for(int i=0; i<strings.size(); i++){
            for(int j=0; j<strings.get(i).length; j++){
                System.out.print(strings.get(i)[j] + " ");
            }
            System.out.println();
        }

    }
}