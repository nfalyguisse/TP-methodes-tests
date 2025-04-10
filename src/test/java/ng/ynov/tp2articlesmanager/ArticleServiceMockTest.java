package ng.ynov.tp2articlesmanager;

import ng.ynov.tp2articlesmanager.model.Article;
import ng.ynov.tp2articlesmanager.service.ArticleService;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ArticleServiceMockTest {

    @Test
    void testMockAddArticle() {
        // Création d’un mock du service
        ArticleService service = mock(ArticleService.class);
        Article fakeArticle = new Article(1L, "Cahier", 3.5);

        // On configure le comportement attendu
        when(service.addArticle("Cahier", 3.5)).thenReturn(fakeArticle);

        // Appel de la méthode mockée
        Article result = service.addArticle("Cahier", 3.5);

        // Vérification du résultat
        assertNotNull(result);
        assertEquals("Cahier", result.getNom());
        assertEquals(3.5, result.getPrix());
        verify(service, times(1)).addArticle("Cahier", 3.5);
    }

    @Test
    void testMockDeleteArticle() {
        ArticleService service = mock(ArticleService.class);
        when(service.deleteArticle(1L)).thenReturn(true);

        boolean deleted = service.deleteArticle(1L);

        assertTrue(deleted);
        verify(service).deleteArticle(1L);
    }
    
    @Test
    void testMockGetAllArticles() {
        ArticleService service = mock(ArticleService.class);
        List<Article> fakeList = List.of(
                new Article(1L, "Stylo", 2.0),
                new Article(2L, "Trousse", 5.0)
        );

        when(service.getAllArticles()).thenReturn(fakeList);

        List<Article> result = service.getAllArticles();

        assertEquals(2, result.size());
        assertEquals("Stylo", result.get(0).getNom());
        verify(service).getAllArticles();
    }
}
