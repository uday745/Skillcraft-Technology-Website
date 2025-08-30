package com.skillcraft.skillcraft_website;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Skillcraft Technology");
        model.addAttribute("message", "Welcome to Skillcraft Technology Website!");
        return "index"; // loads templates/index.html
    }

    @GetMapping("/devops")
    public String devops(Model model) {
        model.addAttribute("title", "DevOps Topics");
        model.addAttribute("message", "CI/CD, Docker, Kubernetes, Jenkins, Terraform, AWS, Ansible...");
        return "devops"; // loads templates/devops.html
    }
}
