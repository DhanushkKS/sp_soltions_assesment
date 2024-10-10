package org.dhanush.newswbsite.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author Dhanush
 * Created At 10/10/2024 11:46
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String author;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "news_id")
    private News news;
}
