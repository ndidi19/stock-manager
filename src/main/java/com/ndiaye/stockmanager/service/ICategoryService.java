package com.ndiaye.stockmanager.service;

import com.ndiaye.stockmanager.entity.Category;

import java.util.List;

public interface ICategoryService {

    public List<Category> getAllCategories();

    public Category createCategory(Category category);

    public Category getCategoryById(String categoryId);
}
