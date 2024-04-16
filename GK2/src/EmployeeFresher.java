import java.util.Date;

public class EmployeeFresher extends Employee {
    private Date graduationDate;
    private String graduationRank;
    private String education;

    public EmployeeFresher(int ID, String fullName, Date birthDay, String phone, String email, Date graduationDate, String graduationRank, String education) {
        super(ID, fullName, birthDay, phone, email, "Fresher");
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Graduation Date: " + graduationDate);
        System.out.println("Graduation Rank: " + graduationRank);
        System.out.println("Education: " + education);
    }
}