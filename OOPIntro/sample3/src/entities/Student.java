package entities;

public class Student {

    public String Name;
    public Double Grade1;
    public Double Grade2;
    public Double Grade3;

    public Double calculateAverage() {
        return (Grade1 + Grade2 + Grade3);
    }

    public String finalGradeStatus() {
        double average = calculateAverage();
        double requiredMinimum = 60;

        if (average >= requiredMinimum) {
            return "Sua nota Final foi " + String.format("%.2f", average) + "\nVocê passou! Parabéns!";
        } else {
            double pointsNeeded = requiredMinimum - average;
            return "Sua nota Final foi " + String.format("%.2f", average) + "\nVocê infelizmente reprovou!\nFaltou apenas " + String.format("%.2f", pointsNeeded) + " pontos!";
        }
    }
}
