package com.security.demospringsecurity.service.Impl;

import com.security.demospringsecurity.model.Category;
import com.security.demospringsecurity.repository.CategoryRepository;
import com.security.demospringsecurity.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
