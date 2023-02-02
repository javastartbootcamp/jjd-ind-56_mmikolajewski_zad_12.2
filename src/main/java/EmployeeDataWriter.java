import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeDataWriter {

    static void writeDataStatistics(File file, Employee[] employees) throws IOException {
        try (FileWriter fileWriter = new FileWriter(file, false)) {
            fileWriter.write("\nŚrednia wypłata: " + EmployeeExplorer.countAverageSalary(employees));
            fileWriter.write("\nMinimalna wypłata: " + EmployeeExplorer.getMinimumSalary(employees));
            fileWriter.write("\nMaksymalna wypłata: " + EmployeeExplorer.getMaximumSalary(employees));
            fileWriter.write("\nLiczba pracowników IT: " + EmployeeExplorer.numberOfEmployeesInDepartment(employees, "IT"));
            fileWriter.write("\nLiczba pracowników Support: " + EmployeeExplorer.numberOfEmployeesInDepartment(employees, "Support"));
            fileWriter.write("\nLiczba pracowników Management: " + EmployeeExplorer.numberOfEmployeesInDepartment(employees, "Management"));
        }
    }
}
