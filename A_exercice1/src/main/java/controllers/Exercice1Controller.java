package controllers;

import entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.Facade;

@Controller
@RequestMapping("/")
public class Exercice1Controller {
    @Autowired
    Facade facade;

    @RequestMapping("")
    public String hello(Model model) {
        model.addAttribute("employe", facade.findEmployeById(1));
        return "hello";
    }
}
