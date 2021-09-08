/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.dto;

/**
 *
 * @author agrah
 */
public class Student {
    private String firstName;
    private String lastName;
    private final String STUDENTID;
    //programming language + cohort month/year
    private String cohort;
    
    public Student(String studentId){
        this.STUDENTID = studentId;
    }

    public String getStudentId() {
        return STUDENTID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
}
