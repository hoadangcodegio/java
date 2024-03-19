
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học viên: ");
        int n = scanner.nextInt();

        List<String> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học viên thứ " + (i + 1) + ":");
            System.out.print("Mã sinh viên: ");
            String maSV = scanner.next();
            System.out.print("Họ tên: ");
            String hoTen = scanner.next();
            System.out.print("Giới tính: ");
            String gioiTinh = scanner.next().toLowerCase();
            System.out.print("Điểm Python: ");
            double diemPython = scanner.nextDouble();
            System.out.print("Điểm Java: ");
            double diemJava = scanner.nextDouble();

            students.add((maSV + ","+ hoTen + ","+ gioiTinh + ","+ diemPython + ","+ diemJava));
        }

        // Ghi danh sách học viên ra file
        try (PrintWriter writer = new PrintWriter("input.txt")) {
            for (String student : students) {
                writer.println(student.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Đọc dữ liệu từ file
        List<Student> studentsFromFile = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                studentsFromFile.add(new Student(parts[0], parts[1], parts[2], Double.parseDouble(parts[3]), Double.parseDouble(parts[4])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sắp xếp học viên theo điểm trung bình giảm dần
        studentsFromFile.sort(Comparator.comparingDouble(Student::getAvg).reversed());

        // In thông tin học viên và ghi ra file
        System.out.println("Danh sách học viên sau khi sắp xếp:");
        try (PrintWriter writer = new PrintWriter("output.txt")) {
            for (Student student : studentsFromFile) {
                System.out.println(student);
                writer.println(student.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Nhập họ tên học viên cần tìm
        System.out.print("Nhập họ tên học viên cần tìm: ");
        String searchName = scanner.next();

        // Tìm kiếm học viên theo họ tên
        boolean found = false;
        System.out.println("Danh sách học viên có họ tên \"" + searchName + "\":");
        for (Student student : studentsFromFile) {
            if (student.getName().equals(searchName)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học viên có họ tên \"" + searchName + "\".");
        }

        // Hiển thị thông tin những bạn đã đậu và những bạn đã trượt
        System.out.println("Danh sách học viên đã đậu:");
        for (Student student : studentsFromFile) {
            if (student.getResult().equals("Dau")) {
                System.out.println
                (student);
            }
        }

        System.out.println("Danh sách học viên đã trượt:");
        for (Student student : studentsFromFile) {
            if (student.getResult().equals("Truot")) {
                System.out.println(student);
            }
        }
        System.out.println("Danh sách học viên điểm tb > 8 ");
        for (Student student : studentsFromFile) {
            if (student.getAvg() > 8) {
                System.out.println(student);
            }
        }
    }}