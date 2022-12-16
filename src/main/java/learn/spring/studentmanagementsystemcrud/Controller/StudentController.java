package learn.spring.studentmanagementsystemcrud.Controller;

import learn.spring.studentmanagementsystemcrud.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    // A controller for student to handle requests
    private StudentService service;
    public StudentController(StudentService service) {
        this.service = service;
    }


    //get all students
    @RequestMapping("/students")
     String getAllStudents(Model model){ // create a model  to send data betn view and controller
        model.addAttribute("students",service.getAllStudents());
        return "students.html"; // returns a students view which should be created inside templates
    }

}
