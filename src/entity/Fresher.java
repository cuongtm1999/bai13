package entity;

import java.util.Date;
import java.util.List;

public class Fresher extends Employee{
    private Date graduation_date;
    private String graduation_rank;
    private String education;

    public Fresher() {
    }

    public Fresher(String id, String fullName, Date birthDay, String phone, String email, String employee_type, List<Certificate> list1, Date graduation_date, String graduation_rank, String education) {
        super(id, fullName, birthDay, phone, email, employee_type, list1);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

//    @Override
//    public String getEmployee_type() {
//        return "Fresher";
//    }

    @Override
    public String toString() {
        return "Fresher{ ID: "+getId()+ " FullName: "+getFullName()+" BirthDay: "+getBirthDay()+" Phone: "+getPhone()+
                " Email: "+getEmail()+" EmployeeType: "+getEmployee_type()+" Certificate: "+list1.toString()+
                " Graduation Date: " + graduation_date +
                " Graduation Rank: " + graduation_rank +
                " Education: "+education +'\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }



    public Date getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(Date graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}