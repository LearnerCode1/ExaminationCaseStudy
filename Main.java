package ExaminationResult;

public class Main {
    public static void main(String[] args) {
        // Create theory and lab exams for optional courses
        Exam physicsTheory = new Exam("Theory", 70, 60);  // out of 70 marks
        Exam physicsLab = new Exam("Lab", 30, 25);  // out of 30 marks

        Exam chemistryTheory = new Exam("Theory", 70, 65);
        Exam chemistryLab = new Exam("Lab", 30, 28);

        Exam mathTheory = new Exam("Theory", 100, 90);  // Math doesn't have a lab exam

        // Optional courses: Physics, Chemistry, Math
        Course physics = new Course("OC101", "Physics", "Optional", physicsTheory, physicsLab);
        Course chemistry = new Course("OC102", "Chemistry", "Optional", chemistryTheory, chemistryLab);
        Course math = new Course("OC103", "Math", "Optional", mathTheory, null);  // No lab exam for math

        // Create theory and lab exams for compulsory courses
        Exam englishTheory = new Exam("Theory", 100, 85);  // English has only theory exam
        Exam computerTheory = new Exam("Theory", 60, 50);  // out of 60
        Exam computerLab = new Exam("Lab", 40, 35);  // out of 40

        // Compulsory courses: English, Computer
        Course english = new Course("CC101", "English", "Compulsory", englishTheory, null);
        Course computer = new Course("CC102", "Computer", "Compulsory", computerTheory, computerLab);

        // Enroll student in courses (array)
        Course[] courses = {physics, chemistry, math, english, computer};

        // Create student and display result
        Student student = new Student("S101", "John Doe", courses);
        student.displayResult();
    }
}
