package com.company.dataAccessObject.core;

import java.util.List;

/**
 * @author MGARY
 * @date 2019-11-29 下午2:08
 */
public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
