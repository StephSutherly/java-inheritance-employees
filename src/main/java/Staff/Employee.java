package Staff;

public abstract class Employee {

    private String name;
    private String NINum;
    private double salary;

    public Employee(String name, String NINum, double salary) {
        this.name = name;
        this.NINum = NINum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINum() {
        return NINum;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double raiseAmount) {
        if (raiseAmount > 0) {
            return salary + raiseAmount;
        }
        else {
            return salary;
        }
    }

    public double payBonus() {
        return salary * 0.01;
    }

    public void setName(String name) {
        if ((name).length() > 1) {
            this.name = name;
        }
    }
}

