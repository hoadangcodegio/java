import java.util.Date;

public class EmployeeExperience extends Employee {
    private int expInYear;
    private String proSkill;

    public EmployeeExperience(int ID, String fullName, Date birthDay, String phone, String email, int expInYear, String proSkill) {
        super(ID, fullName, birthDay, phone, email, "Experience");
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Years of Experience: " + expInYear);
        System.out.println("Professional Skill: " + proSkill);
    }
}