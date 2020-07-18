package sda;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VoivodshipMapper {
    public static Map<Integer, String> mapData(List<String> loadedRawData) {
        List<String> voivodeshipLines = loadedRawData.stream() // wrzucenie listy do streama
                .filter(line -> line.contains("województwo")) // filtrowanie z wykorzystaniem lambdy
                .collect(Collectors.toList()); // zrzucenie streama z powrotem do listy
        return null;
    }
}
