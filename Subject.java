public class Subject {
    private String id;
    private String name;
    private int credit;
    private int lesson;
    private int test;
    public Subject() {

    }
    public Subject(String id, String name, int credit, int lesson, int test) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.lesson = lesson;
        this.test = test;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        if(!id.isEmpty()) {
            System.out.println("Mã không hợp lệ.");
        }
        else {
            this.id = id;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public int getLesson() {
        return lesson;
    }
    public void setLesson(int lesson) {
        this.lesson = lesson;
    }
    public int getTest() {
        return test;
    }
    public void setTest(int test) {
        this.test = test;
    }
    
    


}
