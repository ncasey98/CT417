/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwareengineering.assignment1;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.*;

/**
 *
 * @author noracasey
 */

public class Student {
    
    // Initialising variables 
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private int ID;
    private String username;
    private CourseProgramme registeredCourse;
    private List<Module> modules = new ArrayList<Module>();  
    
    public Student(String name, int day, int month, int year, CourseProgramme course){
        this.name = name;
        // TO CHECK AND CHANGE 
        this.dateOfBirth = new LocalDate(year, month, day);
        this.age = setAge();
        this.registeredCourse = course;
        // CHANGE
        registerCourse();
    }
    
    // CHANGE 
    private int setAge() {
        LocalDate currentAge = new LocalDate();
        currentAge = dateOfBirth.minusYears(currentAge.getYear());
        return currentAge.getYear();
    }
    
    // CHECK HOW TO DO EMPLOYEE NUMBER IN PREVIOUS ASSIGNMENTS 
    
    // Student Username is the concatenation of Name and Age
    public String getUsername() {
        username = name + Integer.toString(age);
        return username;
    }
    
    // CHANGE
    private void registerCourse() {
        modules = this.registeredCourse.getModuleList();
        this.registeredCourse.addStudentToCourse(this);
    }
    
    
    // Getter Methods
    public String getStudentName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public LocalDate getDOB() {
        return dateOfBirth;
    }
    
    public CourseProgramme getCourse() {
        return registeredCourse;
    }
    
    public List<Module> getModules() {
        return modules;
    }
}
