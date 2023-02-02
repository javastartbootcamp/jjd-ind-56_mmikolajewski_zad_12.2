import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static final String FILE_NAME = "employees.csv";

    public static void main(String[] args) {

        Employee[] employees;

        File file = new File(FILE_NAME);

        try {
            file.createNewFile();
            employees = EmployeeDataReader.readFile(FILE_NAME);
            DataPrinter.printData(employees);
        } catch (IOException e) {
            throw new RuntimeException("Nie udało się wczytać pliku");
        }

        if (employees.length == 0) {
            System.out.println("Brak pracowników");
            return;
        }

        if (file.exists()) {
            File stats = new File("stats.txt");
            try {
                stats.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(" Nie udało się utworzyć pliku");
            }
            try {
                EmployeeDataWriter.writeDataStatistics(stats, employees);
            } catch (IOException e) {
                throw new RuntimeException("Nie udało się zapisać danych");
            }
        }
    }
}
