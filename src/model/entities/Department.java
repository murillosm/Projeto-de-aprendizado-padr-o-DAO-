package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer idDepartment;
    private String nameDepartment;

    public Department() {
    }
    public Department(Integer idDepartment, String nameDepartment){
        this.idDepartment = idDepartment;
        this.nameDepartment = nameDepartment;
    }

    public Integer getIdDepartment(){
        return idDepartment;
    }
    public void setIdDepartment(Integer idDepartment){
        this.idDepartment = idDepartment;
    }
    public String getNameDepartment(){
        return nameDepartment;
    }
    public void setNameDepartment(String nameDepartment){
        this.nameDepartment = nameDepartment;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Department that = (Department) obj;
        return idDepartment == that.idDepartment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDepartment);
    }

    @Override
    public String toString() {
        return "Department = {" +
                "idDepartment = " + idDepartment +
                ", nameDepartment = '" + nameDepartment + '\'' +
                '}';
    }
}
