package com.zjy.service;

import com.zjy.pojo.Comment;

import java.util.List;

/**
 * @author zhaojingyu
 * @create 2021-03-03 10:43 上午
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
