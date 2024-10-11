package ExaminationResult;

public class Student {
	String studentId;
	String name;
	Course[] courses;
	String grade;
	
	public Student(String studentId, String name, Course[] courses) {
		this.studentId = studentId;
		this.name = name;
		this.courses = courses;
		this.grade = calculateGrade();
	}
	
	private String calculateGrade() {
		float totalMarks = 0;
		float maxTotalMarks = 0;
		
		for(int i=0;i<courses.length;i++) {
			totalMarks += courses[i].getTotalMarks();
            maxTotalMarks += courses[i].theoryExam.getMaxMarks();
            if (courses[i].labExam != null) {
                maxTotalMarks += courses[i].labExam.getMaxMarks();
            }
		}
		double percentage = (totalMarks * 100.0) / maxTotalMarks;

        if (percentage >= 80) {
            return "Honours";
        } else if (percentage >= 60) {
            return "First Division";
        } else if (percentage >= 48) {
            return "Second Division";
        } else if (percentage >= 40) {
            return "Third Division";
        } else {
            return "Failed";
        }
	}
	
	public void displayResult() {
        System.out.println("Student: " + name);
        System.out.println("Total Percentage: " + calculateGrade());
        System.out.println("Grade: " + grade);
    }
}
