package com.bridgelabz;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BS_Search_Word {
    public static void main(String[] args) throws IOException {

        File file1 = new File("/home/rootadmin/Documents/Bridgelabz2/Day16/src/com/abc.txt");
        File file2 = new File("/home/rootadmin/Documents/Bridgelabz2/Day16/src/com/data.txt");
        ArrayList<String>lines =new ArrayList<String>();
        Scanner input = new Scanner(file1);
        FileInputStream fileInputStream = new FileInputStream(file1);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();
        Collections.sort(lines);
        System.out.println(line);


        int wordCount = 0;
        while ((line = bufferedReader.readLine()) != null) {
            String words[] = line.split(",");
            wordCount += words.length;
        }

        System.out.println("Total word count = "+ wordCount);
    }
}
