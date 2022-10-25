package model.entities;

import java.util.Date;
import java.util.Objects;

public class Seller {
    private int idSeller;
    private String name;
    private String email;
    private Date birthDate;
    private double baseSalary;

    private Department department;

    /***************** Constructor *******************/
    public Seller() {
    }
    public Seller(int idSeller, String name, String email, Date birthDate, double baseSalary) {
        this.idSeller = idSeller;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
    }

    /******************* Get and Set *******************/
    public int getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(int idSeller) {
        this.idSeller = idSeller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return idSeller == seller.idSeller;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSeller);
    }

    @Override
    public String toString() {
        return "Seller{" +
               "idSeller = " + idSeller +
               ", name = '" + name + '\'' +
               ", email = '" + email + '\'' +
               ", birthDate = " + birthDate +
               ", baseSalary = " + baseSalary +
               ", " + department +
               '}';
    }
}
