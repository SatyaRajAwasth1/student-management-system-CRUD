package learn.spring.studentmanagementsystemcrud.Service;

import learn.spring.studentmanagementsystemcrud.Entity.Student;

import java.util.List;

public interface StudentService {
    // a service interface layer to provide services to other for loose coupling
    List<Student> getAllStudents();
    Student getStudentById();
}
