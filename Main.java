
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter student name: ");
        student.setStudentName(scanner.nextLine());
        System.out.println("Enter past Grade (CGPA) in credit hours: ");
        student.setPastGrade(scanner.nextInt());
        System.out.println("Enter admissionFees: ");
        student.setAdmissionFee(scanner.nextInt());
        System.out.println("Enter department name: ");
        student.setDeptName(scanner.nextLine());

        scanner.nextLine();

        System.out.println("Enter course name: ");
        student.setCourseName(scanner.nextLine());



        Student students1=new Student();
        System.out.println("Enter student name: ");
        students1.setStudentName(scanner.nextLine());

        System.out.println("Enter past Grade (CGPA) in credit hours: ");
        students1.setPastGrade(scanner.nextInt());

        System.out.println("Enter admissionFees: ");
        students1.setAdmissionFee(scanner.nextInt());

        System.out.println("Enter department name: ");
        students1.setDeptName(scanner.nextLine());

        scanner.nextLine();

        System.out.println("Enter course name: ");

        students1.setCourseName(scanner.nextLine());

        ArrayList<Student> students=new ArrayList<>();
        students.add(student);
        students.add(students1);


        for (int i = 0; i < students.size();
             i++) {
            System.out.println(students.get(i));
        }

        System.out.println("Generating receipts.......");
        for (int i = 0; i < students.size();
             i++) {
            Student student3 = students.get(i);
            if(student3.getPastGrade()>350){
                student3.setAdmissionFee(student3.getAdmissionFee() - 1500);
            }
            System.out.println(students.get(i));
        }

    }
}