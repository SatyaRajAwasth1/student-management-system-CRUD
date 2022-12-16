package learn.spring.studentmanagementsystemcrud.Controller;

import learn.spring.studentmanagementsystemcrud.Service.StudentService;
import learn.spring.studentmanagementsystemcrud.Service.StudentServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    // A controller for student to handle requests
    private StudentService service;
    public StudentController(StudentService service) {
        this.service = service;
    }


    //get all students
    @GetMapping("/students")
     String getAllStudents(Model model){ // create a model  to send data betn view and controller
        model.addAttribute("students",service.getAllStudents());
        return "students";
    }

}
