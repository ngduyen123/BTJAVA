import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private double salaryRate;

    public Employee(int id, String name, int age, String department, String code, double salaryRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryRate = salaryRate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getCode() {
        return code;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", code='" + code + '\'' +
                ", salaryRate=" + salaryRate +
                '}';
    }
}

public class EmployeeManagementApp {
    private List<Employee> employees;

    public EmployeeManagementApp() {
        employees = new ArrayList<>();
    }

    public void displayEmployees() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void removeEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementApp app = new EmployeeManagementApp();

        // Khởi tạo 10 nhân viên
        app.addEmployee(new Employee(1, "NGUYEN VAN AN", 25, "GIAO VIEN", "MS1", 1000));
        app.addEmployee(new Employee(2, "TRAN LAN ANH", 35, "BAC SI", "MS2", 5000));
        app.addEmployee(new Employee(3, "PHAM VAN BINH", 30, "NV NGAN HANG", "MS3", 2000));
        app.addEmployee(new Employee(4, "TRAN THI DUNG", 28, "KE TOAN", "MS4", 2600.0));
        app.addEmployee(new Employee(5, "PHAM VAN DUONG", 31, "KE TOAN", "MS5", 2700.0));
        app.addEmployee(new Employee(6, "NGUYEN HOANG HA", 26, "NHAN SU", "MS6", 2600));
        app.addEmployee(new Employee(7, "NGUYEN VAN MINH", 29, "LUAT SU", "MS7", 3000));
        app.addEmployee(new Employee(8, "PHAM THI LINH", 33, "BAO HIEM", "MS8", 2800));
        app.addEmployee(new Employee(9, "HOANG THI THU", 30, "IT", "MS9", 2800));
        app.addEmployee(new Employee(10, "CAO THI YEN", 23, "GIA SU", "MS10", 2400));

        // Hiển thị danh sách 10 nhân viên
        app.displayEmployees();

        // Thêm một nhân viên mới vào danh sách
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự new line
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự new line
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Salary Rate: ");
        double salaryRate = scanner.nextDouble();

        app.addEmployee(new Employee(id, name, age, department, code, salaryRate));

        // Xóa một nhân viên từ danh sách
        System.out.print("Enter employee ID to remove: ");
        int removeId = scanner.nextInt();
        app.removeEmployee(removeId);

    }
}