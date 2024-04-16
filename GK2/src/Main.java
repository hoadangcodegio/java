import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Main {
    public static void main(String[] args) {
        // Tạo và quản lý danh sách nhân viên
        EmployeeManager employeeManager = new EmployeeManager();

        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho nhân viên Experience
        System.out.println("Nhập thông tin cho nhân viên Experience:");
        EmployeeExperience expEmployee = inputExperienceEmployee(scanner);
        employeeManager.addEmployee(expEmployee);

        // Nhập thông tin cho nhân viên Fresher
        System.out.println("Nhập thông tin cho nhân viên Fresher:");
        EmployeeFresher fresherEmployee = inputFresherEmployee(scanner);
        employeeManager.addEmployee(fresherEmployee);

        // Nhập thông tin cho nhân viên Intern
        System.out.println("Nhập thông tin cho nhân viên Intern:");
        EmployeeIntern internEmployee = inputInternEmployee(scanner);
        employeeManager.addEmployee(internEmployee);

        // Hiển thị thông tin của tất cả nhân viên
        System.out.println("Thông tin của tất cả nhân viên:");
        employeeManager.showAllEmployees();

       
        scanner.close();
    }

    // Hàm nhập thông tin cho nhân viên Experience từ bàn phím
    private static EmployeeExperience inputExperienceEmployee(Scanner scanner) {
        System.out.print("ID: ");
        int ID = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự mới (newline) sau khi nhập số
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        // Tiếp tục nhập các thông tin khác cho EmployeeExperience
        return new EmployeeExperience(ID, fullName, new Date(), "123456789", "example@example.com", 5, "Java");
    }

    // Hàm nhập thông tin cho nhân viên Fresher từ bàn phím
    private static EmployeeFresher inputFresherEmployee(Scanner scanner) {
        System.out.print("ID: ");
        int ID = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự mới (newline) sau khi nhập số
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        // Tiếp tục nhập các thông tin khác cho EmployeeFresher
        return new EmployeeFresher(ID, fullName, new Date(), "987654321", "example@example.com", new Date(), "Good", "ABC University");
    }

    // Hàm nhập thông tin cho nhân viên Intern từ bàn phím
    private static EmployeeIntern inputInternEmployee(Scanner scanner) {
        System.out.print("ID: ");
        int ID = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự mới (newline) sau khi nhập số
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        // Tiếp tục nhập các thông tin khác cho EmployeeIntern
        return new EmployeeIntern(ID, fullName, new Date(), "456789123", "example@example.com", "Computer Science", "Fall 2023", "XYZ University");
    }
}