package learn.spring.studentmanagementsystemcrud.Controller;

import learn.spring.studentmanagementsystemcrud.Entity.Student;
import learn.spring.studentmanagementsystemcrud.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
        return "students"; // returns a students view which should be created inside templates
    }

    @RequestMapping("students/add")
    String addStudentForm(Model model){
        Student student = new Student(); // object to hold student data
        model.addAttribute("student",student);
        return "add-student";
    }

    @PostMapping("students")
    String addStudent(@ModelAttribute("student")Student student){
        service.addStudent(student);
        return "redirect:/students";
    }

    @RequestMapping("students/remove/{id}")
    String deleteStudent(@PathVariable("id")long id, Model model) throws Exception{
        service.deleteStudent(id);
        return "redirect:/students";
    }



}
