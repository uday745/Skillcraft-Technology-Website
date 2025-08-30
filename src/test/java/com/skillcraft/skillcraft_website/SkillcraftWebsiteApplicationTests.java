package com.skillcraft.skillcraft_website;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SkillcraftWebsiteApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
        // This test just makes sure the Spring application starts correctly
    }

    @Test
    void homePageShouldReturnWelcomeMessage() {
        String body = this.restTemplate.getForObject("/", String.class);
        assertThat(body).contains("Welcome to Skillcraft Technology Website!");
    }

    @Test
    void devopsPageShouldReturnDevOpsTopics() {
        String body = this.restTemplate.getForObject("/devops", String.class);
        assertThat(body).contains("DevOps Topics");
    }
}
