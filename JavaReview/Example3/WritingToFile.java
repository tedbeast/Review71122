package Example3;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

    // main method is the entry point of a java program
    // public? access modifier - this method is accessible from any other class
    // static? static means that the variable or method is universal across classes (there's only 1 copy thats shared -
    // it doesn't belong to an object)
    // void - the method returns nothing
    // String[] args - the method could potentially take in data on startup (we're not doing this)
    public static void main(String[] args){
        
        // FileWriter
        // the try-catch TRIES code and if an exception is thrown, then the code in the CATCH section will run
        try{
            FileWriter writer = new FileWriter("text.txt");
            writer.write("This is written from the fileWriter!");

            // a for loop is like a while loop, but it does a couple extra things:
            // 1: it creates some variable (usually called 'i')
            // 2: FOR every run of the loop, it checked if a certain conditional is met
            // 3: at the end of the loop, it executes a line of code (usually, this is to increment or decrement i by 1)
            for(int i = 0; i < 10; i++){
                writer.write(""+i);
            }
            writer.close();
            // for loops are almost always used for iterating over a collection of data
            // (arrays, arraylists, etc)
            // so if you're testing that all the data in an array or arraylist is correct, this is what you'd use!


        }catch(IOException e){
            // System.out.println("Some exception was thrown...");
            e.printStackTrace();
        }
        

    }
    
}
