/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildercod1;

/**
 *
 * @author javiv
 */
public class Employee {

    private String lastName;
    private String middleName;
    private String firstName;
    private long id;
    private int birthYear;
    private int birthMonth;
    private int birthDate;
    private int hireYear;
    private int hireMonth;
    private int hireDate;

    public Employee(
            final String newLastName,
            final String newMiddleName,
            final String newFirstName,
            final long newId,
            final int newBirthYear,
            final int newBirthMonth,
            final int newBirthDate,
            final int newHireYear,
            final int newHireMonth,
            final int newHireDate) {
        this.lastName = newLastName;
        this.middleName = newMiddleName;
        this.firstName = newFirstName;
        this.id = newId;
        this.birthYear = newBirthYear;
        this.birthMonth = newBirthMonth;
        this.birthDate = newBirthDate;
        this.hireYear = newHireYear;
        this.hireMonth = newHireMonth;
        this.hireDate = newHireDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", middleName=" + middleName + ", firstName=" + firstName + ", id=" + id + ", birthYear=" + birthYear + ", birthMonth=" + birthMonth + ", birthDate=" + birthDate + ", hireYear=" + hireYear + ", hireMonth=" + hireMonth + ", hireDate=" + hireDate + '}';
    }
    
    
}