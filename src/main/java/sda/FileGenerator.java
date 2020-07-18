package sda;

import sda.model.Location;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

    public static void generate(Location location, String path){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
            fileWriter.write(location.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
