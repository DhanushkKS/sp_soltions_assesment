package org.dhanush.newswbsite.repositories;

import org.dhanush.newswbsite.Entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author Dhanush
 * Created At 10/10/2024 11:52
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findCommentsByNewsId(int newsId);
}
