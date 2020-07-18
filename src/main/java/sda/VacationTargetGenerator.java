package sda;

import sda.model.Location;
import sda.model.LocationType;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class VacationTargetGenerator {


    public static Location getRandomLocation(List<Location> locations) {
        int randomNumber = new Random().nextInt(locations.size());
        return locations.get(randomNumber);
    }

    public static Location getRandomLocation(List<Location> locations, LocationType wantedType) {
        List<Location> filteredLocations = locations.stream()
                .filter(loc -> loc.getType() == wantedType)
                .collect(Collectors.toList());
        return getRandomLocation(filteredLocations);

    }
}


