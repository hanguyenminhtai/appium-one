package lab_9;

public abstract class EmpAbs {
    private int salary;

    public EmpAbs() {
    }

    public abstract int getSalary();

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
