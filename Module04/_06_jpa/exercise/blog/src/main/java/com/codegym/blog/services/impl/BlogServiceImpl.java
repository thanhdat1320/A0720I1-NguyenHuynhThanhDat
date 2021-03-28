package com.codegym.blog.services.impl;

import com.codegym.blog.models.Blog;
import com.codegym.blog.repositories.IBlogRepository;
import com.codegym.blog.services.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements IBlogService {

    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return this.iBlogRepository.findAll(pageable);
    }

    @Override
    public void save(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public void delete(int id) {
        this.iBlogRepository.deleteById(id);
    }

    @Override
    public Blog findById(int id) {
        return this.iBlogRepository.findById(id).orElse(null);
    }
}
