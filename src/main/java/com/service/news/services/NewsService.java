package com.service.news.services;

import com.service.news.entities.News;
import com.service.news.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository repository;

    public List<News> getAllNews() {
        return repository.findAll();
    }

    public void addNews(News news) {
        repository.save(news);
    }
}
