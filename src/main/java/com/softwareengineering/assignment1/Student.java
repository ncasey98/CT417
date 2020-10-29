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
    private final String name;
    private final int age;
    private final LocalDate dateOfBirth;
    private int ID;
    private String username;
    private CourseProgramme registeredCourse;
    private List<Module> modules = new ArrayList<Module>();  
    
    public Student(String name, int id, int day, int month, int year, CourseProgramme course){
        this.name = name;
        this.ID = id;
        this.dateOfBirth = new LocalDate(year, month, day);
        this.age = setAge();
        this.registeredCourse = course;
        registerToCourse();
    }
    
    // Calcuating Current Age of Student using Joda-Time
    private int setAge() {
        LocalDate currentAge = new LocalDate();
        currentAge = dateOfBirth.minusYears(currentAge.getYear());
        return currentAge.getYear();
    }
    
    // Student Username is the concatenation of Name and Age
    public String getUsername() {
        username = name + Integer.toString(age);
        return username;
    }

    private void registerToCourse() {
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
    
    public int getID() {
        return ID;
    }
}
