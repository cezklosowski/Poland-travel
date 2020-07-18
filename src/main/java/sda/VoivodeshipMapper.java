package sda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VoivodeshipMapper {
    public static Map<Integer, String> mapData(List<String> loadedRawData) {

        Map<Integer, String> voivodeshipMap = new HashMap<>();

        loadedRawData.stream() // wrzucenie listy do streama
                .filter(line -> line.contains("województwo")) // filtrowanie z wykorzystaniem lambdy
                .forEach(filteredLine -> { // przejście po wszystkich

                    String[] splitLines = filteredLine.split(";"); // splitowanie

                    Integer number = Integer.valueOf(splitLines[0]); // wyciągnięcie numeru województwa
                    String name = splitLines[4]; // wyciągnięcie nazwy województwa

                    voivodeshipMap.put(number, name); // wrzucenie elementu do mapy = numer - klucz, nazwa - wartość
                });

        return voivodeshipMap;
    }
}
