package ExaminationResult;

public class Exam {
	String examType;
	float maxMarks, obtMarks;
	
	
	public Exam(String examType, float maxMarks, float obtMarks) {
		this.examType = examType;
		this.maxMarks = maxMarks;
		this.obtMarks = obtMarks;
	}
	
	 public String getExamType() {
	        return examType;
	    }

	    public float getMarks() {
	        return this.obtMarks;
	    }

	    public float getMaxMarks() {
	        return this.maxMarks;
	    }
	
}
