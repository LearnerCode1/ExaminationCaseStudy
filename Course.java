package ExaminationResult;

public class Course {
	String courseId, courseName, courseType;
	String examList[];
	Exam theoryExam, labExam;
	public Course(String courseId, String courseName, String courseType, Exam theoryExam, Exam labExam) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseType = courseType;
		this.theoryExam = theoryExam;
		this.labExam = labExam;
	}
	
	public float getTotalMarks() {
		float total = theoryExam.getMarks();
		if(labExam != null) {
			total += labExam.getMarks();
		}
		
		return total;
	}
}
