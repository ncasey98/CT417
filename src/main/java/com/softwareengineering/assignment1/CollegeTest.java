/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.softwareengineering.assignment1;

import org.joda.time.LocalDate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author noracasey
 */

public class CollegeTest {
    private CourseProgramme CSIT, Commerce, Science, Arts, Nursing;
    private Module CT101, BS491, SC103, AT527, NS510;
    private Student John, Jack, Sarah, Tom, Rachel;
    
    @Test
    public void JUnitTest() {
        CSIT = new CourseProgramme("CSIT", 31, 8, 2017, 1, 6, 2021);
        Commerce = new CourseProgramme("COMM", 31, 8, 2017, 1, 6, 2020);
        Science = new CourseProgramme("SCI", 31, 8, 2017, 1, 6, 2020);
        Arts = new CourseProgramme("ARTS", 31, 8, 2017, 1, 6, 2020);
        Nursing = new CourseProgramme("NURS", 24, 8, 2017, 30, 6, 2022);
        
        CT101 = new Module("Introduction to Programming", "101");
        BS491 = new Module("International Business", "491");
        SC103 = new Module("Biology", "103");
        AT527 = new Module("Psychology", "527");
        NS510 = new Module("Nursing Introduction", "510");
        
        CSIT.addModules(CT101);
        Commerce.addModules(BS491);
        Science.addModules(SC103);
        Arts.addModules(AT527);
        Nursing.addModules(NS510);
        
        John = new Student("JohnSmith", 00001, 21, 5, 2002, CSIT);
        Jack = new Student("JackSparrow", 00002, 4, 7, 1998, Commerce);
        Sarah = new Student("SarahPalin", 00003, 31, 01, 1994, Science);
        Tom = new Student("TomJones", 00004, 5, 12, 2000, Arts);
        Rachel = new Student("RachelGreen", 00005, 16, 3, 1999, Nursing);
        
        // Testing Username Creation
        assertEquals("JohnSmith-18", John.getUsername());
        assertEquals("JackSparrow-22", Jack.getUsername());
        assertEquals("SarahPalin-26", Sarah.getUsername());
        assertEquals("TomJones-20", Tom.getUsername());
        assertEquals("RachelGreen-21", Rachel.getUsername());
        
        // Testing Student's Registered Course
        assertEquals("CSIT", John.getCourse().getCourseName());
        assertEquals("COMM", Jack.getCourse().getCourseName());
        assertEquals("SCI", Sarah.getCourse().getCourseName());
        assertEquals("ARTS", Tom.getCourse().getCourseName());
        assertEquals("NURS", Rachel.getCourse().getCourseName());
        
        // Testing Course Programme's Modules
        assertEquals("Introduction to Programming", CSIT.getModuleList().get(0).getModuleName());
        assertEquals("International Business", Commerce.getModuleList().get(0).getModuleName());
        assertEquals("Biology", Science.getModuleList().get(0).getModuleName());
        assertEquals("Psychology", Arts.getModuleList().get(0).getModuleName());
        assertEquals("Nursing Introduction", Nursing.getModuleList().get(0).getModuleName());
        
        // Testing Course Programme's Start Date, End Date
        assertEquals(new LocalDate("2017-08-31"), CSIT.getStartDate());
        assertEquals(new LocalDate("2021-06-01"), CSIT.getEndDate());
        
        assertEquals(new LocalDate("2017-08-31"), Commerce.getStartDate());
        assertEquals(new LocalDate("2020-06-01"), Commerce.getEndDate());
        
        assertEquals(new LocalDate("2017-08-31"), Science.getStartDate());
        assertEquals(new LocalDate("2020-06-01"), Science.getEndDate());
        
        assertEquals(new LocalDate("2017-08-31"), Arts.getStartDate());
        assertEquals(new LocalDate("2020-06-01"), Arts.getEndDate());
        
        assertEquals(new LocalDate("2017-08-24"), Nursing.getStartDate());
        assertEquals(new LocalDate("2022-06-30"), Nursing.getEndDate());
       
    }
}
