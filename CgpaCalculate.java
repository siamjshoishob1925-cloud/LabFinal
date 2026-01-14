/*import java.util.Scanner;

public class CgpaCalculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student ID: ");
        String studentID = sc.nextLine();

        System.out.print("No. of Courses: ");
        int numCourses = sc.nextInt();

        float totalCredits = 0;
        float totalWeightedGPA = 0;
        float creditEarned = 0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Course " + i + ":");

            System.out.print("Credit (Max 3): ");
            float credit = sc.nextFloat();   // changed from int to float

            System.out.print("CT (Max 30): ");
            int ct = sc.nextInt();

            System.out.print("AT (Max 10): ");
            int at = sc.nextInt();

            System.out.print("FE (Max 60): ");
            int fe = sc.nextInt();

            int totalMarks = ct + at + fe;
            float gpa = calculateGPA(totalMarks);

            totalCredits += credit;
            totalWeightedGPA += gpa * credit;

            if (gpa > 0.0) {
                creditEarned += credit;
            }
        }

        float cgpa = totalWeightedGPA / totalCredits;
        String grade = calculateGrade(cgpa);

        // Output
        System.out.println("\nStudent ID: " + studentID);
        System.out.printf("Credit Taken: %.2f\n", totalCredits);   // show float properly
        System.out.printf("Credit Earned: %.2f\n", creditEarned);  // show float properly
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);
    }

    public static float calculateGPA(int marks) {
        if (marks >= 80) return 4.0f;
        else if (marks >= 75) return 3.75f;
        else if (marks >= 70) return 3.5f;
        else if (marks >= 65) return 3.25f;
        else if (marks >= 60) return 3.0f;
        else if (marks >= 55) return 2.75f;
        else if (marks >= 50) return 2.5f;
        else if (marks >= 45) return 2.25f;
        else if (marks >= 40) return 2.0f;
        else return 0.0f;
    }

    public static String calculateGrade(float cgpa) {
        if (cgpa >= 4.0) return "A+";
        else if (cgpa >= 3.75) return "A";
        else if (cgpa >= 3.5) return "A-";
        else if (cgpa >= 3.25) return "B+";
        else if (cgpa >= 3.0) return "B";
        else if (cgpa >= 2.75) return "B-";
        else if (cgpa >= 2.5) return "C+";
        else if (cgpa >= 2.25) return "C";
        else if (cgpa >= 2.0) return "D";
        else return "F";
    }
}
*/
import java.util.Scanner;

public class CgpaCalculate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();

        System.out.print("Enter Number of Courses: ");
        int courses = sc.nextInt();

        int creditTaken = 0;
        int creditEarned = 0;
        double totalPoint = 0;

        for (int i = 1; i <= courses; i++) {

            System.out.println("\nCourse " + i);

            System.out.print("Credit (Max 3): ");
            int credit = sc.nextInt();

            System.out.print("CT (Max 30): ");
            int ct = sc.nextInt();

            System.out.print("AT (Max 10): ");
            int at = sc.nextInt();

            System.out.print("FE (Max 60): ");
            int fe = sc.nextInt();

            int totalMarks = ct + at + fe;
            double gradePoint = 0;

            if (totalMarks >= 80) gradePoint = 4.00;
            else if (totalMarks >= 75) gradePoint = 3.75;
            else if (totalMarks >= 70) gradePoint = 3.50;
            else if (totalMarks >= 65) gradePoint = 3.25;
            else if (totalMarks >= 60) gradePoint = 3.00;
            else if (totalMarks >= 55) gradePoint = 2.75;
            else if (totalMarks >= 50) gradePoint = 2.50;
            else if (totalMarks >= 45) gradePoint = 2.25;
            else if (totalMarks >= 40) gradePoint = 2.00;
            else gradePoint = 0.00;

            creditTaken += credit;

            if (gradePoint > 0) {
                creditEarned += credit;
            }

            totalPoint += gradePoint * credit;
        }

        double cgpa = totalPoint / creditTaken;
        cgpa = Math.round(cgpa * 100.0) / 100.0;

        String finalGrade;

        if (cgpa >= 3.75) finalGrade = "A+";
        else if (cgpa >= 3.50) finalGrade = "A-";
        else if (cgpa >= 3.00) finalGrade = "B";
        else if (cgpa >= 2.50) finalGrade = "C";
        else finalGrade = "F";

        System.out.println("\n----- RESULT -----");
        System.out.println("Student ID: " + studentId);
        System.out.println("Credit Taken: " + creditTaken);
        System.out.println("Credit Earned: " + creditEarned);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + finalGrade);

        sc.close();
    }
}