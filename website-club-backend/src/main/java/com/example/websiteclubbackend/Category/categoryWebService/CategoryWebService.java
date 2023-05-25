package com.example.websiteclubbackend.Category.categoryWebService;

import com.example.websiteclubbackend.Category.category.Category;
import com.example.websiteclubbackend.Category.categoryService.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/category")
@CrossOrigin
public class CategoryWebService {

    private final CategoryService categoryService;

    public CategoryWebService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category>getCategory(){
        return categoryService.getCateg();
    }
    @GetMapping("/getcategid/{id}")
    public Optional<Category> getCategory(@PathVariable("id") Long id){
        return categoryService.getCategId(id);
    }
    @PostMapping
    public Category addCateg(@RequestBody Category category){
        return categoryService.addCateg(category);
    }
}
