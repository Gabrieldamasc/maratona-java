package lista.execercicios.StudentRegister;
import java.util.*;

public class Register {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        Boolean running = true;

        while (running) {
            System.out.println("====== Student Registration Menu ======");
            System.out.println("1 ---> Add student");
            System.out.println("2 ---> Show all student");
            System.out.println("3 ---> Show class average");
            System.out.println("4 ---> Finish");
            int userChooseOption = userIn.nextInt();
            userIn.nextLine();
            switch (userChooseOption) {
                case 1:
                    System.out.println(" ");
                    System.out.print("Full name: ");
                    String name = userIn.nextLine();
                    System.out.println(" ");
                    System.out.print("Student grade: ");
                    double grade = userIn.nextDouble();
                    studentList.add(new Student(name, grade));
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("Showing all students...");
                    for (Student student : studentList) {
                        System.out.println("-" + student);
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    double averageGrade = 0;
                    int sizeList = studentList.size();
                    double sumAllGrades = 0;
                    for (Student student : studentList){
                        sumAllGrades += student.getGrade();
                        for (Student studentAverage : studentList) {
                            averageGrade = sumAllGrades/ sizeList;
                        }
                    }

                    System.out.println(" ");
                    System.out.print("Class average: ");
                    System.out.println(averageGrade);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("Finishing your system...");
                    System.out.println(" ");
                    running = false;
                    break;
            }
        }

    }
}
