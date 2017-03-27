package spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc.core.Student;

/**
 * Created by Łukasz S. on 27.03.2017.
 */

@Controller
@RequestMapping("/student")
public class StudentController {



    @RequestMapping("/showForm")
    public String showForm(Model model) {

        // 1. Create new student object
        Student student = new Student();

        // 2. Add student object as a model
        model.addAttribute("student", student);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {

        // 1. Log input data
        System.out.println("Student " + student.getFirstName() + " " + student.getLastName());

        return "student-confirmation";
    }


}
