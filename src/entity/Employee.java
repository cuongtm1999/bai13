package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public abstract class Employee {
    //static Scanner sc = new Scanner(System.in);
    private String id;
    private String fullName;
    private Date birthDay;
    private String phone;
    private String email;
    private String employee_type;
    private int employee_count;
    List<Certificate> list1 = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployee_type() {
        return employee_type;
    }

    public void setEmployee_type(String employee_type) {
        this.employee_type = employee_type;
    }

    public  int getEmployee_count() {
        return employee_count;
    }

    public  void setEmployee_count(int employee_count) {
        this.employee_count = employee_count;
    }

    public List<Certificate> getList1() {
        return list1;
    }

    public void setList1(List<Certificate> list1) {
        this.list1 = list1;
    }

    public Employee() {
        super();
        this.employee_count= this.employee_count++;
    }

    public Employee(String id, String fullName, Date birthDay, String phone, String email, String employee_type, List<Certificate> list1) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employee_type = employee_type;
        this.employee_count = this.employee_count++;
        this.list1 = list1;
    }

    public abstract void showInfo();
}
