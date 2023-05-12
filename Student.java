public class Student{
    private String studentName;
    private String deptName;
    private String courseName;
    private int pastGrade;
    private int admissionFee;

    public Student(){
        this.studentName="";
        this.deptName="";
        this.courseName="";
        this.pastGrade=0;
        this.admissionFee=0;
    }

    public Student(String studentName, String deptName, String courseName, int pastGrade, int admissionFee){
        this.studentName=studentName;
        this.pastGrade=pastGrade;
        this.admissionFee=admissionFee;
        this.deptName=deptName;
        this.courseName=courseName;
    }

    public String getStudentName(String s) {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDeptName(String s) {
        return deptName;
    }

    public String setDeptName(String deptName) {
        this.deptName = deptName;
        return deptName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String setCourseName(String courseName) {
        this.courseName = courseName;
        return courseName;
    }

    public int getPastGrade() {
        return pastGrade;
    }

    public void setPastGrade(int pastGrade) {
        this.pastGrade = pastGrade;
    }

    public int getAdmissionFee() {
        return admissionFee;
    }

    public int setAdmissionFee(int admissionFee) {
        this.admissionFee = admissionFee;
        return admissionFee;
    }

    public String toString() {
        return "Name: " + studentName  + "\nPast Grade: " + pastGrade + "\nadmissionFees " + admissionFee + "\ndepartment name" +deptName +"\nCourse name"+courseName +"\n";
    }

}
