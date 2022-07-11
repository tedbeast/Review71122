package Example4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CombiningTxt {

    public static void main(String[] args) throws IOException{

        File f1 = new File("file1.txt");
        File f2 = new File("file2.txt");
        File f3 = new File("file3.txt");

        Scanner s1 = new Scanner(f1);
        Scanner s2 = new Scanner(f2);
        FileWriter writer = new FileWriter(f3);

        // If we want to store lots of things, we have a few options
        // we could use Arrays (which is like saying we want X pre-defined amount of a certain type)
        // we could the Collections API (which are forms of storage that java uses that can store objects)
        // The simplest way to store things is probably something called ArrayList

        // the <?> indicated what type will be stored in this arraylist
        // arraylist has lots of useful methods like add, delete, set, etc that allow us to store things
        ArrayList<String> allLines = new ArrayList<>();
        while(s1.hasNext()){
            allLines.add(s1.nextLine());
        }
        while(s2.hasNext()){
            allLines.add(s2.nextLine());
        }
        // count from 0 to the size of the arrayList (run this code for the size of the arrayList)
        for(int i = 0; i < allLines.size(); i++){
            // write the i'th element to the file
            writer.write(allLines.get(i)+"\n");
        }
        writer.close();



    }
    
}
