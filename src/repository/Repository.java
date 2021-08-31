package repository;

import entity.Employee;
import entity.Experience;
import entity.Fresher;
import entity.Intern;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<Experience> experienceList;
    private List<Fresher> fresherList;
    private List<Intern> internList;

    public Repository() {
        experienceList = new ArrayList<>();
        fresherList = new ArrayList<>();
        internList = new ArrayList<>();
    }

    public List<Experience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public List<Fresher> getFresherList() {
        return fresherList;
    }

    public void setFresherList(List<Fresher> fresherList) {
        this.fresherList = fresherList;
    }

    public List<Intern> getInternList() {
        return internList;
    }

    public void setInternList(List<Intern> internList) {
        this.internList = internList;
    }
}
