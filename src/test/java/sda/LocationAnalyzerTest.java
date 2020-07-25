package sda;

import org.junit.Before;
import org.junit.Test;
import sda.model.Location;
import sda.model.Village;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class LocationAnalyzerTest {

    private List<Location> testLocations;

    @Before // wywoła się przed każdą metodą testową
    public void setUp() throws Exception {
        testLocations = new ArrayList<>();
        testLocations.add(new Village("Pcim Dolny","KOSZALISKIE"));
        testLocations.add(new Village("Kipc Dolny","KOSZALISKIE"));
        testLocations.add(new Village("Pcim","KOSZALISKIE"));
        testLocations.add(new Village("Pruszków","WARSZAWSKIE"));
    }

    @Test
    public void shouldsReturnTwoLocations(){

        List<Location> results = LocationAnalyzer.getLongestNameLocations(testLocations);
        assertEquals(2,results.size());

        List<Location> filteredByKoszalinskie = results.stream().
                filter(loc -> loc.getVoivodeship().equals("KOSZALISKIE"))
                .collect(Collectors.toList());
        assertEquals(2, filteredByKoszalinskie.size());

        List<String> resultNames = filteredByKoszalinskie.stream()
                .map(Location::getName)
                .collect(Collectors.toList());
        assertTrue(resultNames.contains("Kipc Dolny"));

    }

    @Test
    public void testByVoivodeshipFiltering(){

        Map<String, List<Location>> result = LocationAnalyzer.getLongestNameLocationsByVoivodeships(testLocations);
        assertEquals(2,result.keySet().size());

        List<Location> warszawskieVoi = result.get("WARSZAWSKIE");
        assertEquals(1,warszawskieVoi.size());



    }

}