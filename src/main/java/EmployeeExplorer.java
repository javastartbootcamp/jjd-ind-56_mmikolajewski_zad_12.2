public class EmployeeExplorer {
//    średnia wypłata,
//    najniższa wypłata,
//    największa wypłata,
//    liczba pracowników pracujących we wskazanym dziale.

    static double countAverageSalary(Employee[] employees) {
        double avgSalary = 0;
        for (Employee employee : employees) {
            avgSalary += employee.getSalary();
        }
        return avgSalary / employees.length;
    }

    static double getMaximumSalary(Employee[] employees) {
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    static double getMinimumSalary(Employee[] employees) {
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    static int numberOfEmployeesInDepartment(Employee[] employees, String departmentName) {
        int employeesNumber = 0;
        for (Employee employee : employees) {
            if (employee.getDepartmentName().equals(departmentName)) {
                employeesNumber++;
            }
        }
        return employeesNumber;
    }
}
