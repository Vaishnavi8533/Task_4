package GuviMaintask4;

import java.util.regex.Pattern;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Voter {
    private final int voterId;
    private final String name;
    private final int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter.");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "voterId=" + voterId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Question4_2_voter {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1, "Krishna", 25);
            System.out.println(voter1);

            Voter voter2 = new Voter(2, "Shravah", 17);
            System.out.println(voter2);

        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}