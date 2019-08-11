package com.example.model;

import java.io.Serializable;

/**
 * @author xiaotao
 * @version 1.0
 */
public class Employee implements Serializable {

    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String email;

    public Employee() {
    }

    public Employee(String lastName, String firstName, String dateOfBirth, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
