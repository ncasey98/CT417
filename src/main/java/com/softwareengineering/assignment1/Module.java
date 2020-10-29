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

// module name, id, list of students, courses it's associated with 

public class Module {
    private String moduleName;
    private String moduleID;
    private List<Student> enrolledStudents = new ArrayList<Student>();
    private List<CourseProgramme> associatedCourses = new ArrayList<CourseProgramme>();
    
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
