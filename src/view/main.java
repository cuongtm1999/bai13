package view;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import controller.controller;
import entity.Certificate;
import entity.Employee;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import exception.CustomException;

public class main {
    static controller controller = new controller();
    public static void main(String[] args) throws Throwable {
        System.out.println("Chuong trinh quan ly nhan vien");
        System.out.println("1. Add");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Find Intern");
        System.out.println("5. Find Fresher");
        System.out.println("6. Find Experience");
        System.out.println("7. Exit");
        while (true) {
            System.out.println("Nhap lua chon de chay chuong trinh: ");
            int luachon = CustomException.inputInt();
            switch (luachon) {
                case 1:
                    System.out.println("Add employee");
                    Employee employee = main.addEmployee();
                    controller.add(employee);
                    break;
                case 2:
                    System.out.println("Update employee");
                    Employee employee1 = main.updateEmployee();
                    if(employee1 == null)
                    {
                        System.out.println("Nhan vien khong ton tai");
                    }
                    else controller.update(employee1);
                    break;
                case 3:
                    System.out.println("Delete employee");
                    System.out.println("Nhap id nhan vien can xoa: ");
                    String id = CustomException.inputString();
                    if (controller.findByID(id) == null) {
                        System.out.println("Nhan vien khong ton tai");
                    } else {
                        controller.delete(id);
                    }
                    break;
                case 4:
                    System.out.println("Find Intern");
                    controller.showIntern();
                    break;
                case 5:
                    System.out.println("Find Fresher");
                    controller.showFresher();
                    break;
                case 6:
                    System.out.println("Find Experience");
                    controller.showExperience();
                    break;
                case 7:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Nhap lai!!!");
                    break;
            }
        }
    }
    private static List<Certificate> list() {
        List<Certificate> listCertificate = new ArrayList<>();
        System.out.print("So luong certificate: ");
        int number = CustomException.inputInt();
        for (int i = 0; i < number; i++) {
            System.out.print("Certificate Id: ");
            String certificateId = CustomException.inputString();
            System.out.print("Certificate Name: ");
            String certificateName = CustomException.inputString();
            System.out.print("Certificate Rank: ");
            String certificateRank = CustomException.inputString();
            System.out.print("Certificate Date: ");
            Date certificateDate = CustomException.inputBirthDay();
            Certificate certificate = new Certificate(certificateId, certificateName, certificateRank, certificateDate);
            listCertificate.add(certificate);
        }
        return listCertificate;
    }

    private static Employee addEmployee(){
        while (true) {
            System.out.print("ID: ");
            String id = CustomException.inputString();
            System.out.print("Fullname: ");
            String fullName = CustomException.inputString();
            System.out.print("BirthDay: ");
            Date birthDay = CustomException.inputBirthDay();
            System.out.print("Phone: ");
            String phone = CustomException.inputString();
            System.out.print("Email: ");
            String email = CustomException.inputEmail();
            List<Certificate> listCertificate = list();

            System.out.println("1: Experience 2: Fresher  3: Intern");
            int chon = CustomException.inputInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhan vien Experience");
                    System.out.print("Nam kinh nghiem: ");
                    int expInYear = CustomException.inputInt();
                    System.out.print("Skill: ");
                    String proSkill = CustomException.inputString();
                    Employee experience = new Experience(id, fullName, birthDay, phone, email, "Experience", listCertificate, expInYear,
                            proSkill);
                    return experience;
                case 2:
                    System.out.println("Nhan vien Fresher");
                    System.out.print("Graduation Date: ");
                    Date graduationDate = CustomException.inputBirthDay();
                    System.out.print("Graduation Rank: ");
                    String graduationRank = CustomException.inputString();
                    System.out.print("Education: ");
                    String education = CustomException.inputString();
                    Employee fresher = new Fresher(id, fullName, birthDay, phone, email, "Fresher", listCertificate, graduationDate,
                            graduationRank, education);
                    return fresher;
                case 3:
                    System.out.println("Nhan vien Intern");
                    System.out.print("Major: ");
                    String major = CustomException.inputString();
                    System.out.print("Semester: ");
                    int semester = CustomException.inputInt();
                    System.out.print("University Name: ");
                    String universityName = CustomException.inputName();

                    Employee intern = new Intern(id, fullName, birthDay, phone, email, "Intern", listCertificate, major, universityName,
                            semester);
                    return intern;
                default:
                    System.out.println("Nhap lai lua chon!");
                    break;
            }
        }
    }
    public static Employee updateEmployee(){
        System.out.print("Nhap ID nhan vien can sua: ");
        String id = CustomException.inputString();
        if (controller.findByID(id) == null) {
            return null;
        } else {
            System.out.print("Fullname: ");
            String fullName = CustomException.inputName();
            System.out.print("BirthDay: ");
            Date birthDay = CustomException.inputBirthDay();
            System.out.print("Phone: ");
            String phone = CustomException.inputString();
            System.out.print("Email: ");
            String email = CustomException.inputEmail();
            List<Certificate> listCertificate = list();
            if (controller.findByID(id) == "Experience") {
                System.out.print("So nam kinh nghiem: ");
                int expInYear = CustomException.inputInt();
                System.out.print("Ky nang chuyen mon: ");
                String proSkill = CustomException.inputString();

                Employee exp = new Experience(id, fullName, birthDay, phone, email, "Experience", listCertificate, expInYear,
                        proSkill);
                return exp;
            } else if (controller.findByID(id) == "Fresher") {
                System.out.print("Thoi gian tot nghiep: ");
                Date graduationDate = CustomException.inputBirthDay();
                System.out.print("Xep loai tot nghiep: ");
                String graduationRank = CustomException.inputString();
                System.out.print("Truong tot nghiep: ");
                String education = CustomException.inputString();

                Employee fresher = new Fresher(id, fullName, birthDay, phone, email, "Fresher", listCertificate, graduationDate,
                        graduationRank, education);
                return fresher;
            } else if (controller.findByID(id) == "Intern") {
                System.out.print("Chuyen nganh dang hoc: ");
                String major = CustomException.inputString();
                System.out.print("Hoc ki dang hoc: ");
                int semester = CustomException.inputInt();
                System.out.print("Ten truong dang hoc: ");
                String universityName = CustomException.inputString();

                Employee intern = new Intern(id, fullName, birthDay, phone, email, "Intern", listCertificate, major, universityName,
                        semester);
                return intern;
            }
        }
        return null;
    }
}
