package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
//  We'll start by defining a hash map
        HashMap<String, String> students = new HashMap<>();


        Student kat = new Student("Kat Von D");
        kat.addGrade(60);
        kat.addGrade(50);
        kat.addGrade(100);

        students.put("Kat Von D", "madkatter33");

        Student jerry = new Student("Jerry");
        jerry.addGrade(70);
        jerry.addGrade(89);
        jerry.addGrade(95);

        students.put("Jerry", "jerryboi2020");

        Student steve = new Student("Steve");
        steve.addGrade(70);
        steve.addGrade(89);
        steve.addGrade(95);

        students.put("Steve", "stevejackass");

        Student valeria = new Student("Valeria");
        valeria.addGrade(100);
        valeria.addGrade(90);
        valeria.addGrade(95);

        students.put("Valeria", "ratcheta12");

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.get("Steve"));
        System.out.println(userNamesToString(students));


    }

    public static String userNamesToString(HashMap students) {
        String usernames = "";
        for (Object value : students.values()) {
            usernames += "| " + value + " | ";
        }
        return usernames;
    }
}
