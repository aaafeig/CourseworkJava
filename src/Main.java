public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void upSalary(int index) {
        for (Employee employee : employees) {
            employee.upSalary(index);
        }
    }

    public static void infoAboutPlace(int place) {
        for (Employee employee : employees) {
            if (place == employee.getId()) {

            }

        }
    }

    public static  void getEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static int sumSalary(Employee[] employees) {
    int sumSalary = 0;
        for (Employee employee: employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    public static int findMin(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public static int findMax(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public static float avgSalary(Employee[] employees) {
        int sumSalary = sumSalary(employees);
        int countSalary = employees.length;
        return (float) sumSalary / countSalary;
    }

    public static void printFullName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }



    public static void main(String[] args) {
     employees[0] = new Employee("Ожогин Григорий Андреевич", "1", 78000);
     employees[1] = new Employee("Игнатьева Александра Ростиславовна", "4", 56000);
     employees[2] = new Employee("Трихалкин Артем Васильевич", "4", 50000);
     employees[3] = new Employee("Зубкова Наталья Александровна", "3", 43000);
     employees[4] = new Employee("Смолина Дарья Сергеевна", "3", 50000);
     employees[5] = new Employee("Смолин Александр Сергеевич", "1", 60000);
     employees[6] = new Employee("Иванов Иван Иванович", "2", 35000);
     employees[7] = new Employee("Петров Петр Петрович", "5", 90000);
     employees[8] = new Employee("Сергеев Сергей Сергеевич", "2", 62000);
     employees[9] = new Employee("Александров Даниил Юрьевич", "1", 65000);
     getEmployee(employees);
     System.out.println(sumSalary(employees));
     System.out.println(findMin(employees));
     System.out.println(findMax(employees));
     System.out.println(avgSalary(employees));
     printFullName(employees);
     upSalary(2);
     System.out.println(employees[0].getSalary());
     System.out.println(employees[1].getSalary());
    }
}