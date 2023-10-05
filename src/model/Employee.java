/*
* File: Employee.java
* Author: Vitovszki Tamás
* Copyright: 2023, Vitovszki Tamás
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/Tomasman05/
* Licenc: GNU GPL
*/
package model;

public class Employee {
    private String name;
    private String city;
    private String address;
    private String birth;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
