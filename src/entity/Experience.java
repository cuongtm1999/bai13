package entity;

import java.util.Date;
import java.util.List;

public class Experience extends Employee{
    private int expInYear;
    private String proSkill;

    public Experience() {
        super();
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{ ID: "+getId()+ " FullName: "+getFullName()+" BirthDay: "+getBirthDay()+" Phone: "+getPhone()+
                " Email: "+getEmail()+" EmployeeType: "+getEmployee_type()+" Certificate: "+list1.toString()+
                " Nam kinh nghiem: " + expInYear +
                " Skill: " + proSkill + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }


    @Override
    public String getEmployee_type() {
        return "Experience";
    }

    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(String id, String fullName, Date birthDay, String phone, String email, String employee_type, List<Certificate> list1, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employee_type, list1);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
}
