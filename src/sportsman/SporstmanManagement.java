package sportsman;

public class SporstmanManagement {
    public static void main(String[] args) {
        Sportsman Sportsman1 = new Sportsman(80, 40, 70, 100);
        Sportsman Sportsman2 = new Sportsman(40, 40, 70, 10);
        Sportsman Sportsman3 = new Sportsman(40, 40, 70, 10);
        Sportsman Sportsman4 = new Sportsman(40, 40, 10);

       Sportsman[] array = {Sportsman1, Sportsman2, Sportsman3, Sportsman4};
       for (int i=0; i< array.length;i++){
           System.out.println(array[i].averageScore());
       }

    }
}

