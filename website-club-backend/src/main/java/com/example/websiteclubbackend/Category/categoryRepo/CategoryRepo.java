package com.example.websiteclubbackend.Category.categoryRepo;

import com.example.websiteclubbackend.Category.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
