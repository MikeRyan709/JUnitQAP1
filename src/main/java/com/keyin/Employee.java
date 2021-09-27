package com.keyin;

public class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    static int count = 0;

    public Employee(int id, String firstName, String lastName, int salary)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        count++;
    }

    Employee(Employee e) {
        this.id = e.id;
        this.firstName = e.firstName;
        this.lastName = e.lastName;
        this.salary = e.salary;
        count++;
    }
    public int getID(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getSalary(){
        return this.salary;
    }
    public String getName(){
        return(firstName + " " +lastName);
    }
    public void setSalary(int sal){
        this.salary = sal;
    }
    public int getAnualSalary(){
        return (12* salary);
    }
    public int raiseSalary(int percentage){
        this.salary = this.salary + (percentage/100 * this.salary);
        return (this.salary);
    }

    public String toString(){
        return (getName() + " has a salary " + this.salary + "and we have " + count + " Employees");
    }
}


