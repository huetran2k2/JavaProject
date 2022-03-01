import java.util.*;
public class Employee{

    private String employeeID, name, phoneNumber,position,startWork;
    private String gender;
    float salary;
    protected int basicSalary;
    float overtime;
    Scanner scanner = new Scanner(System.in);

    public Employee() {
    }

    public Employee(String employeeID, String name,String gender, String phoneNumber,String position, String startWork, 
        int basicSalary, float overtime) {
        this.employeeID = employeeID;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.position= position;
        this.setStartWork(startWork);
        this.basicSalary = basicSalary;
        this.setOvertime(overtime);
        salaryCalculation();
    }
 
    public String getemployeeID() {
        return employeeID;
    }
 
    public void setemployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
 
    public String getname() {
        return name;
    }
 
    public void setname(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
 
    public String getphoneNumber() {
        return phoneNumber;
    }
 
    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStartWork() {
        return startWork;
    }


    public void setStartWork(String startWork) {
        this.startWork = startWork;
    }
 
    public Float getsalary() {
        return salary;
    }
 
    public void setsalary(Float salary) {
        this.salary = salary;
    }
 
    public int getbasicSalary() {
        return basicSalary;
    }
 
    public void setbasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
    public float getOvertime() {
        return overtime;
    }

    public void setOvertime(float overtime) {
        this.overtime = overtime;
    }

    public void inputEmployee() {
        System.out.print("Enter employee id: ");
        employeeID = scanner.nextLine();
        System.out.print("Enter employee name: ");
        name = scanner.nextLine();
        System.out.print("Enter gender: ");
        gender = scanner.nextLine();
        System.out.print("Enter the employee's phone number: ");
        phoneNumber = scanner.nextLine();
        System.out.print("Enter position of employee: ");
        position = scanner.nextLine();
        System.out.print("Enter the employee's start date: ");
        startWork = scanner.nextLine();
        System.out.print("Enter basic salary: ");
        basicSalary = scanner.nextInt();
        System.out.print("Enter overtime of employee: ");
        overtime = scanner.nextFloat();
        salaryCalculation();
    }

    public void salaryCalculation() {
        this.salary = this.basicSalary + this.overtime * 500;
    }
     
    @Override
    public String toString() {
        return "Employee id: " + this.employeeID + "\nEmployee name: " + this.name +"\nGender: "+ this.gender +
        "\nPhone number: " + this.phoneNumber +"\nPosition: "+this.position+ "\nDate start work: "+this.startWork
        +"\nBasic salary: " + this.basicSalary + "\nOvertime: " + this.overtime + "\nFinal salary: " + this.salary;

    }
}
