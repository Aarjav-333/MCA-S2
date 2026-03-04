
public class ArrayOfObj {
    public static void main(String[] args) {

        Student[] students = {
            new Student(1, "Aishu"),
            new Student(2, "Rahul"),
            new Student(3, "Sneha")
        };

        for (Student s : students) {
            s.display();
        }
    }
}

class Student {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}

