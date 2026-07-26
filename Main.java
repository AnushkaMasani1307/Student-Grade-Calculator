import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int total = 0;
        double average, percentage;
        char grade;

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        average = total / 5.0;
        percentage = (total / 500.0) * 100;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n----- Student Report -----");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total + "/500");
        System.out.println("Average      : " + average);
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("Grade        : " + grade);

        if (grade == 'F')
            System.out.println("Result       : Fail");
        else
            System.out.println("Result       : Pass");

        sc.close();
    }
}
