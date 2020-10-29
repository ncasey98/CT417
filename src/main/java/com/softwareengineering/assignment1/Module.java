/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwareengineering.assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noracasey
 */

public class Module {
    private final String moduleName;
    private final String moduleID;
    private final List<Student> enrolledStudents = new ArrayList<Student>();
    private final List<CourseProgramme> associatedCourses = new ArrayList<CourseProgramme>();
    
    private Module(String moduleName, String moduleID) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }
    
    public void addCourse(CourseProgramme course) {
        this.associatedCourses.add(course);
    }
    
    public void addStudentToModule(Student student) {
        this.enrolledStudents.add(student);
    }
    
    // Getter Methods
    public String getModuleName() {
        return moduleName;
    }
    
    public String getModuleID() {
        return moduleID;
    }
    
    public List<Student> getStudentList() {
        return enrolledStudents;
    }
    
    public List<CourseProgramme> getCourseList() {
        return associatedCourses;
    }
}
