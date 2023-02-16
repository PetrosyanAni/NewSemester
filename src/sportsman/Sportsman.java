package sportsman;

public class Sportsman {
    int[] competitions;
    int invalidScore = 0;

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
        return average;
    }
}