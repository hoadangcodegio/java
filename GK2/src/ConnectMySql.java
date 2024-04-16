import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.List;
public class ConnectMySql {
	public static void writeToDatabase(List<Employee> employees) {
	String connectionUrl = "jdbc:mysql://localhost:3306/SinhVien?user=hoa11&password=hoa180405";
	try (Connection connection = DriverManager.getConnection(connectionUrl)) {
		 String insertQuery = "INSERT INTO Employee (ID, FullName, BirthDay, Phone, Email, Employee_type) VALUES (?, ?, ?, ?, ?, ?)";
         for (Employee employee : employees) {
             try (PreparedStatement pS = connection.prepareStatement(insertQuery)) {
                 pS.setInt(1, employee.getID());
                 pS.setString(2, employee.getFullName());
                 pS.setDate(3, new Date(employee.getBirthDay().getTime()));
                 pS.setString(4, employee.getPhone());
                 pS.setString(5, employee.getEmail());
                 pS.setString(6, employee.getEmployeeType());
                 pS.executeUpdate();
             }
         }
         System.out.println("Đã ghi danh sách nhân viên vào cơ sở dữ liệu.");
	}
	catch (SQLException e) {

	    e.printStackTrace();
	}
}

}