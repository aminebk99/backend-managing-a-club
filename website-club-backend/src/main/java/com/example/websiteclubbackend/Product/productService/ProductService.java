package com.example.websiteclubbackend.Product.productService;

import com.example.websiteclubbackend.Category.category.Category;
import com.example.websiteclubbackend.Category.categoryService.CategoryService;
import com.example.websiteclubbackend.Product.product.Product;
import com.example.websiteclubbackend.Product.productRepo.ProductRepo;
import com.example.websiteclubbackend.User.user.User;
import com.example.websiteclubbackend.User.userService.UserService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepo productRepo;
    private final UserService userService;
    private final CategoryService categoryService;

    public ProductService(ProductRepo productRepo, UserService userService, CategoryService categoryService) {
        this.productRepo = productRepo;
        this.userService = userService;
        this.categoryService = categoryService;
    }


    public List<Product> getAllProduct(){
        return productRepo.findAll();
    }
    public Product saveProduct(Long id_user,Long id_categ, Product product){
        Optional<User> user = userService.getUserById(id_user);
        Optional<Category> category = categoryService.getCategId(id_categ);
        if (user.isPresent() && category.isPresent()){
            product.setUser(user.get());
            product.setCategory(category.get());
            product.setCreatedAt(LocalDateTime.now());
            return productRepo.save(product);
        }else{
            throw new IllegalArgumentException("Invalid adminId or categoryId");
        }



    }
    public Optional<Product> getProductTitle(String title){
        return Optional.ofNullable(productRepo.findByTitle(title));
    }


}
