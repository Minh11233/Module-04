package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.Impl.ProductServiceImpl;
import com.codegym.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService = new ProductServiceImpl();
    @GetMapping({"","/find"})
    public String home(Model model, @RequestParam(name = "find", required = false) String find) {
        List<Product> productList = productService.findAll();
        List<Product> foundProductList = new ArrayList<>();

        if (find != null) {
            for (Product product:productList) {
                if (product.getName().contains(find)) {
                    foundProductList.add(product);
                    break;
                }
            }
        }

        if (!foundProductList.isEmpty()) {
            model.addAttribute("products",foundProductList);
        } else {
            model.addAttribute("products", productList);
        }
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("message", "Added sucessfully!");
        return "/create";
    }

    @PostMapping("/save")
    public String save(Product product) {
        product.setId((int) (Math.random() * 10000));
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product",productService.findById(id));
        return "/edit";
    }
    @PostMapping("/update")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/view";
    }
}
