
/*
 Write a Java program to create a class called Employee with private instance variables
 employee_id, employee_name, and employee_salary.
Provide public getter and setter methods to access and modify the id and name variables,
and salary variable
and display the details of employee in a formatted String
 */

public class Employee1 {

    public static void main(String[] args) {
        ok obj1 = new ok();

      
        obj1.setEmpId(123);
        obj1.setEmpName("Harshal");
        obj1.setEmpSalary(50000);

        
        System.out.println(obj1.getEmpId());
        System.out.println(obj1.getEmpName());
        System.out.println(obj1.getEmpSalary());

    }
}

class ok {

    private int empId;
    private String empName;
    private int empSalary;
    
    public int getEmpId() {
        return empId;
    }public int getEmpSalary() {
        return empSalary;
    }
    public String getEmpName() {
        return empName;
    }


    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

  
   
}
