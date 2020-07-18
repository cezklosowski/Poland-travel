package sda.util;

import java.util.List;
import java.util.Map;

public class TestDataProvider {
    public static final List<String> rawData = List.of(
            "02;;;;DOLNOŚLĄSKIE;województwo;2020-01-01",
            "02;01;;;bolesławiecki;powiat;2020-01-01",
            "02;01;01;1;Bolesławiec;gmina miejska;2020-01-01",
            "04;;;;KUJAWSKO-POMORSKIE;województwo;2020-01-01",
            "04;01;01;1;Aleksandrów Kujawski;gmina miejska;2020-01-01",
            "04;01;02;1;Ciechocinek;gmina miejska;2020-01-01",
            "04;01;03;1;Nieszawa;gmina miejska;2020-01-01",
            "04;01;04;2;Aleksandrów Kujawski;gmina wiejska;2020-01-01",
            "04;03;04;3;Koronowo;gmina miejsko-wiejska;2020-01-01",
            "04;03;04;4;Koronowo;miasto;2020-01-01"
    );

    public static final Map<Integer,String> mappedVoivodeships = Map.of(
            2,"DOLNOŚLĄSKIE",
            4, "KUJAWSKO-POMORSKIE"
    );
}
