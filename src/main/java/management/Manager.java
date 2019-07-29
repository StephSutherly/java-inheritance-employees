package management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String NINum, double salary, String deptName) {
        super(name, NINum, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}