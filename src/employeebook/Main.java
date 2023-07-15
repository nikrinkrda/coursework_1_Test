package employeebook;

import employeebook.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeBook b = new EmployeeBook();

        b.addNewEmployee("Петров Петр Петрович", 2, 40000); // Добавить нового сотрудника
        b.addNewEmployee("Иванов Иван Иванович", 3, 50000);
        b.addNewEmployee("Васечкин Василий Васильевич", 1, 30000);
        b.addNewEmployee("Пупкин Петр Иванович", 2, 48000);
        b.addNewEmployee("Сидоров Сидор Сидорович", 5, 70000);
        b.addNewEmployee("Чайников Сергей Сергеевич", 2, 45000);
        b.addNewEmployee("Бузов Бузок Бузович", 1, 32000);
        b.addNewEmployee("Прохоров Прохор Прохорович", 4, 64000);
        b.addNewEmployee("Пушкин Иван Васильевич", 3, 55000);
        b.addNewEmployee("Нежданов Николай Владимирович", 4, 67000);

        b.printListOfAllEmployees(); //список всех сотрудников с данными
        b.separator();
        b.sumSalaryAllEmployees(); //подсчет суммы всех зарплат в месяц
        b.separator();
        b.findEmployeeWithMinSalary();  //поиск сотрудника с минимальной зарплатой
        b.separator();
        b.findEmployeeWithMaxSalary(); //поиск сотрудника с максимальной зарплатой
        b.separator();
        b.findAverageSalaryAllListEmp(); //подсчет среднего значения зарплат
        b.separator();
        b.printFullNameAllEmployees(); //получить Ф.И.О. всех сотрудников
        b.separator();
        b.indexPercentSalary(10); // индексирование зарплаты
        b.separator();
        b.findEmpDepartmentWithMinSalary(2); //поиск сотрудника отдела с минимальной зарплатой
        b.separator();
        b.findEmpDepartmentWithMaxSalary(2); //поиск сотрудника отдела с максимальной зарплатой
        b.separator();
        b.sumSalaryDepartmentEmployees(2);  //подсчет суммы всех зарплат в месяц по отделу
        b.separator();
        b.findAverageSalaryDepartmentEmp(2); //подсчет среднего значения зарплат по отделу
        b.separator();
        b.indexPercentSalaryDepartment(2, 10); // индексирование зарплаты сотрудников отдела
        b.separator();
        b.printFullEmployeesDepartment(2); //напечатать всех сотрудников отдела (кроме номра отдела)
        b.separator();
        b.findSalaryLessNumber(55000); // Сотрудники с зарплатой меньше заданного числа
        b.separator();
        b.findSalaryMoreNumber(55000); // Сотрудники с зарлатой больше или равно заданного числа
        b.separator();
        b.deleteEmployee("Иванов Иван Иванович"); // Удалить сотрудника
        b.separator();
        b.changeEmployeeData("Пупкин Петр Иванович", 5, 75000); // изменить сотрудника(получить по ФИО, модернизироват
        // изменить зарплату и отдел
        b.separator();
        b.changeEmployeeData("Пупкин Петр Иванович", 4); // перегруз метода changeEmployeeData(String fullName, int department, float salary)
        // меняем только отдел
        b.separator();
        b.changeEmployeeData("Пупкин Петр Иванович", 85000f); // перегруз метода changeEmployeeData(String fullName, int department, float salary)
        // меняем только зарплату
        b.separator();
        b.printFullNameAllEmployeesDepartments(); //получить Ф.И.О. всех сотрудников по отделам
        b.separator();
    }
}