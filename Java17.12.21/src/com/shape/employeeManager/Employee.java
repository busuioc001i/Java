package com.shape.employeeManager;

public class Employee {

    private String idnp;
    private String firstName;
    private String lastName;
    private String profession;

    public Employee(String idnp, String firstName, String lastName, String profession) {
        this.idnp = idnp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profession = profession;
    }

    @Deprecated
    public boolean equalsEmployee(Employee emp){

        return this.firstName.equals(emp.firstName)
                && this.lastName.equals(emp.lastName)
                && this.idnp.equals(emp.idnp)
                && this.profession.equals(emp.profession);

    }

    public String toString(){
//        return "Employee - name: " + firstName + "last name: "
//                + lastName + "idnp: " + idnp;
        return String.format("Employee - name %s, last name: %s, idnp: %s",firstName,lastName,idnp);

    }

    @Override

    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }

        if(this.getClass() != obj.getClass()){
            return false;
        }
        Employee emp = (Employee) obj;

        return this.firstName.equals(emp.firstName)
                && this.lastName.equals(emp.lastName)
                && this.idnp.equals(emp.idnp)
                && this.profession.equals(emp.profession);

    }

    public String getIdnp() {
        return idnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getProfession() {
        return profession;
    }
}
