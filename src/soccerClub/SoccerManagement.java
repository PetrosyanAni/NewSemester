package soccerClub;

import java.sql.SQLOutput;

public class SoccerManagement {
    public static void main(String[] args) {

        Player Xavi = new Player("Xavi", "Hernández", "coach", "Catalonia", "Barcelona");
        Player Marc_Andre = new Player("Marc-Andre", "ter Stegen", "goalkeeper", "Germany", "Barcelona");
        Player Ronald = new Player("Ronald", "Araujo", "defender", "Uruguay", "Barcelona");
        Player Jordi = new Player("Jordi", "Alba", "defender", "Spain", "Barcelona");
        Player Sergio = new Player("Sergio", "Busquets", "defender", "Spain", "Barcelona");
        Player Carlo = new Player("Carlo ", "Ancelotti", "coach", "Italy", "Real Madrid");
        Player Andriy = new Player("Andriy", "Lunin", "defender", "Ukraine", "Real Madrid");
        Player José = new Player("José", "Fernández Iglesias", "defender", "Spain", "Real Madrid");
        Player Federico = new Player("Federico", "Santiago Valverde Dipetta", "midfielder", "Uruguay", "Real Madrid");

        Player[] BarcelonaClub = {Xavi, Marc_Andre, Ronald, Jordi, Sergio};
        Player[] RealMadridClub = {Carlo, Andriy, José, Federico};

        SoccerClub Barcelona = new SoccerClub("Barcelona", 5, BarcelonaClub);
        SoccerClub RealMadrid = new SoccerClub("Real Madrid", 4, RealMadridClub);

        System.out.println("Jose's name is" + José.getName());
        System.out.println("Federico's position is " + Federico.getPosition());
        System.out.println("Sargio's nationality is "+ Sergio.getNationality());
    }
}
