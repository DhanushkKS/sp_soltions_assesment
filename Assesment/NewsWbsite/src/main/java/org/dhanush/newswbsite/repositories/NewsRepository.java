package org.dhanush.newswbsite.repositories;

import org.dhanush.newswbsite.Entities.Category;
import org.dhanush.newswbsite.Entities.Comment;
import org.dhanush.newswbsite.Entities.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author Dhanush
 * Created At 10/10/2024 11:41
 */

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {
    @Query("SELECT n FROM News n JOIN n.categories c WHERE c.id = :categoryId")
    List<News> findNewsByCategory(@Param("categoryId") int categoryId);

}
