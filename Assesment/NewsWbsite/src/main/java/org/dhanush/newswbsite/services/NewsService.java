package org.dhanush.newswbsite.services;

import jakarta.transaction.Transactional;
import org.dhanush.newswbsite.Entities.Category;
import org.dhanush.newswbsite.Entities.Comment;
import org.dhanush.newswbsite.Entities.News;
import org.dhanush.newswbsite.Exceptions.NewsNotFoundException;
import org.dhanush.newswbsite.repositories.CategoryRepository;
import org.dhanush.newswbsite.repositories.CommentRepository;
import org.dhanush.newswbsite.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Author Dhanush
 * Created At 10/10/2024 11:54
 */
@Service
@Transactional
public class NewsService {
    @Autowired
    private final NewsRepository newsRepository;
    @Autowired
    private final CategoryRepository categoryRepository;
    @Autowired
    private final CommentRepository commentRepository;
    public NewsService(NewsRepository newsRepository, CategoryRepository categoryRepository, CommentRepository commentRepository) {
        this.newsRepository = newsRepository;
        this.categoryRepository = categoryRepository;
        this.commentRepository = commentRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    public List<News> getNewsByCategory(int categoryId) {
        return newsRepository.findNewsByCategory(categoryId);
    }
    public News getNewsById(int newsId) {
        return newsRepository.findById(newsId).orElseThrow(() -> new NewsNotFoundException("News item with ID " + newsId + " not found."));
    }
    public void addComment(int newsId, Comment comment) {
        News news = getNewsById(newsId);
        comment.setNews(news);
        commentRepository.save(comment);
    }
    public List<Comment> getCommentsByNewsId(int newsId) {
        return commentRepository.findCommentsByNewsId(newsId);
    }
}
