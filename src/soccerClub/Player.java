package soccerClub;

public class Player {
    final String name;
    final String surname;
    private String position;
    final String nationality;
    private String clubName;

    Player(String playerName, String playerSurname, String playerPosition, String playerNationality, String clubName) {
        this.name = playerName;
        this.surname = playerSurname;
        this.position = playerPosition;
        this.nationality = playerNationality;
        this.clubName = clubName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // public void setPosition(){
    //    position== "goalkeeper"
    //}
    public String getPosition() {
        return position;
    }
    public String getNationality(){
        return nationality;
    }
}




