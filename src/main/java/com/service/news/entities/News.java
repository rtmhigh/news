package com.service.news.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_news")
@AllArgsConstructor
@NoArgsConstructor
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(nullable = true)
    private String image;
    @Column(unique = true)
    private String title;
    private String subtitle;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String content;
}
