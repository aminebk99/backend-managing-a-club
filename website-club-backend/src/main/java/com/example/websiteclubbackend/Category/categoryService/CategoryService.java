package com.example.websiteclubbackend.Category.categoryService;

import com.example.websiteclubbackend.Category.category.Category;
import com.example.websiteclubbackend.Category.categoryRepo.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public List<Category> getCateg(){
        return categoryRepo.findAll();
    }
    public Category addCateg(Category category){
        return categoryRepo.save(category);
    }
    public Optional<Category> getCategId(Long id){
        return categoryRepo.findById(id);
    }
}
