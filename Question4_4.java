package GuviMaintask4;

import java.util.HashMap;
import java.util.Map;

class StudentGrade {
    private Map<String, Integer> studentGradeMap;

    public StudentGrade() {
        studentGradeMap = new HashMap<>();
    }

    public void addStudent(String name, int grade) throws IllegalArgumentException {
        if (name == null || name.isEmpty() || grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Invalid student name or grade.");
        }
        studentGradeMap.put(name, grade);
    }

    public void removeStudent(String name) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid student name.");
        }
        studentGradeMap.remove(name);
    }

    public void displayGrade(String name) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid student name.");
        }
        Integer grade = studentGradeMap.get(name);
        if (grade == null) {
            System.out.println("No student found with name " + name);
        } else {
            System.out.println("Student " + name + " has grade " + grade);
        }
    }
}

public class Question4_4 {
    public static void main(String[] args) {
        StudentGrade studentGrade = new StudentGrade();
        try {
            studentGrade.addStudent("Nisha", 85);
            studentGrade.addStudent("Tamil", 90);
            studentGrade.displayGrade("Kumar");
            studentGrade.removeStudent("Sathya");
            studentGrade.displayGrade("Aarthi");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}