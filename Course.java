import java.util.ArrayList;
public class Course {
    private String id;
    private String nameClass;
    private String roomClass;
    private String time;
    private Subject subject;
    public Course(String id, String nameClass, String roomClass, String time, Subject subject) {
        this.id = id;
        this.nameClass = nameClass;
        this.roomClass = roomClass;
        this.time = time;
        this.subject = subject;
    }

    private ArrayList<GradeofStudent> gradeofStudents; 
    public Course() {
        id ="";
        nameClass ="";
        roomClass = "";
        time = "";
        subject = null;
        gradeofStudents = new ArrayList<>();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNameClass() {
        return nameClass;
    }
    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
    public String getRoomClass() {
        return roomClass;
    }
    public void setRoomClass(String roomClass) {
        this.roomClass = roomClass;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public Subject getSubject() {
        return subject;
    }
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    public ArrayList<GradeofStudent> getGradeofStudents() {
        return gradeofStudents;
    }
    public void setGradeofStudents(Student student,Grade grade) {
        for (int i = 0; i < gradeofStudents.size(); i++) {
            if(gradeofStudents.get(i).student.getId().compareTo(student.getId()) == 0) {
                gradeofStudents.get(i).grade = grade;
            }
        }
    }
    public class GradeofStudent {
        private Student student;
        private Grade grade;
        public GradeofStudent(Student student, Grade grade) {
            this.student = student;
            this.grade = grade;
        }
        public GradeofStudent() {
        }
        public Student getStudent() {
            return student;
        }
        public void setStudent(Student student) {
            this.student = student;
        }
        public Grade getGrade() {
            return grade;
        }
        public void setGrade(Grade grade) {
            this.grade = grade;
        }   
    }
}
