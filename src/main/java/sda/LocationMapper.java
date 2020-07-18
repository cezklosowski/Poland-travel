package sda;

import sda.model.City;
import sda.model.Location;
import sda.model.UrbanRural;
import sda.model.Village;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LocationMapper {

    public static List<Location> mapLocations(List<String> rawLines, Map<Integer, String> voivodeships){
        return rawLines.stream()
                .filter(line -> line.contains("gmina"))
                .map(filteredLine -> mapRow(filteredLine, voivodeships))
                .collect(Collectors.toList());

    }

    private static Location mapRow(String line, Map<Integer,String> voivodeships){

        String[] splitLine = line.split(";");
        String type = splitLine[5];
        String name = splitLine[4];
        Integer voiNumber = Integer.valueOf(splitLine[0]);
        String voivodeshipName = voivodeships.get(voiNumber);
        switch (type){
            case "gmina miejska":
                return new City(name, voivodeshipName);
            case "gmina wiejska":
                return new Village(name, voivodeshipName);
            case "gmina miejsko-wiejska":
                return new UrbanRural(name, voivodeshipName);
            default:
                throw new IllegalArgumentException();
        }
    }
}
