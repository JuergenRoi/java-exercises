import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.addEmployee(new Employee(1, "John Doe", "Developer", 60000));
        ems.addEmployee(new Employee(2, "Jane Smith", "Manager", 80000));

        System.out.println("Employees List:");
        ems.displayEmployees();

        ems.removeEmployee(1);

        System.out.println("\nEmployees List after removal:");
        ems.displayEmployees();
    }
}
