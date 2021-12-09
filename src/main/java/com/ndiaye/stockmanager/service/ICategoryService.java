package com.ndiaye.stockmanager.service;

import com.ndiaye.stockmanager.entity.Category;

import java.util.List;

public interface ICategoryService {

    public List<Category> getAllCategories();

    public Category createCategory(Category category);

    public Category getCategoryById(String categoryId);

    public Category getCategoryById(Long categoryId);

    public Category updateCategory(Category category);

    public void deleteCategoryById(Long id);
}
