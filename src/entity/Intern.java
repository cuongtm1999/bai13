package entity;

import java.util.Date;
import java.util.List;

public class Intern extends Employee{
    private String majors;
    private String university_name;
    private int semester;
    public Intern() {
    }

    public Intern(String id, String fullName, Date birthDay, String phone, String email, String employee_type, List<Certificate> list1, String majors, String university_name, int semester) {
        super(id, fullName, birthDay, phone, email, employee_type, list1);
        this.majors = majors;
        this.university_name = university_name;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Intern{ ID: "+getId()+ " FullName: "+getFullName()+" BirthDay: "+getBirthDay()+" Phone: "+getPhone()+
                " Email: "+getEmail()+" EmployeeType: "+getEmployee_type()+" Certificate: "+list1.toString()+
                " Majors: " + majors +
                " Semester: " + semester +
                " University Name: "+university_name+'\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}