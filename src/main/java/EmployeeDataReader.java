import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDataReader {
    static Employee[] readFile(String fileName) throws FileNotFoundException {
        final int linesNumber = countLines(fileName);
        Employee[] employees = new Employee[linesNumber];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            for (int i = 0; i < employees.length; i++) {
                String csvLine = scanner.nextLine();
                employees[i] = createEmployeeFromCsv(csvLine);
                
            }
        }
        return employees;
    }

    //Jan;Kowalski;123456789;Management;6000
    private static Employee createEmployeeFromCsv(String csvLine) {
        String[] data = csvLine.split(";");
        String firstName = data[0];
        String lastName = data[1];
        String id = data[2];
        String department = data[3];
        double salary = Double.parseDouble(data[4]);
        return new Employee(firstName, lastName, id, department, salary);
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        int lines = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lines++;
            }
        }
        return lines;
    }
}
