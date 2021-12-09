package com.ndiaye.stockmanager.controller;

import com.ndiaye.stockmanager.entity.Category;
import com.ndiaye.stockmanager.repository.ICategoryRepository;
import com.ndiaye.stockmanager.service.ICategoryService;
import com.ndiaye.stockmanager.service.impl.CategoryServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {

    private static final Logger log = LoggerFactory.getLogger(CategoryController.class);

    private ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public String listCategories(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        return "categories/categories";
    }

    @GetMapping("/categories/new")
    public String createCategoryForm(Model model) {
        Category category = new Category();
        model.addAttribute("category", category);
        return "categories/create_category";
    }

    @PostMapping("/categories")
    public String createCategory(@ModelAttribute("category") Category category) {
        categoryService.createCategory(category);
        return "redirect:/categories";
    }
}
