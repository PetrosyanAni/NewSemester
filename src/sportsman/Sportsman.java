package sportsman;

public class Sportsman {
    int[] competitions;
    int invalidScore = 0;
    double average;

    Sportsman(int... competitions) {
        this.competitions = competitions;
        for (int i = 0; i < competitions.length; i++) {
            if (competitions[i] > 100 || competitions[i] < 70) {
                competitions[i] = 0;
                invalidScore++;
                continue;
            }
        }
    }

    double averageScore() {
        double average = 0;
        int count;
        for (count = 0; count <= competitions.length - 1; count++) {
            average += competitions[count];
        }
        count -= invalidScore;
        average /= count;
        this.average = average;
        return average;
    }


    int compareAverage(Sportsman sportsman) {
        int result = 0;
        if (this.average > sportsman.average) {
            System.out.println(1);
        } else if (this.average < sportsman.average) {
            System.out.println(-1);
        } else if (this.average == sportsman.average) {
            System.out.println(0);
        } else {
            System.out.println("No competition");

        }
        return result;
    }

}