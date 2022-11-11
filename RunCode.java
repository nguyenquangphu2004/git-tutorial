import java.util.ArrayList;
import java.util.Scanner;

public class RunCode {
    public static int index = 0;
    public static int index1 = 0;
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        ArrayList<Subject> subjects = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        boolean check = true;
        while(check) {
            menu();
            int choice = input.nextInt();
            input.nextLine();
            switch(choice) {
                case 1:
                    subjects.add(addSubject(input));
                    index ++;
                    System.out.println("<=== Thêm môn học thành công ===>");
                    break;
                case 2:
                    students.add(addStudent(input));
                    System.out.println("<=== Thêm sinh viên thanh công ===>");
                    break;
                case 3:
                    courses.add(addCourse(input,subjects));
                    break;
                case 5:
                    showSubject(subjects);
                    break;
                case 6:
                    showStudent(students);
                    break;
                case 7:
                    showCourse(courses);
                    break;
                case 8:
                    
                    System.out.println();
                    break;
                    
                default:
                    check = false;
            }
        }
    }
    // phương thức hiển thị các chức năng
    public static void menu() {
        System.out.println("======================================================");
        System.out.println("= 1.Thêm mới một môn học vào ArrayList.              =");
        System.out.println("= 2.Thêm mới sinh viên vào ArrayList.                =");
        System.out.println("= 3.Thêm mới một lớp học.                            =");
        System.out.println("= 5.Hiển thị danh sách môn học.                      =");
        System.out.println("= 6.Hiển thị danh sách sinh viên.                    =");
        System.out.println("= 7.Hiển thị danh sách lớp học.                      =");
        System.out.println("= 8.Nhập điểm và tính điểm trung bình cho sinh viên. =");
        System.out.println("======================================================");
        System.out.printf("Xin mời lựa chon: ");

    }
    // phuong thuc them moi mot mon hoc.
    public static Subject addSubject(Scanner input) {
        System.out.println("Nhập mã môn học: ");
        String id =  input.nextLine();
        System.out.println("Nhập tên môn học: ");
        String name = input.nextLine();
        System.out.println("Nhập số tín chỉ: ");
        int credit = input.nextInt();
        System.out.println("Nhập số tiết học: ");
        int lesson = input.nextInt();
        System.out.println("Nhập số bài kiêm tra: ");
        int test = input.nextInt();
        return new Subject(id,name,credit,lesson,test);
    }
    // Hiên thị danh sách môn học.
    public static void showSubject(ArrayList<Subject> subjects) {
        System.out.println("----------------------------------<Danh sách môn học>-----------------------------------");
        System.out.printf("%-8s %-15s %-15s %-15s %-15s %-20s\n","STT","Mã Môn Học","Tên Môn Học","Số tín chỉ","Số Tiết Học","Số Bài Kiểm Tra");
        for(int i = 0; i < subjects.size(); i++) {
            System.out.printf("%-8d %-15s %-15s %-15d %-15d %-20d\n",(i+1),subjects.get(i).getId(),subjects.get(i).getName(),subjects.get(i).getCredit(),subjects.get(i).getLesson(),subjects.get(i).getLesson());
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }
    // phuong thuc them moi mot sinh vien;
    public static Student addStudent(Scanner input) {
        System.out.println("Mã sinh viên: ");
        String id = input.nextLine();
        System.out.println("Họ và tên: ");
        String fullName = input.nextLine();
        System.out.println("Địa chỉ: ");
        String address = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();
        System.out.println("Giới tính: ");
        String gender = input.nextLine();
        System.out.println("Số điện thoại: ");
        String phone  = input.nextLine();
        System.out.println("Tên lớp: ");
        String nameClass = input.nextLine();
        System.out.println("Khoa: ");
        String major =  input.nextLine();
        return new Student(id,fullName,address,email,gender,phone,nameClass,major);
    }
    public static void showStudent(ArrayList<Student> students) {
        System.out.println("-----------------------------------------------------------------------<Danh sách sinh viên>-----------------------------------------------------------------------------");
        System.out.printf("%-8s %-15s %-20s %-30s %-30s %-8s %-19s %-15s %-15s%s\n","STT","Mã Sinh Viên","Họ Và Tên","Địa Chỉ","Email","Giới","Số Điện Thoại","Tên Lớp","Khoa","|");
        for(int i = 0; i < students.size(); i++) {
            System.out.printf("%-8d %-15s %-20s %-30s %-30s %-8s %-19s %-15s %-15s%s\n",(i+1),students.get(i).getId(),students.get(i).getFullName(),students.get(i).getAddress(),students.get(i).getEmail(),students.get(i).getGender(),students.get(i).getPhone(),students.get(i).getNameClass(),students.get(i).getMajor(),"|");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }
    // phương thức thêm mới một lớp học.
    public static Course addCourse(Scanner input,ArrayList<Subject> subjects) {
        if(index == 0) {
            System.out.println("<=== Môn học rỗng ===>");
            System.out.println("<=== Thêm lớp thất bại ===>");
            return null;
        }
        System.out.println("Mã Lớp: ");
        String id = input.nextLine();
        System.out.println("Tên Khóa học: ");
        String name = input.nextLine();
        System.out.println("Phòng Học: ");
        String room = input.nextLine();
        System.out.println("Thời gian học: ");
        String time = input.nextLine();       
        System.out.println("Nhập mã môn học: ");
        String idSubject = input.nextLine();
        Subject subject = findidSubject(idSubject,subjects);
        if(subject == null) {
            System.out.println("<=== Mã môn không tồn tại ===>");
            System.out.println("<=== Thêm lớp thất bại ===>");
        } 
        else {
            System.out.println("<=== Thêm lớp học thanh công ===>");
            return new Course(id,name,room,time,subject);
        }
        return null;
    }
    private static Subject
     findidSubject(String idSubject, ArrayList<Subject> subjects) {
        for(int i = 0; i < subjects.size(); i++) {
            if(idSubject.compareTo(subjects.get(i).getId()) == 0) {
                return subjects.get(i);
            }
        }
        return null;
    }
    // phuong thuc hien thi lop hoc
    public static void showCourse(ArrayList<Course> courses) {
        System.out.println("--------------------------------------<Danh Sách Lớp Học>------------------------------");
        System.out.printf("%-6s %-15s %-25s %-15s %-10s %-14s\n","STT","Mã Lớp Học","Tên Lớp Học","Phòng Học","Thời Gian","Tên Môn Học");
        for(int i = 0; i < courses.size(); i++) {
            System.out.printf("%-6d %-15s %-25s %-15s %-10s %-14s\n",(i + 1),courses.get(i).getId(),courses.get(i).getNameClass(),courses.get(i).getRoomClass(),courses.get(i).getTime(),courses.get(i).getSubject().getId());
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }
    
    private static void showError(String msg) {
        System.out.println(msg);
    }

}
