/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwareengineering.assignment1;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
/**
 *
 * @author noracasey
 */

public class CourseProgramme {
    private final String courseName;
    private final List<Module> modules = new ArrayList<Module>();
    private final List<Student> enrolledStudents = new ArrayList<Student>();
    private final LocalDate startDate;
    private final LocalDate endDate;
    
    public CourseProgramme(String courseName, int startDay, int startMonth, int startYear, int endDay, int endMonth, int endYear) {
        this.courseName = courseName;
        this.startDate = new LocalDate(startYear, startMonth, startDay);
        this.endDate = new LocalDate(endYear, endMonth, endDay);
    }
    
    public void addModules(Module module) {
        this.modules.add(module);
        module.addCourse(this);
    }
    
    public void addStudentToCourse(Student student) {
        this.enrolledStudents.add(student);
        for (Module element : modules) {
            element.addStudentToModule(student);
        }
    }
    
    // Getter Methods
    public String getCourseName() {
        return courseName;
    }
    
    public List<Module> getModuleList() {
        return modules;
    }
    
    public List<Student> getStudentList() {
        return enrolledStudents;
    }
    
    public LocalDate getStartDate() {
        return startDate;
    }
    
    public LocalDate getEndDate() {
        return endDate;
    }
}
