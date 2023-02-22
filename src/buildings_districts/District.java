package buildings_districts;

public class District {
    private int gardenSquare;
    private Building[] buildings;

    public District(int gardenSquare, Building[] buildings) {
        this.gardenSquare = gardenSquare;
        this.buildings = buildings;
    }

    public int countDistrictApartments() {
        int districtApartments = 0;
        for (Building building : buildings) {
            districtApartments += building.countTotalApartments();
        }
        return districtApartments;
    }

    public int countGardenPerApartment() {
        return gardenSquare / countDistrictApartments();
    }

}
