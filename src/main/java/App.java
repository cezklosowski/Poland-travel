import sda.*;
import sda.model.Location;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("Poland travel App has started.");
        List<String> loadedRows = DataLoader.loadFile("TERC.csv");
        Map<Integer, String> voivodeships = VoivodeshipMapper.mapData(loadedRows);
        List<Location> locations = LocationMapper.mapLocations(loadedRows, voivodeships);
        Location randomLocation = VacationTargetGenerator.getRandomLocation(locations);
        System.out.println(LocationAnalyzer.getLongestNameLocations(locations));
        FileGenerator.generate(randomLocation, "test.txt");

    }
}
