package Example3;

import java.io.File;
import java.io.IOException;

public class CreatingFolder {

    public static void main(String[] args) throws IOException {
        File f = new File("folder");
        f.mkdirs();
    }
    
}
