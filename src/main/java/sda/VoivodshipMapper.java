package sda;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VoivodshipMapper {
    public static Map<Integer, String> mapData(List<String> loadedRawData) {
        List<String> voivodeshipLines = loadedRawData.stream() // wrzucenie listy do streama
                .filter(new Predicate<String>() { // przefiltrowanie danych, które spełniają dany warunek filtrowania
                    @Override // anonimowa implementacja klasy Predicate
                    public boolean test(String s) {
                        return s.contains("województwo");
                    }
                })
                .collect(Collectors.toList()); // zrzucenie streama z powrotem do listy
        return null;
    }
}
