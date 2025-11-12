package com.springbooteventsystem.managementsystem.Servise;

import com.springbooteventsystem.managementsystem.Model.Article;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ArticleServise {
    ArrayList<Article> articles=new ArrayList<>();

    public ArrayList<Article> getArticles(){
        return articles;
    }

    public void addArticle(Article article){
        articles.add(article);

    }
}
