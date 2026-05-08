import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        int choice;
        String name;
        double quiz, exam;

        //menu
        do {
            //error trap
            while (true){
                System.out.println("1. Add Student");
                System.out.println("2. View Student");
                System.out.println("3. Search Student");
                System.out.println("4. Exit");
                System.out.print("Your choice: ");

                if (scanner.hasNextInt()){
                    choice = scanner.nextInt();
                    scanner.nextLine(); //newline fix
                    break;
                }else {
                    System.out.println("\nAgent Chris: Please enter a number.\n");
                    scanner.next(); //removes wrong input
                }
            }

            switch (choice){
                case 1:
                    System.out.println(); //don't mind

                    //name validation
                    while (true){
                        System.out.print("Enter the name of the student: ");
                        String tempName = scanner.nextLine();

                        if (!tempName.isEmpty()) {
                            name = tempName;
                            break;
                        } else {
                            System.out.println("Agent Chris: Please enter a name.");
                        }
                    }

                    //quiz validation
                    while (true){
                        System.out.print("Enter their quiz score: ");

                        if (scanner.hasNextDouble()){
                            double tempQuiz = scanner.nextDouble();

                            if(tempQuiz>=0 && tempQuiz<=100) {
                                quiz = tempQuiz;
                                break;
                            }else {
                                System.out.println("Agent Chris: Quiz score ranges from 0-100");
                            }
                        }else {
                            System.out.println("Agent Chris: Please enter a valid number");
                            scanner.next(); //removes wrong input
                        }
                    }

                    //exam validation
                    while (true){
                        System.out.print("Enter their exam score: ");

                        if (scanner.hasNextDouble()){
                            double tempExam = scanner.nextDouble();

                            if (tempExam>=0 && tempExam<=100) {
                                exam = tempExam;
                                break;
                            }else {
                                System.out.println("Agent Chris: Exam score ranges from 0-100");
                            }
                        }else {
                            System.out.println("Agent Chris: Please enter a valid number");
                            scanner.next(); //removes wrong input
                        }
                    }
                    scanner.nextLine(); //newline fix

                    Student student = new Student(name, quiz, exam);
                    students.add(student);

                    System.out.println(); //don't mind
                    break;
                case 2:
                    System.out.println();//don't mind
                    if (students.isEmpty()) {
                        System.out.println("Agent Chris: No students found.");
                    } else {

                        System.out.println("Agent Chris: Here's the student list.");

                        for (Student s : students) {
                            s.displayInfo();
                            System.out.println(); //don't mind
                        }
                    }
                    System.out.println(); //don't mind
                    break;
                case 3:
                    System.out.println(); //don't mind
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                        break;
                    }

                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();

                    boolean found = false;

                    for (Student s : students) {

                        if (s.getName().equalsIgnoreCase(searchName)) {

                            System.out.println("Agent Chris:  Student found.");
                            s.displayInfo();

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Agent Chris: Student not found.");
                    }
                    System.out.println(); //don't mind
                    break;
                case 4:
                    System.out.println("\nAgent Chris: Have a great day!\n");
                    break;
                default :
                    System.out.println("\nAgent Chris: Invalid choice.\n");
            }
        }while (choice!=4);

        scanner.close();
    }
}