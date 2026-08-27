package com.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void testUpdateGrade() {
        //Arrange 
        Student student = new Student();
        student.grade = 85;

        //Act
        student.updateGrade(90);

        //Assert
        assertEquals(90, student.grade);
    }

}
  

   
