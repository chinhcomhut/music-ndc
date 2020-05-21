package com.security.demospringsecurity.service;

import com.security.demospringsecurity.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {
    List<Category> findAll();
}