package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String department;
    @Column
    private int salary;

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", department='").append(department).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
