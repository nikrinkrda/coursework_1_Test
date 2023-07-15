package employeebook;

import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] listEmp = new Employee[10];

    ////// Базовая сложность:
    public void printListOfAllEmployees() { //список всех сотрудников с данными
        for (Employee employee : listEmp) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public float sumSalaryAllEmployees() { //подсчет суммы всех зарплат в месяц
        float sum = 0;
        for (Employee employee : listEmp) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Суммы всех зарплат в месяц: " + sum);
        return sum;
    }

    public Employee findEmployeeWithMinSalary() { //поиск сотрудника с минимальной зарплатой

        Employee value = null;
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : listEmp) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    value = employee;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + value);
        return value;
    }

    public Employee findEmployeeWithMaxSalary() { //поиск сотрудника с максимальной зарплатой
        Employee value = null;
        float maxSalary = Integer.MIN_VALUE;
        for (Employee employee : listEmp) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    value = employee;
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + value);
        return value;
    }

    public double findAverageSalaryAllListEmp() { //подсчет среднего значения зарплат
        double sum = sumSalaryAllEmployees() / listEmp.length;
        System.out.println("Среднее значения зарплат: " + sum);
        return sum;
    }

    public void printFullNameAllEmployees() { //получить Ф.И.О. всех сотрудников
        System.out.println("ФИО всех сотрудников:" + "\n");
        for (Employee employee : listEmp) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    ////// Повышенная сложность:
    public void indexPercentSalary(float percent) { // индексирование зарплаты
        System.out.printf("Индексирование зарплаты у всех сотрудников на %s процентов: \n", percent);
        for (Employee employee : listEmp) {
            if (employee != null) {
                float s = employee.getSalary() + employee.getSalary() * percent / 100;
                employee.setSalary(s);
                System.out.println(employee);
            }
        }
    }

    public Employee findEmpDepartmentWithMinSalary(int department) { //поиск сотрудника отдела с минимальной зарплатой

        Employee value = null;
        double minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < listEmp.length; i++) {
            if (listEmp[i] != null && listEmp[i].getDepartment() == department) {
                if (listEmp[i].getSalary() <= minSalary) {
                    minSalary = listEmp[i].getSalary();
                    value = listEmp[i];
                }
            }
        }
        System.out.println("Сотрудник отдела номер " + department + " с минимальной зарплатой - " + value);
        return value;
    }

    public Employee findEmpDepartmentWithMaxSalary(int department) { //поиск сотрудника отдела с максимальной зарплатой
        Employee value = null;
        float maxSalary = Integer.MIN_VALUE;
        for (Employee employee : listEmp) {
            if (employee != null && employee.getDepartment() == department) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    value = employee;
                }
            }
        }
        System.out.println("Сотрудник отдела номер " + department + " с максимальной зарплатой - " + value);
        return value;
    }

    public float sumSalaryDepartmentEmployees(int department) { //подсчет суммы всех зарплат в месяц по отделу

        float sum = 0;
        for (Employee employee : listEmp) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма всех зарплат в месяц по отделу номер " + department + ": " + sum);
        return sum;
    }

    public float findAverageSalaryDepartmentEmp(int department) { //подсчет среднего значения зарплат по отделу
        int i = 0;
        float sum = 0;
        for (Employee employee : listEmp) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
                i++;
            }
        }
        System.out.println("Среднее значение зарплаты по отделу номер " + department + ": " + sum / i);
        return sum / i;

    }

    public void indexPercentSalaryDepartment(int department, float percent) { // индексирование зарплаты сотрудников отдела
        System.out.printf("Индексирование зарплаты у всех сотрудников %s отдела на %s процентов: \n", department, percent);
        for (Employee employee : listEmp) {
            if (employee != null && employee.getDepartment() == department) {
                float s = employee.getSalary() + employee.getSalary() * percent / 100;
                employee.setSalary(s);
                System.out.println(employee);
            }
        }
    }

    public void printFullEmployeesDepartment(int department) { //напечатать всех сотрудников отдела (кроме номра отдела)
        System.out.println("Список всех сотрудников " + department + "-го отдел: ");
        for (Employee employee : listEmp) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + " " + employee.getSalary());
            }
        }
    }

    public void findSalaryLessNumber(float number) { // Сотрудники с зарплатой меньше заданного числа
        System.out.println("Сотрудники с зарлатой меньше " + number + " руб.: ");
        for (Employee employee : listEmp) {
            if (employee != null) {
                if (employee.getSalary() < number) {
                    System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());
                }
            }
        }
    }

    public void findSalaryMoreNumber(float number) { // Сотрудники с зарлатой больше или равно заданного числа
        System.out.println("Сотрудники с зарлатой больше или равно " + number + " руб.: ");
        for (Employee employee : listEmp) {
            if (employee != null) {
                if (employee.getSalary() >= number) {
                    System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());
                }
            }
        }

    }

    ////// Очень сложно:
    public void addNewEmployee(String fullName, int department, float salary) { // Добавить нового сотрудника
        for (int i = 0; i < listEmp.length; i++) {
            if (listEmp[i] == null) {
                listEmp[i] = new Employee(fullName, department, salary);
                //System.out.println("Сотрудник " + fullName + " добавлен");
                break;
            }
        }
    }

    public void deleteEmployee(String fullName) { // Удалить сотрудника

        for (int i = 0; i < listEmp.length; i++) {
            if (listEmp[i] != null) {
                if (listEmp[i].getFullName().equals(fullName)) {
                    listEmp[i] = null;
                    System.out.println("Сотрудник " + fullName + " удалён");
                    break;
                }
            }
        }
    }

    public void changeEmployeeData(String fullName, int department, float salary) { // изменить сотрудника(получить по ФИО, модернизировать)
        for (Employee employee : listEmp) {                                 // изменить зарплату и отдел
            if (employee != null && employee.getFullName().equals(fullName)) {
                if (salary == 0) {
                    employee.setDepartment(department);
                    System.out.println("Меняем отдел сотрудника: " + fullName + " на " + department
                            + " отдел");
                    break;
                } else if (department == 0) {
                    employee.setSalary(salary);
                    System.out.println("Меняем зарплату сотрудника: " + fullName + " на " + salary
                            + " руб.");
                    break;
                } else {
                    employee.setDepartment(department);
                    employee.setSalary(salary);
                    System.out.println("Меняем зарплату и отдел сотрудника: " + fullName + " на " + department
                            + " отдел с зарплатой " + salary + " руб.");
                    break;
                }
            }
        }
    }

    // перегруз метода changeEmployeeData(String fullName, int department, float salary)
    public void changeEmployeeData(String fullName, int department) {
        changeEmployeeData(fullName, department, 0);
    }

    // перегруз метода changeEmployeeData(String fullName, int department, float salary)
    public void changeEmployeeData(String fullName, float salary) {
        changeEmployeeData(fullName, 0, salary);
    }

    public void printFullNameAllEmployeesDepartments() { //получить Ф.И.О. всех сотрудников по отделам
        String dep1 = "";
        String dep2 = "";
        String dep3 = "";
        String dep4 = "";
        String dep5 = "";
        Employee[] sortListEmp = new Employee[10];
        int k = 0;

        for (int i = 1; i <= 5; i++) { // сортируем по отделам и ложим в другой массив
            for (Employee employee : listEmp) {
                if (employee != null && employee.getDepartment() == i) {
                    sortListEmp[k] = employee;
                    k++;
                }
            }
        }

        for (Employee employee : sortListEmp) {// печатаем списки по отделам
            if (employee != null && employee.getDepartment() == 1) {
                if (dep1.equals("")) {
                    dep1 = "\n" + "Сотрудники " + employee.getDepartment() + "-го" + " отдела: ";
                    System.out.println(dep1);
                }
                System.out.println(employee.getFullName());
            }
            if (employee != null && employee.getDepartment() == 2) {
                if (dep2.equals("")) {
                    dep2 = "\n" + "Сотрудники " + employee.getDepartment() + "-го" + " отдела: ";
                    System.out.println(dep2);
                }
                System.out.println(employee.getFullName());
            }
            if (employee != null && employee.getDepartment() == 3) {
                if (dep3.equals("")) {
                    dep3 = "\n" + "Сотрудники " + employee.getDepartment() + "-го" + " отдела: ";
                    System.out.println(dep3);
                }
                System.out.println(employee.getFullName());
            }
            if (employee != null && employee.getDepartment() == 4) {
                if (dep4.equals("")) {
                    dep4 = "\n" + "Сотрудники " + employee.getDepartment() + "-го" + " отдела: ";
                    System.out.println(dep4);
                }
                System.out.println(employee.getFullName());
            }
            if (employee != null && employee.getDepartment() == 5) {
                if (dep5.equals("")) {
                    dep5 = "\n" + "Сотрудники " + employee.getDepartment() + "-го" + " отдела: ";
                    System.out.println(dep5);
                }
                System.out.println(employee.getFullName());
            }
        }
    }

    // Разделитель:
    public void separator() {
        System.out.println("==================================================================" + "\n");
    }
}
