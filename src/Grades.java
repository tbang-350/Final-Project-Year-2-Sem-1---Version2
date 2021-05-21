public class Grades extends Student {
    private double score;
    private double Gpa;

    public Grades(int score, double Gpa) {
        super(firstname, middlename, lastname, age, gender, address);
        this.score = score;
    }

    public void setScore(double s) {
        this.score = s;
    }

    public double getScore() {
        return score;
    }

    public char getGrade() {
        char lettergrade;
        if (score >= 90) {
            lettergrade = 'A';
        } else if (score >= 80) {
            lettergrade = 'B';
        } else if (score >= 70) {
            lettergrade = 'C';
        } else if (score >= 60) {
            lettergrade = 'D';
        } else {
            lettergrade = 'F';
        }
        return lettergrade;
    }

    public void setGpa(double G_pa) {
        Gpa = G_pa;
    }

    public Double getGpa() {
        return Gpa;
    }

}