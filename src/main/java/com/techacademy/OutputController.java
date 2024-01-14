package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {
    
    @PostMapping("/output")
    public String postForm(@RequestParam("val") String val, Model model) {
        model.addAttribute("val", val);
        return "output";
    }
    
    @PostMapping("/input")
    public String getLink(@RequestParam(name = "previous", required = false) String val, Model model) {
        model.addAttribute("previousInput");
        return "input";
    }

}