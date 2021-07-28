package com.example.more_on_songusing_thymeleaf_condition;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/songform")
    public String loadForm(Model model) {
        model.addAttribute("song", new Song());
        return "songform";
    }

    @PostMapping("/confirmsong")
    public String confirmPage(@Valid Song song, BindingResult result){
        if(result.hasErrors()){
            return "songform";
        }
         return "confirmsong";
    }
}
