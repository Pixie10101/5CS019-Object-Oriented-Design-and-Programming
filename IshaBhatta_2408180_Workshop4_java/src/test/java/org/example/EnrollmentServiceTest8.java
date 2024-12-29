package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class EnrollmentServiceTest8 {

    @Test
    public void testEnrollStudent() {
        EnrollmentService8 service = new EnrollmentService8();

        assertAll("Enrollment Tests",

                () -> assertTrue(service.enrollStudent("alice", "Math101"),
                        "The student should be successfully enrolled in the course."),


                () -> {
                    service.enrollStudent("alice", "Math101");
                    assertFalse(service.enrollStudent("alice", "Math101"),
                            "The student should not be able to enroll in the same course twice.");
                },


                () -> assertFalse(service.enrollStudent(null, "Math101"),
                        "Enrollment should fail if the student username is null."),


                () -> assertFalse(service.enrollStudent("alice", null),
                        "Enrollment should fail if the course name is null."),


                () -> assertFalse(service.enrollStudent("", "Math101"),
                        "Enrollment should fail if the student username is empty."),


                () -> assertFalse(service.enrollStudent("alice", ""),
                        "Enrollment should fail if the course name is empty.")
        );
    }

    @Test
    public void testGetEnrolledCourses() {
        EnrollmentService8 service = new EnrollmentService8();

        // Enroll the student in multiple courses
        service.enrollStudent("bob", "Physics101");
        service.enrollStudent("bob", "Chemistry101");

        Set<String> courses = service.getEnrolledCourses("bob");

        assertAll("Enrolled Courses Tests",
                () -> assertEquals(2, courses.size(), "The student should be enrolled in exactly two courses."),
                () -> assertTrue(courses.contains("Physics101"), "The student should be enrolled in Physics101."),
                () -> assertTrue(courses.contains("Chemistry101"), "The student should be enrolled in Chemistry101.")
        );
    }
}
