package com.service.news.repositories;

import com.service.news.entities.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface NewsRepository extends JpaRepository<News, Long> {

//    @Modifying
//    @Query(value = "INSERT INTO tbl_news(image, title, subtitle, content) VALUES (:image, :title, :subtitle, :content)", nativeQuery = true)
//    void save(String image, String title, String subtitle, String content);
}
