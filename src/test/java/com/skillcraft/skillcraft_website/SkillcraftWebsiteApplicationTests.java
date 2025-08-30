package com.skillcraft.skillcraft_website;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class SkillcraftWebsiteApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void homePageShouldReturnWelcomeMessage() {
        String body = this.restTemplate.getForObject("http://localhost:9090/", String.class);
        assertThat(body).contains("Welcome to Skillcraft Technology Website!");
    }

    @Test
    void devopsPageShouldReturnDevOpsTopics() {
        String body = this.restTemplate.getForObject("http://localhost:9090/devops", String.class);
        assertThat(body).contains("DevOps Topics");
    }
}
