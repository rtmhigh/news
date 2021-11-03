package com.service.news.controllers;

import com.service.news.entities.News;
import com.service.news.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/serviceManagement/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class NewsController {

    @Autowired
    private NewsService service;

    @GetMapping
    public ResponseEntity getAllNews() {
        List<News> result = service.getAllNews();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
