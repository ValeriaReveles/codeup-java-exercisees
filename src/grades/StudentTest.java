package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[]args) {
        Student valeria = new Student("Valeria");
        valeria.addGrade(80);
        valeria.addGrade(90);
        valeria.addGrade(100);
        System.out.println(valeria.getName() + "'s grade average is " + valeria.getGradeAverage());
        System.out.println(valeria.getName() + "'s grades for the semester were " + valeria.getGrades());

        Student draco = new Student("Draco");
        draco.addGrade(60);
        draco.addGrade(50);
        draco.addGrade(100);
        System.out.println(draco.getName() + "'s grade average is " + draco.getGradeAverage());
        System.out.println(draco.getName() + "'s grades for the semester were: " + draco.getGrades());

        Student ron = new Student("Ron");
       ron.addGrade(70);
       ron.addGrade(89);
       ron.addGrade(95);
        System.out.println(ron.getName() + "'s grade average is " + ron.getGradeAverage());
        System.out.println(ron.getName() + "'s grades for the semester were: " + ron.getGrades());
    }
}
