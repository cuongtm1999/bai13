package service;

import entity.Employee;

public interface IEmployeeService {
     void add(Employee employee);
     void deleteByID(String id);
     void updateByID(Employee employee);
     void getExperience();
     void getFresher();
     void getIntern();
     String findByID(String id);
}
