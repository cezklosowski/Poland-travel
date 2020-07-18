package sda;

import org.junit.Test;
import sda.model.Location;
import sda.util.TestDataProvider;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class LocationMapperTest {

    @Test
    public void testMapping(){
        // give
        List<String> rawData = TestDataProvider.rawData;
        Map<Integer, String> mappedVoivodeships = TestDataProvider.mappedVoivodeships;

        // when
        List<Location> result = LocationMapper.mapLocations(rawData,mappedVoivodeships);

        // then
        assertEquals(6,result.size());
        List<String> resultNames = result.stream()
                .map(Location::getName)
                .collect(Collectors.toList());
        assertTrue(resultNames.contains("Koronowo"));
    }

}