package Example1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) throws IOException{

        File f = new File("text.txt");
        f.createNewFile();

        Scanner s = new Scanner(f);

        // System.out.println(s.nextLine());
        // control flow - while, if
        int lines = 0;

        while(s.hasNext()){
            
            lines = lines+1;
            String out = s.nextLine();
            System.out.println(out);
            if(out.contains(" ")){
                System.out.println("that line contained a space.");
            }
            

        }

        System.out.println("The file had " + lines + " lines in total.");

    }

}