import java.util.*;

class Student {
    int rollNo;
    String name;
    int mark;
    String grade;
    Student(int rollNo, String name, int mark){
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
        this.grade = gradeFind(mark);

    }
    String gradeFind(int mark){
        if (mark >= 90){
            return "A+";
        } else if (mark >= 80){
            return "A";
        } else if (mark >= 70){
            return "B";
        }  else if (mark >= 60){
            return "C";
        }  else if (mark >= 50){
            return "D";
        }  else {
            return "Failed";
        }
    }

    void DisplayStudents(){
        System.out.println(rollNo + "\t\t" + name + "\t\t"  + mark + "\t\t" + grade + "\t\t");
        
    }
    
}
public class studentsMarkList {
    public static void main(String args []){
        
        Scanner sc = new Scanner(System.in);
        boolean n = true;
        ArrayList<Student> stud = new ArrayList<>();
        do {
            System.out.println("------Choose any option-------\n1.Add Student Details\n2.Display All Students\n3.Search Students by RollNo\n4.Find the student with the highest mark\n5.Exit\n6.Sorted students list by mark");
            int choice = sc.nextInt();
            switch (choice){
                
                case 1:
                    System.out.println("Enter the name of the Student\n");
                    String name = sc.next();
                    System.out.println("Enter the rollno of the student\n");
                    int roll_no = sc.nextInt();
                    System.out.println("Enter the mark of the student\n");
                    int mark = sc.nextInt();
                    stud.add(new Student(roll_no, name, mark));
                    break;
                case 2:
                    if (stud.size() < 1){
                        System.out.println("No student is entry made");
                        break;
                    }
                    System.out.println("-------Student Details-------");
                    System.out.println("RollNo\t\tName\t\tMark\t\tGrade\t\t");
                    for(int i = 0; i < stud.size(); i++){
                        stud.get(i).DisplayStudents();
                        
                    }
                
                    break;
                case 3:
                        System.out.println("Enter the rollno of the student to search");
                        int roll_no_to_find = sc.nextInt();
                        boolean found = false;
                        for(int i = 0; i < stud.size(); i++){
                            Student s = stud.get(i);
                            if(s.rollNo == roll_no_to_find){
                                found = true;
                                System.out.println("RollNo\t\tName\t\tMark\t\tGrade\t\t");
                                s.DisplayStudents();
                                break;
                            }
                        }
                        if (!found){
                            System.out.println("Student doesn't exist");
                            break;
                        }


                    break;
                case 4: 
                    if (stud.size() < 1){
                        System.out.println("No student is entry made");
                        break;
                    }
                    Student highest = Collections.max(stud, Comparator.comparingInt(s -> s.mark));
                    System.out.println("Student with Highest Mark");
                    System.out.println("RollNo\t\tName\t\tMark\t\tGrade\t\t");
                    highest.DisplayStudents();
                    break;
                case 5:
                    n = false;
                    break;
                case 6:
                Collections.sort(
                         stud,
                         Comparator.comparingInt((Student s) -> s.mark)
                                    .thenComparing(s -> s.name)
                );

            for (Student s : stud){
                s.DisplayStudents();
                }

break;
                default : 
                    System.out.println("Invalid option\n");
            }
        } while(n);
    }
}