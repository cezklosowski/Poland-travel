package model;

public abstract class Location {
    private String name;
    private String voivodeship;
    private LocationType type;

    public Location(String name, String voivodeship, LocationType type) {
        this.name = name;
        this.voivodeship = voivodeship;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getVoivodeship() {
        return voivodeship;
    }

    public LocationType getType() {
        return type;
    }

    public abstract String sayGreeting();
}
