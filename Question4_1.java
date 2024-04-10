
package GuviMaintask4;

import java.util.regex.Pattern;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private final int rollNo;
    private final String name;
    private final int age;
    private final String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Invalid age. Age must be between 15 and 21.");
        }

        if (!Pattern.matches("[a-zA-Z\\s]+", name)) {
            throw new NameNotValidException("Invalid name. Name cannot contain numbers or special characters.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                  "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
              ", course='" + course + '\'' +
                '}';
    }
}

public class Question4_1 {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "Kumar", 34, "Computer Science");
            System.out.println(student1);

            Student student2 = new Student(2, "Satya", 15, "Electrical Engineering");
            System.out.println(student2);

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.err.println(e.getMessage());
        }
    }
}
