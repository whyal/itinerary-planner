package com.yonglun.jobtracker.controller;

import com.yonglun.jobtracker.entity.Job;
import com.yonglun.jobtracker.repository.JobRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    private final JobRepository repository;

    public HomeController(JobRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Job> getJobs() {
        return repository.findAll();
    }
}
