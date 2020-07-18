package sda;

import sda.model.Location;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class LocationAnalyzer {
    public static List<Location> getLongestNameLocations(List<Location> locations) {
        OptionalInt optionalOfMaxNameLength = locations.stream()
                .mapToInt(loc -> loc.getName().length()) // mapa długości nazw
                .max(); // zwraca typ OptionalInt ; optional - pojemnik na coś, co możeby być nullem
        int maxNameLength = optionalOfMaxNameLength.orElseGet(() -> 0); //zwrócenie ale z możliwością wartości default; w tym przypadku gdy będzie null, to default zwracamy 0, ale wymaga interfejs funkcyjny supplier, więc używamy lambdę bez argumentów, stąd ()
        return locations.stream()
                .filter(loc -> loc.getName().length() == maxNameLength).collect(Collectors.toList());

    }

}
