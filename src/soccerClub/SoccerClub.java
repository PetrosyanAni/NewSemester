package soccerClub;

public class SoccerClub {
    private String name;
    private int playersNumber;
    private Player[] players;

    SoccerClub(String clubName, int clubPlayersNumber, Player[] clubPlayers) {
        this.name = clubName;
        this.playersNumber = clubPlayersNumber;
        this.players = clubPlayers;
    }

}
