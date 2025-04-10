package ng.ynov.tp2articlesmanager.service;

import java.util.List;

import ng.ynov.tp2articlesmanager.model.Article;

public abstract class ArticleService {

    public abstract Article addArticle(String nom, double prix);

    public abstract boolean deleteArticle(long id);

    public abstract List<Article> getAllArticles();
}
