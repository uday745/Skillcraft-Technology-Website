package com.skillcraft.skillcraft_website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SkillcraftWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkillcraftWebsiteApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to Skillcraft Technology Website!";
    }

    @GetMapping("/devops")
    public String devops() {
        return "DevOps Topics: CI/CD, Docker, Kubernetes, Jenkins, Terraform, AWS, Ansible...";
    }
}
