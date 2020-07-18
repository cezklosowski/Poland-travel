package sda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    public static List<String> loadFiler(String path){

        List<String> loadedRows = new ArrayList<>();

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while((line = bufferedReader.readLine()) != null){
                loadedRows.add(line);
            }
        } catch (FileNotFoundException e) { // istotna kolejność łapania wyjątków; IO jest większy. gdyby FileNot.. był po IO Ex, to nigdy by nie złapało
            e.printStackTrace();
            System.out.println("File not found: " + path);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Error accessing file: " + path);
        }

        return loadedRows;
    }

    public List<String> loadDataSecond(String path){
        try {
            return Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
