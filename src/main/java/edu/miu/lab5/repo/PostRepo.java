package edu.miu.lab5.repo;

import edu.miu.lab5.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends CrudRepository<Post, Long> {
    List<Post> findAll();
    List<Post> findByAuthor(String author);

    List<Post> findByTitle(String title);

    List<Post> findByUserId(long userId);

    Post findByUserIdAndId(long userId, long postId);

    List<Post> findByAuthorAndTitle(String author, String title);
}
