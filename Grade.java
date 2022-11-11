public class Grade {
    private String id;
    private double grade1;
    private double grade2;  
    private double grade3;
    private double avrGrade;
    private Study study;
    
    public Grade(String id, double grade1, double grade2, double grade3, double avrGrade) {
        this.id = id;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.avrGrade = avrGrade;
    }
    public Grade() {
        id = "";
        grade1 = 0;
        grade2 = 0;
        grade3 = 0;
        avrGrade = 0;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getGrade1() {
        return grade1;
    }
    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }
    public double getGrade2() {
        return grade2;
    }
    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }
    public double getGrade3() {
        return grade3;
    }
    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }
    public Study getStudy() {
        return study;
    }
    public void study() {
        if(getAvrGrade() < 4.0) {
            this.study = Study.F;
        } else if(getAvrGrade() >= 4.0 && getAvrGrade() < 5.0 ) {
            this.study = Study.D;
        } else if(getAvrGrade() >= 5.0 && getAvrGrade() < 6.5) {
            this.study = Study.C;
        } else if(getAvrGrade() >= 6.5 && getAvrGrade() < 8.0) {
            this.study = Study.B;
        } else if(getAvrGrade() >= 8.0 && getAvrGrade() < 9.0) {
            this.study = Study.A;
        } else if(getAvrGrade() >= 9.0 & getAvrGrade() <= 10) {
            this.study = Study.A_Plus;
        }
    }
    public double getAvrGrade() {
        return avrGrade;
    }
    public void avrGrades() {
        this.avrGrade = (getGrade1() + getGrade2() * 2 + getGrade3() * 3) / 6;
    }
    
    

    
}
