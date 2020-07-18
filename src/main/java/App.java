import sda.DataLoader;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world");
        List<String> loadedRows = DataLoader.loadFiler("TERC.csv");
        System.out.println(loadedRows);

    }
}
