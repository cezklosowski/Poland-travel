package sda;

import org.junit.Test;
import sda.util.TestDataProvider;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class VoivodshipMapperTest {

    @Test
    public void testMapping() {
        // given
        List<String> rawData = TestDataProvider.rawData;

        // when
        Map<Integer, String> results = VoivodshipMapper.mapData(rawData);

        // then
        assertEquals(2, results.size());


    }

}