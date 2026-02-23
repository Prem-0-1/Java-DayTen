class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class UniversityGradingSystem {

    static class Student {
        private String name;
        private int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public String assignGrade() throws InvalidMarksException {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks should be between 0 and 100.");
            }

            if (marks >= 90) return "A";
            else if (marks >= 75) return "B";
            else if (marks >= 60) return "C";
            else if (marks >= 50) return "D";
            else return "F";
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 85);
        Student s2 = new Student("Anita", 110);

        try {
            System.out.println("Grade of Rahul: " + s1.assignGrade());
            System.out.println("Grade of Anita: " + s2.assignGrade());
        } 
        catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}