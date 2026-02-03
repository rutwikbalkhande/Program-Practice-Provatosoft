package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreate {

    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");


            if (file.createNewFile()) {
                System.out.println("new file created");
            }
            else{
                System.out.println("file  already exist");
            }
        System.out.println("file size :" + file.length());
        System.out.println("File Path: " +file.getAbsolutePath());

        System.out.println("File Path: " + file.getAbsolutePath());
    }
}
