package service;

import entity.Employee;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import repository.Repository;

public class EmployeeService implements IEmployeeService{
    Repository repository = new Repository();
    int count = 0;
    @Override
    public void add(Employee employee) {
        if(employee instanceof Experience)
        {
            count++;
            Experience experience = (Experience) employee;
            employee.setEmployee_count(count);
            repository.getExperienceList().add(experience);
        }
        if(employee instanceof Fresher)
        {
            count++;
            Fresher fresher = (Fresher) employee;
            employee.setEmployee_count(count);
            repository.getFresherList().add(fresher);
        }
        if(employee instanceof Intern)
        {
            count++;
            Intern intern = (Intern) employee;
            employee.setEmployee_count(count);
            repository.getInternList().add(intern);
        }
    }
    @Override
    public void deleteByID(String id) {
        for (Experience exp : repository.getExperienceList()
        ) {
            if (exp.getId().equals(id)) {
                repository.getExperienceList().remove(exp);
            }
            break;
        }
        for (Fresher fre : repository.getFresherList()
        ) {
            if (fre.getId().equals(id)) {
                repository.getFresherList().remove(fre);
            }
            break;
        }
        for (Intern in : repository.getInternList()
        ) {
            if (in.getId().equals(id)) {
                repository.getInternList().remove(in);
            }
            break;
        }
    }

    @Override
    public void updateByID(Employee employee) {
        for (Employee exp : repository.getExperienceList()
        ) {
            if (exp.getId().equals(employee.getId())) {
                Experience newExperience = (Experience) employee;
                ((Experience) exp).setFullName(newExperience.getFullName());
                ((Experience) exp).setBirthDay(newExperience.getBirthDay());
                ((Experience) exp).setPhone(newExperience.getPhone());
                ((Experience) exp).setEmail(newExperience.getEmail());
                ((Experience) exp).setList1(newExperience.getList1());
                ((Experience) exp).setExpInYear(newExperience.getExpInYear());
                ((Experience) exp).setProSkill(newExperience.getProSkill());
                break;
            }
        }
        for (Employee fre : repository.getFresherList()
        ) {
            if (fre.getId().equals(employee.getId())) {
                Fresher newFresher = (Fresher) employee;
                ((Fresher) fre).setFullName(newFresher.getFullName());
                ((Fresher) fre).setBirthDay(newFresher.getBirthDay());
                ((Fresher) fre).setPhone(newFresher.getPhone());
                ((Fresher) fre).setEmail(newFresher.getEmail());
                ((Fresher) fre).setList1(newFresher.getList1());
                ((Fresher) fre).setGraduation_date(newFresher.getGraduation_date());
                ((Fresher) fre).setGraduation_rank(newFresher.getGraduation_rank());
                ((Fresher) fre).setEducation(newFresher.getEducation());
                break;
            }
        }
        for (Employee in : repository.getInternList()
        ) {
            if (in.getId().equals(employee.getId())) {
                Intern newIntern = (Intern) employee;
                ((Intern) in).setFullName(newIntern.getFullName());
                ((Intern) in).setBirthDay(newIntern.getBirthDay());
                ((Intern) in).setPhone(newIntern.getPhone());
                ((Intern) in).setEmail(newIntern.getEmail());
                ((Intern) in).setList1(newIntern.getList1());
                ((Intern) in).setMajors(newIntern.getMajors());
                ((Intern) in).setSemester(newIntern.getSemester());
                ((Intern) in).setUniversity_name(newIntern.getUniversity_name());
                break;
            }
        }
    }
    @Override
    public void getExperience() {
        for (Experience e: repository.getExperienceList()
        ) {
            e.showInfo();
        }
    }

    @Override
    public void getFresher() {
        for (Fresher e: repository.getFresherList()
        ) {
            e.showInfo();
        }
    }

    @Override
    public void getIntern() {
        for (Intern e: repository.getInternList()
        ) {
             e.showInfo();
        }
    }

    @Override
    public String findByID(String id) {
        for (Employee e: repository.getInternList()
             ) {
            if(e.getId().equals(id))
            {
                return "Intern";
            }
        }
        for (Employee e: repository.getFresherList()
        ) {
            if(e.getId().equals(id))
            {
                return "Fresher";
            }
        }
        for (Employee e: repository.getExperienceList()
        ) {
            if(e.getId().equals(id))
            {
                return "Experience";
            }
        }
        return null;
    }


}
