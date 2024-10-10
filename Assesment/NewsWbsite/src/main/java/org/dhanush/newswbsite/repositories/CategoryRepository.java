package org.dhanush.newswbsite.repositories;

import org.dhanush.newswbsite.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author Dhanush
 * Created At 10/10/2024 11:52
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {}
