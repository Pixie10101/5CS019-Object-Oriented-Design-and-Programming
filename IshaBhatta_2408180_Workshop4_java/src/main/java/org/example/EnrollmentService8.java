package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnrollmentService8 {

    private Map<String, Set<String>> studentCourseMap;

    public EnrollmentService8() {
        studentCourseMap = new HashMap<>();
    }

    public boolean enrollStudent(String studentUsername, String courseName) {
        if (studentUsername == null || courseName == null || studentUsername.isEmpty() || courseName.isEmpty()) {
            return false;
        }


        studentCourseMap.putIfAbsent(studentUsername, new HashSet<>());
        Set<String> courses = studentCourseMap.get(studentUsername);


        return courses.add(courseName);
    }

    public Set<String> getEnrolledCourses(String studentUsername) {
        return studentCourseMap.getOrDefault(studentUsername, new HashSet<>());
    }
}
