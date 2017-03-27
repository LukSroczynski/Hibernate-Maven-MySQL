package spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Łukasz Sroczyński on 27.03.2017.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String HomePage() {
        return "main-page";
    }

}
