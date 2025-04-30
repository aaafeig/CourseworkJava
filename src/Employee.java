public class Employee {
    private static int plusId = 1;
    private final int id;
    private final String  fullName;
    private int salary;
    private String placeWork;


    public Employee(String fullName, String placeWork, int salary) {
        this.fullName = fullName;
        this.placeWork = placeWork;
        this.salary = salary;
        id = plusId++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public int getId() {
        return id;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО " + fullName + ", место работы: " + placeWork + ", зарплата: " + salary + ", id: " + id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Employee c2 = (Employee) other;
        return fullName.equals(c2.fullName) && placeWork.equals(c2.placeWork);
    }

    @Override
    public int hashCode() {
        return  java.util.Objects.hash(fullName, placeWork);
    }
}
