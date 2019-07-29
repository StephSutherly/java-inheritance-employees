package management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NINum, double salary, String deptName, double budget) {
        super(name, NINum, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
