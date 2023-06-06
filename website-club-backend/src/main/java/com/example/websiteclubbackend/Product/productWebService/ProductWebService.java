package com.example.websiteclubbackend.Product.productWebService;

import com.example.websiteclubbackend.Product.product.Product;
import com.example.websiteclubbackend.Product.productService.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user/{iduser}/category/{idcateg}/product")
@CrossOrigin
public class ProductWebService {
    private final ProductService productService;

    public ProductWebService(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/getallproduct")
        public List<Product> getAllProduct(){
            return productService.getAllProduct();
        }

    @GetMapping("/getproducttitle")
        public Optional<Product> getProductTitle(String title){
        return productService.getProductTitle(title);
        }

        @PostMapping("/saveproduct")
        public Product saveProduct(@PathVariable("iduser") Long id_user, @PathVariable("idcateg") Long id_categ, @RequestBody Product product){
            return productService.saveProduct(id_user,id_categ,product);
        }

}
