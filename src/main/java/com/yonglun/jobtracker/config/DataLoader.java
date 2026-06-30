package com.yonglun.jobtracker.config;

import com.yonglun.jobtracker.entity.Job;
import com.yonglun.jobtracker.repository.JobRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(JobRepository repository) {

        return _ -> {

            repository.save(new Job(
                    "Backend Software Engineer",
                    "Google",
                    "Singapore",
                    "https://www.google.com"));

            repository.save(new Job(
                    "Java Developer",
                    "Grab",
                    "Singapore",
                    "https://www.google.com"));

            repository.save(new Job(
                    "Full Stack Developer",
                    "Shopee",
                    "Singapore",
                    "https://www.google.com"));
        };
    }
}
