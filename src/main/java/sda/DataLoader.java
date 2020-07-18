package sda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        } catch (FileNotFoundException e) { // istotna kolejność łapania wyjątków IO jest większy, więc odwrotnie FileNot.. nigdy by nie złapało
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        
        return loadedRows;
    }
}
