package com.security.demospringsecurity.controller;

import com.security.demospringsecurity.model.Category;
import com.security.demospringsecurity.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 21600000)
@RestController
@RequestMapping("/api/categories")
public class CategoryController {
@Autowired
private CategoryService categoryService;


    @GetMapping
    public ResponseEntity<?> getCategory() {
        List<Category> categories = categoryService.findAll();
        return new  ResponseEntity<>(categories, HttpStatus.OK);
    }
}