package id.ac.uin.student.controller;

import id.ac.uin.student.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class TestController {
    @GetMapping("/test1")
    public String getForm(Student student){
        return "index2";
    }

    @PostMapping("/save-student")
    public String submitStudentDetails(@Valid Student student, Errors errors, Model model){
        if (null != errors && errors.getErrorCount() > 0){
            return "index2";
        } else {
            model.addAttribute("successMsg", "Detail saved successfully!!");
            return "success";
        }
    }
}
