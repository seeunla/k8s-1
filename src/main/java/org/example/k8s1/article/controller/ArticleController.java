package org.example.k8s1.article.controller;

import lombok.RequiredArgsConstructor;
import org.example.k8s1.article.entity.Article;
import org.example.k8s1.article.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {
    private final ArticleService articleService;

    @RequestMapping("/getList")
    @ResponseBody
    public List<Article> getList() {
        return articleService.getList();
    }
}
