package MergeSort;

public class Excercise3 {
}
class Employee implements Comparable <Employee>{
    private String id;
    private FullName fullName;
    private float salary;

    public Employee(String id, String fullName, float salary) {
        this.fullName = new FullName();
        this.id = id;
        setFullName(fullName);
        this.salary = salary;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public FullName getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        String[] words = fullName.split("\\s+");
        this.fullName.setFirst(words[words.length - 1]);
        this.fullName.setLast(words[0]);
        String middle = "";
        for(int i = 1; i < words.length - 1; i++) {
            middle += words[i];
        }
        this.fullName.setMid(middle.trim());
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee o) {
        if(salary > o.salary) {
            return 1;
        } else if(salary == o.salary) {
            if(fullName.first.compareTo(o.fullName.first) < 0) {
                return 1;
            } else {
                return (fullName.last.compareTo(o.fullName.last) < 0) ? 1 : 0;
            }
        }
        return 0;
    }
    private class FullName {
        private String mid;
        private String first;
        private String last;

        public String getMid() {
            return mid;
        }
        public void setMid(String mid) {
            this.mid = mid;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }
        public void setLast(String last) {
            this.last = last;
        }
    }
}
