package FourthdayJava;

public class RRTechnicalCertification implements Certification {
	public static int coutner=0;
 private String studentName;
 private String courseName;
 private int registrationId;
 private int admissionTesrMarks;
 
 RRTechnicalCertification(String studentName,String courseName,String courseName)
 {
	 this.studentName=studentName;
	 this.courseName=courseName;
	 this.courseName=courseName;
 }

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public int getRegistrationId() {
	return registrationId;
}

public void setRegistrationId(int registrationId) {
	this.registrationId = registrationId;
}

public int getAdmissionTesrMarks() {
	return admissionTesrMarks;
}

public void setAdmissionTesrMarks(int admissionTesrMarks) {
	this.admissionTesrMarks = admissionTesrMarks;
}
 
 
}
