package Homework20;

public class AssignGrades {
    public static void assignStudents(int numberOfStudents, int score0, int score1, int score2, int score3) {
        System.out.print("Enter the number of students: " + numberOfStudents);
        int[] scores = new int[4];

        System.out.print("\nEnter " + numberOfStudents + " scores: \n");
        scores[0] = score0;
        scores[1] = score1;
        scores[2] = score2;
        scores[3] = score3;

        displayGrades(scores);
    }

    public static void displayGrades(int[] grades) {
        int highScore = bestGrade(grades);

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d score is %d and grade is %s%n",
                    i, grades[i], assignLetterGrade(grades[i], highScore));
        }
    }

    public static char assignLetterGrade(int grade, int highScore) {

        if (highScore - grade <= 10)
            return 'A';
        else if (highScore - grade > 10 && highScore - grade <= 20)
            return 'B';
        else if (highScore - grade > 20 && highScore - grade <= 30)
            return 'C';
        else if (highScore - grade > 30 && highScore - grade <= 20)
            return 'D';
        else
            return 'F';
    }

    public static int bestGrade(int[] grades) {
        int highScore = grades[0];

        for (int grade : grades) {
            if (grade > highScore)
                highScore = grade;
        }

        return highScore;
    }
}

