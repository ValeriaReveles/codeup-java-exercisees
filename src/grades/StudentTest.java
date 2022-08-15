package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[]args) {
        Student Valeria = new Student("Valeria");
        Valeria.addGrade(80);
        Valeria.addGrade(90);
        Valeria.addGrade(100);
        Valeria.addGrade(70);
        Valeria.addGrade(60);
        System.out.println(Valeria.getGradeAverage());
        System.out.println(Valeria.getGrades());

    }
}
