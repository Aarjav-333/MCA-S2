import java.util.*;

class Employee {
    int empId;
    String name;
    double salary;
    String dept;
    Employee(int empId, String name, double salary, String dept){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    void displayEmployees(){
        System.out.println(empId + "\t" + name + "\t" + salary + "\t" + dept);
    }
}


public class EmployeeSalaryMgmt {

    static void AskUser(Scanner sc, ArrayList<Employee> emp){
        boolean n = true;
        do {
            System.out.println("---Choose any of the option---");
            System.out.println("1. Add Employees");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Display employees sorted by salary");
            
            System.out.println("5. Exit ");
            System.out.println("6. Highest Salary Employee");
            int choice = sc.nextInt();
        


        switch (choice){
            case 1:
                System.out.println("Enter the Id of the employee");
                int emp_id = sc.nextInt();
                System.out.println("Enter the name of the employee");
                String name = sc.next();
                System.out.println("Enter the salary of the employee");
                double salary = sc.nextDouble();
                System.out.println("Enter the Department of the employee");
                String dept = sc.next();


                emp.add(new Employee(emp_id, name, salary, dept));
                break;
            case 2:
                if (emp.size() == 0 ){
                    System.out.println("No employees have been added");
                    break;
                }
                System.out.println("EmpId\tName\tSalary\tDept");
                for(int i = 0; i < emp.size(); i++){
                    emp.get(i).displayEmployees();
                }
                break;
            case 3:
                if(emp.size() == 0){
                    System.out.println("No employees have been added");
                    break;
                }

                System.out.println("Enter the EMP ID to search");
                int emp_id_search = sc.nextInt();
                
                for(int i = 0; i < emp.size(); i++){
                    Employee e = emp.get(i);

                    if(e.empId == emp_id_search){
                        System.out.println("EmpId\tName\tSalary\tDept");
                        e.displayEmployees();
                    }
                }
                break;
            case 4:
                ArrayList<Employee> employee_clone = new ArrayList<>(emp);

                Collections.sort(employee_clone, Comparator.comparingDouble((Employee e) -> e.salary).thenComparing(e -> e.name));
                System.out.println("EmpId\tName\tSalary\tDept");
                for(Employee e : employee_clone){
                    e.displayEmployees();
                }
                break;
            case 5:
                n = false;
                break;
            
            case 6:
                Employee highestSalary = Collections.max(emp, Comparator.comparingDouble((Employee e) -> e.salary));
                System.out.println("Employee with the highest salary:");
                System.out.println("EmpId\tName\tSalary\tDept");
                highestSalary.displayEmployees();
                break;

                default : 
                System.out.println("Invalid option");
                break;
        }
        } while(n);

    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> emp = new ArrayList<>();

        AskUser(sc, emp);

    }
}