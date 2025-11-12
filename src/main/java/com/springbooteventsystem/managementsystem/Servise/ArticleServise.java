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


    public boolean update(int index , Article article){
        if (index>0&&index<=articles.size()){
            articles.set(index, article);
            return true;
        }
        return false;
    }
    public boolean deleteArticle(int index ){
        if (index>0&&index<=articles.size()){
            articles.remove(index);
            return true;
        }
        return false;
    }

    public boolean publishArticle(int index , Article  article){

        if (index<0&&index>articles.size()){
            return true;

        }
        return false;
    }
    public ArrayList<Article> getPublishedArticles(){
        for (Article ae : articles){
            if (articles.isEmpty()){
                articles.add(ae);
            }

        }
        return getPublishedArticles();
    }

    public ArrayList<Article> getByCategory(String category) {
        ArrayList<Article> result = new ArrayList<>();
        for (Article article : articles) {
            if (article.getCategory().equalsIgnoreCase(category)) {
                result.add(article);
            }
        }
        return result;
    }

    
}
