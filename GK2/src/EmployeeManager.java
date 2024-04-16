import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    // Thêm nhân viên vào danh sách
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Hiển thị thông tin của tất cả nhân viên
    public void showAllEmployees() {
        for (Employee employee : employees) {
            employee.showInfo();
            System.out.println("--------------------");
        }
    }

    // Tìm kiếm nhân viên theo ID
    public Employee findEmployeeByID(int ID) {
        for (Employee employee : employees) {
            if (employee.ID == ID) {
                return employee;
            }
        }
        return null; // Trả về null nếu không tìm thấy nhân viên
    }

    // Xóa nhân viên khỏi danh sách
    public void deleteEmployee(int ID) {
        Employee employee = findEmployeeByID(ID);
        if (employee != null) {
            employees.remove(employee);
        } else {
            System.out.println("Không tìm thấy nhân viên có ID: " + ID);
        }
    }
}
