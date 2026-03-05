 class MultiLVL {
    public static void main(String[] args) {

        Manager obj = new Manager();

        obj.displayName();        
        obj.displaySalary();      
        obj.displayDepartment();  
    }
}


class Person {
    void displayName() {
        System.out.println("Name: Karthika");
    }
}

class Employee extends Person {
    void displaySalary() {
        System.out.println("Salary: 50000");
    }
}

class Manager extends Employee {
    void displayDepartment() {
        System.out.println("Department: IT");
    }
}

