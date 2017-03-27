package spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Łukasz Sroczyński on 27.03.2017.
 */

@Controller
public class FormController {

    // 1. Need a controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "show-form";
    }

    // 2. Need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "show-process-form";
    }

    // 3. Controller method that read from-data and add that data to the model
    @RequestMapping("/processForm2")
    public String readForm(HttpServletRequest request, Model model) {

        // 1. Read request parameter from the HTML form
        String name = request.getParameter("studentName");

        // 2. Convert the data to all CAPS
        name = name.toUpperCase();

        // 3. Create the message
        String result = "Yo!! " + name;

        // 4. Add message to the model
        model.addAttribute("message", result);

        return "show-process-form";
    }

}
