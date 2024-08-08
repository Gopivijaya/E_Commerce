package vijaya.com.e_commerce.controllers;


import org.springframework.web.bind.annotation.*;
import vijaya.com.e_commerce.dtos.GetProductDto;
import vijaya.com.e_commerce.models.Product;
import vijaya.com.e_commerce.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public @ResponseBody GetProductDto getProductById(
            @PathVariable("id") Long id) throws Exception {
        return productService.getProductById(id);
    }

    @GetMapping("")
    public @ResponseBody List<GetProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

//    @RequestBody Product product -> Converts the received json to a Product java object
    @PostMapping("")
    public String createProduct(@RequestBody Product product) {
        System.out.println(product.getCategory());
        System.out.println(product.getTitle());
        System.out.println(product.getPrice());
        return "Product created.";
    }

}
