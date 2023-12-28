package org.example.k8s1.article.service;

import lombok.RequiredArgsConstructor;
import org.example.k8s1.article.entity.Article;
import org.example.k8s1.article.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;
    public void write(String subject) {
        Article article = new Article();
        article.setSubject(subject);

        articleRepository.save(article);
    }

    public List<Article> getList() {
        return articleRepository.findAll();
    }
}
