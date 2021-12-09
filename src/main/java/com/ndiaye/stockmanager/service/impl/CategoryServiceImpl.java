package com.ndiaye.stockmanager.service.impl;

import com.ndiaye.stockmanager.entity.Category;
import com.ndiaye.stockmanager.repository.ICategoryRepository;
import com.ndiaye.stockmanager.service.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    private static final String CAT_CODE_PREFIX = "CAT_";

    private ICategoryRepository categoryRepository;

    public CategoryServiceImpl(ICategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category createCategory(Category category) {
        return setCodeAndSave(category);
    }

    @Override
    public Category getCategoryById(String categoryId) {
        return categoryRepository.getById(Long.parseLong(categoryId));
    }

    @Override
    public Category getCategoryById(Long categoryId) {
        return categoryRepository.getById(categoryId);
    }

    @Override
    public Category updateCategory(Category category) {
        return setCodeAndSave(category);
    }

    private Category setCodeAndSave(Category category) {
        category.setCode(CAT_CODE_PREFIX + category.getLabel().trim().replaceAll(" ", "_").toUpperCase());
        return categoryRepository.save(category);
    }
}
