package ng.ynov.tp2articlesmanager.service;

import ng.ynov.tp2articlesmanager.model.Article;

public abstract class ArticleService {

    public abstract Article addArticle(String nom, double prix);

    public abstract Article deleteArticle(long id);

    public abstract boolean getAllArticles();
}
