package org.dhanush.newswbsite.controllers;

import org.dhanush.newswbsite.Entities.Category;
import org.dhanush.newswbsite.Entities.Comment;
import org.dhanush.newswbsite.Entities.News;
import org.dhanush.newswbsite.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author Dhanush
 * Created At 10/10/2024 11:39
 */

@RestController
@RequestMapping("/api/v1")
public class NewsController {
    @Autowired
    private NewsService newsService;
    @GetMapping("/categories")
    public List<Category> getCategories() {
        return newsService.getAllCategories();
    }

    @GetMapping("/categories/{categoryId}/news")
    public List<News> getNewsByCategory(@PathVariable int categoryId) {
        return newsService.getNewsByCategory(categoryId);
    }

    @GetMapping("/news/{newsId}")
    public News getNewsDetails(@PathVariable int newsId) {
        return newsService.getNewsById(newsId);
    }

    @PostMapping("/news/{newsId}/comments")
    public void addComment(@PathVariable int newsId, @RequestBody Comment comment) {
        newsService.addComment(newsId, comment);
    }

    @GetMapping("/news/{newsId}/comments")
    public List<Comment> getComments(@PathVariable int newsId) {
        return newsService.getCommentsByNewsId(newsId);
    }
}
