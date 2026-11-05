package brayan.streams.flatmaps.Exercice02.domain;

import java.util.List;

public class Department {
    private String sector;
    private List<Employee> employees;

    public Department(String sector, List<Employee> employees) {
        this.sector = sector;
        this.employees = employees;
    }

    public String getSector() {
        return sector;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
