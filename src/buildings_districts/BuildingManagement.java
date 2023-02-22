package buildings_districts;

public class BuildingManagement {
    public static void main(String[] args) {
        Building building1 = new Building(5, true, 4);
        Building building2 = new Building(8, false, 4);
        Building building3 = new Building(9, true, 4);
        Building building4 = new Building(7, true, 4);
        Building building5 = new Building(5, true, 4);
        Building building6 = new Building(2, true, 4);

        Building[] buildings = {building1, building2, building3};
        Building[] buildingsNew = {building4, building5, building6};

        District district1 = new District(300, buildings);
        District district2 = new District(800, buildingsNew);

        int result = district1.countGardenPerApartment();
        System.out.println(result);
    }
}
