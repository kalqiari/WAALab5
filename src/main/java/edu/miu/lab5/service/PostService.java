package edu.miu.lab5.service;

import edu.miu.lab5.entity.dto.CommentDto;
import edu.miu.lab5.entity.dto.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto> findAll();

    PostDto findById(long id);

    List<PostDto> findByTitle(String title);

    void deleteById(long id);

    void save(PostDto p);

    void update(long postId, PostDto p);

    List<PostDto> findByAuthor(String author);

    List<PostDto> findByUserId(long userId);

    PostDto findByUserIdAndId(long userId, long postId);

    void addComment(long userId, long postId, CommentDto commentDto);

    List<PostDto> findByAuthorAndTitle(String author, String title);
}
