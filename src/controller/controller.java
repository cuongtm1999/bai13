package controller;

import entity.Employee;

import service.EmployeeService;
import service.IEmployeeService;

public class controller {
    IEmployeeService employeeService;

    public controller() {
        employeeService = new EmployeeService();
    }

    public void add(Employee employee)
    {
        employeeService.add(employee);
    }
    public void showExperience()
    {
        employeeService.getExperience();
    }
    public void showFresher()
    {
        employeeService.getFresher();
    }
    public void showIntern()
    {
        employeeService.getIntern();
    }
    public void update(Employee employee)
    {
        employeeService.updateByID(employee);
    }
    public void delete(String id)
    {
        employeeService.deleteByID(id);
    }
    public String findByID(String id)
    {
        return employeeService.findByID(id);
    }
}
