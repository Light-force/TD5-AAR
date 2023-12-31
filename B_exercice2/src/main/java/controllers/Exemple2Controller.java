package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import services.Facade;

@Controller
@RequestMapping("/")
public class Exemple2Controller {
    @Autowired
    Facade facade;

    @RequestMapping("")
    public String hello(Model model){
        return "hello";
    }

    @PostMapping("/")
    public String createPersonne() {
        facade.createEmploye();
        return "hello";
    }
}
