package buildings_districts;

public class Building {
    private int floors;
    private int[] twoRoom;
    private int[] threeRoom;
    private boolean isMonolit;
    private int roomsPerfloor;

    Building(int floors, boolean isMonolit, int roomsPerfloor) {
        this.floors = floors;
        this.isMonolit = isMonolit;
        this.roomsPerfloor = roomsPerfloor;
        fillRoomNumbers(floors, roomsPerfloor);
    }

    private void fillRoomNumbers(int floors, int roomsPerfloor) {
        int totalApartments = floors * roomsPerfloor;
        int arrayLength = totalApartments / 2;
        threeRoom = new int[arrayLength];
        twoRoom = new int[arrayLength];
        for (int i = 1, j = 0; i < arrayLength; i++, j++) {
            twoRoom[j] = i;
            i++;
            threeRoom[j] = i;
        }
    }

    public int countTotalApartments() {
        return roomsPerfloor * floors;
    }
}