import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        final String fileName = "employees.csv";
        Employee[] employees;

        File file = new File(fileName);

        try {
            file.createNewFile();
            employees = EmployeeDataReader.readFile(fileName);
            DataPrinter.printData(employees);
        } catch (IOException e) {
            throw new RuntimeException("Nie udało się wczytać pliku");
        }

        if (file.exists()) {
            File stats = new File("stats.txt");
            try {
                stats.createNewFile();
                FileWriter fileWriter = new FileWriter(stats, false);
                fileWriter.write("\nŚrednia wypłata: " + EmployeeExplorer.countAverageSalary(employees));
                fileWriter.write("\nMinimalna wypłata: " + EmployeeExplorer.getMinimumSalary(employees));
                fileWriter.write("\nMaksymalna wypłata: " + EmployeeExplorer.getMaximumSalary(employees));
                fileWriter.write("\nLiczba pracowników IT: " + EmployeeExplorer.numberOfEmployeesInDepartment(employees, "IT"));
                fileWriter.write("\nLiczba pracowników Support: " + EmployeeExplorer.numberOfEmployeesInDepartment(employees, "Support"));
                fileWriter.write("\nLiczba pracowników Management: " + EmployeeExplorer.numberOfEmployeesInDepartment(employees, "Management"));
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException("Nie udało się wczytać pliku");
            }
        }
    }
}
