package sda;

import org.junit.Test;
import sda.model.*;

import java.util.List;

import static org.junit.Assert.*;

public class VacationTargetGeneratorTest {

    private List<Location> locationsForTest = List.of(
            new Village("Hobbiton","Shire"),
            new Village("Wola Zaorana","Testowe"),
            new City("Gdańsk","Pomorskie"),
            new UrbanRural("I have no idea", "Dunno")
    );

    @Test
    public void shouldReturnSomething(){

        // when
        Location randomLocation = VacationTargetGenerator.getRandomLocation(locationsForTest);

        // then
        assertNotNull(randomLocation);
    }

    @Test
    public void shouldReturnType(){

        // when
        Location randomLocation = VacationTargetGenerator.getRandomLocation(locationsForTest, LocationType.CITY);

        // then
        assertEquals(LocationType.CITY, randomLocation.getType());

    }

}