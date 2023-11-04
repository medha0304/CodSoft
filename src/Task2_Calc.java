import java.util.Scanner;

public class Task2_Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfSub;
        double marks;
        double totalMarks = 0;
        double AvgPercent;
        char grade;
        System.out.println("Welcome to Calculator!");
        System.out.print("Enter number of subjects : ");
        noOfSub = in.nextInt();

        if(noOfSub <= 0) {
            System.out.println("Please enter valid number of subjects!");
        }

        for(int i = 1; i <= noOfSub; i++) {
            System.out.print("Marks obtained in subject" + i + " : ");
            marks = in.nextDouble();
            totalMarks += marks;
        }

        System.out.println("Total marks obtained in " + noOfSub + " subjects are : " + totalMarks);

        AvgPercent = totalMarks / noOfSub;
        System.out.println("Your average percentage = " + AvgPercent + "%");

        if (AvgPercent >= 85) {
            grade = 'A';
        } else if (AvgPercent >= 70 && AvgPercent < 85) {
            grade = 'B';
        } else if (AvgPercent >= 55 && AvgPercent < 70) {
            grade = 'C';
        } else if (AvgPercent >= 40 && AvgPercent < 55) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade : " + grade);
    }
}
