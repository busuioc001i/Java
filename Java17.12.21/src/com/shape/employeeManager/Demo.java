package com.shape.employeeManager;

public class Demo {

    public static void main(String[] args) {

        Employee emp = new Employee("12341","Ion","Busuioc","programator");
        Employee emp2 = new Employee("232421","Aliona","Busuioc","programator");
        Object emp3 = new Employee("12341","Ion","Busuioc","programator");

//        System.out.println(emp.equalsEmployee(emp2));
//        System.out.println(emp);
        System.out.println("First name: " + emp.getFirstName());
        System.out.println("Last name: " + emp.getLastName());
        System.out.println("IDNP: " + emp.getIdnp());

    }

}
