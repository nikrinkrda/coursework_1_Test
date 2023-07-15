package employeebook;

public class Employee {
    private final String fullName;
    private int department;
    private float salary;
    private static int idCounter = 1;
    private final int id;

    public Employee(String fullName, int department, float salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника: " + fullName + ", отдел № " + department +
                ", зарплата: " + salary + " руб.";
    }
}
