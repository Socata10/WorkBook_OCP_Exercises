package Chapter1_3.Ex3.school;
import java.util.Scanner;

public class StudentGradeEvaluator {

    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            while(true) {
                System.out.print("Enter student name (or 'exit' to quit): ");
                Object anyObject = input.nextLine();
                if(anyObject instanceof String studentName && !studentName.isEmpty()){
                    if(studentName.equalsIgnoreCase("exit")){
                        System.out.println("Exiting the program...");
                        break;
                    }
                    int[] scores = readScores(input);

                    int attendancePercentage = readAttendance(input);

                    double averageScore = calculateAverage(scores);

                    String grade = getAverageGradeString(averageScore);

                    String evaluatedLabel = getEvaluatedLabel(attendancePercentage, averageScore);

                    System.out.printf("Average: %.2f, Grade: %s, -> %s%n",
                            averageScore, grade, evaluatedLabel);

                }else {
                    System.out.println("Invalid input. Please enter a valid student name.");
                    continue;
                }
            }
        }
    }

    private static String getEvaluatedLabel(int attendancePercentage, double averageScore) {
        if (averageScore >= 70 && attendancePercentage >=75){
            return "PASS";
        } else if (averageScore >= 50 || attendancePercentage < 70) {
            return "RE-EXAM";
        } else {
            return "FAIL";
        }
    }

    private static String getAverageGradeString(double averageScore) {
        return switch ((int)averageScore / 10){
            case 10,9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }

    private static int readAttendance(Scanner input) {
        while(true){
            System.out.print("Enter attendance percentage:");
            String line = input.nextLine();
            int attendance;
            try {
                attendance = Integer.parseInt(line);
                if(attendance < 0 || attendance > 100){
                    System.out.println("Attendance must be between 0 and 100.");
                    continue;
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a numeric attendance percentage.");
                continue;
            }
            return attendance;
        }
    }

    private static int[] readScores(Scanner input) {
        while(true){
            System.out.print("Enter 3 test scores:");
            String line = input.nextLine();
            String[] parts = line.split("\\s+");
            if(parts.length != 3){
                System.out.println("Please enter exactly 3 scores.");
                continue;
            }
            int[] scores = new int[3];
            boolean valid = true;
            for(int i = 0; i < 3; i++){
                try {
                    scores[i] = Integer.parseInt(parts[i]);
                    if(scores[i] < 0 || scores[i] > 100){
                        System.out.println("Scores must be between 0 and 100.");
                        valid = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter numeric scores.");
                    valid = false;
                    break;
                }
            }
            if (!valid) {
                continue;
            }
            return scores;

        }
    }

    private static double calculateAverage(int[] scores){
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
}

